package com.js.card.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.js.card.api.model.Goods;
import com.js.card.api.model.GoodsExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface GoodsMapper {
    @SelectProvider(type=GoodsSqlProvider.class, method="countByExample")
    long countByExample(GoodsExample example);

    @DeleteProvider(type=GoodsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GoodsExample example);

    @Select("{call CARDMS.BUY_GOODS@WEST_SOUTH_DBLINK(#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputGname,jdbcType=VARCHAR,mode=IN},#{inputNum,jdbcType=DECIMAL,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void buySouth(String inputSno,String inputGname,BigDecimal inputNum);

    @Delete({
        "delete from GOODS",
        "where GOOD_NO = #{goodNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String goodNo);

    @Insert({
        "insert into GOODS (GOOD_NO, GOOD_NAME, ",
        "GOOD_PRICE, GOOD_STOCK)",
        "values (#{goodNo,jdbcType=VARCHAR}, #{goodName,jdbcType=VARCHAR}, ",
        "#{goodPrice,jdbcType=DECIMAL}, #{goodStock,jdbcType=DECIMAL})"
    })
    int insert(Goods record);

    @InsertProvider(type=GoodsSqlProvider.class, method="insertSelective")
    int insertSelective(Goods record);

    @SelectProvider(type=GoodsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="GOOD_NO", property="goodNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="GOOD_NAME", property="goodName", jdbcType=JdbcType.VARCHAR),
        @Result(column="GOOD_PRICE", property="goodPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="GOOD_STOCK", property="goodStock", jdbcType=JdbcType.DECIMAL)
    })
    List<Goods> selectByExample(GoodsExample example);

    @Select({
        "select",
        "GOOD_NO, GOOD_NAME, GOOD_PRICE, GOOD_STOCK",
        "from GOODS",
        "where GOOD_NO = #{goodNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="GOOD_NO", property="goodNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="GOOD_NAME", property="goodName", jdbcType=JdbcType.VARCHAR),
        @Result(column="GOOD_PRICE", property="goodPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="GOOD_STOCK", property="goodStock", jdbcType=JdbcType.DECIMAL)
    })
    Goods selectByPrimaryKey(String goodNo);


    @Select({
            "select",
            "GOOD_NO, GOOD_NAME, GOOD_PRICE, GOOD_STOCK",
            "from GOODS@WEST_SOUTH_DBLINK"
    })
    @Results({
            @Result(column="GOOD_NO", property="goodNo", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="GOOD_NAME", property="goodName", jdbcType=JdbcType.VARCHAR),
            @Result(column="GOOD_PRICE", property="goodPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="GOOD_STOCK", property="goodStock", jdbcType=JdbcType.DECIMAL)
    })
    List<Goods> getSouthGoods();



    @Select({
            "select",
            "GOOD_NO, GOOD_NAME, GOOD_PRICE, GOOD_STOCK",
            "from GOODS",
            "where GOOD_NAME = #{goodName,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="GOOD_NO", property="goodNo", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="GOOD_NAME", property="goodName", jdbcType=JdbcType.VARCHAR),
            @Result(column="GOOD_PRICE", property="goodPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="GOOD_STOCK", property="goodStock", jdbcType=JdbcType.DECIMAL)
    })
    Goods selectByName(String goodName);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    @UpdateProvider(type=GoodsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Goods record);

    @Update({
        "update GOODS",
        "set GOOD_NAME = #{goodName,jdbcType=VARCHAR},",
          "GOOD_PRICE = #{goodPrice,jdbcType=DECIMAL},",
          "GOOD_STOCK = #{goodStock,jdbcType=DECIMAL}",
        "where GOOD_NO = #{goodNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Goods record);


    @Update({
            "update GOODS",
            "set GOOD_STOCK = GOOD_STOCK-#{descAmount,jdbcType=DECIMAL}",
            "where GOOD_NAME = #{goodName,jdbcType=VARCHAR}"
    })
    int updateShopStock(String goodName, BigDecimal descAmount);
}