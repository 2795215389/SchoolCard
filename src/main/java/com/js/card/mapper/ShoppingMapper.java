package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.Shopping;
import com.js.card.api.model.ShoppingExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ShoppingMapper {
    @SelectProvider(type=ShoppingSqlProvider.class, method="countByExample")
    long countByExample(ShoppingExample example);

    @DeleteProvider(type=ShoppingSqlProvider.class, method="deleteByExample")
    int deleteByExample(ShoppingExample example);




    @Insert({
        "insert into SHOPPING (SNO, GOOD_NAME, ",
        "QUANTITY, BUY_TIME)",
        "values (#{sno,jdbcType=VARCHAR}, #{goodName,jdbcType=VARCHAR}, ",
        "#{quantity,jdbcType=DECIMAL}, #{buyTime,jdbcType=TIMESTAMP})"
    })
    int insert(Shopping record);

    @InsertProvider(type=ShoppingSqlProvider.class, method="insertSelective")
    int insertSelective(Shopping record);

    @SelectProvider(type=ShoppingSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="GOOD_NAME", property="goodName", jdbcType=JdbcType.VARCHAR),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.DECIMAL),
        @Result(column="BUY_TIME", property="buyTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Shopping> selectByExample(ShoppingExample example);

    @UpdateProvider(type=ShoppingSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Shopping record, @Param("example") ShoppingExample example);

    @UpdateProvider(type=ShoppingSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Shopping record, @Param("example") ShoppingExample example);
}