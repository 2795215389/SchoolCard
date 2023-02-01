package com.js.card.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.js.card.api.model.Dishes;
import com.js.card.api.model.DishesExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface DishesMapper {
    @SelectProvider(type=DishesSqlProvider.class, method="countByExample")
    long countByExample(DishesExample example);

    @DeleteProvider(type=DishesSqlProvider.class, method="deleteByExample")
    int deleteByExample(DishesExample example);



    //南区就餐
    @Select({
            "call CARDMS.DINING_FOOD@WEST_SOUTH_DBLINK(#{inputWname,jdbcType=VARCHAR,mode=IN}," +
                    "#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputDish,jdbcType=VARCHAR,mode=IN}," +
                    "#{inNum,jdbcType=DECIMAL,mode=IN})"
    })
    @Options(statementType = StatementType.CALLABLE)
    void eatSouth(String inputWname, String inputSno, String inputDish, BigDecimal inNum);

    @Insert({
        "insert into DISHES (DISH_NO, DISH_NAME, ",
        "DISH_PRICE, DISH_STOCK, ",
        "WINDOW_NO)",
        "values (#{dishNo,jdbcType=VARCHAR}, #{dishName,jdbcType=VARCHAR}, ",
        "#{dishPrice,jdbcType=DECIMAL}, #{dishStock,jdbcType=DECIMAL}, ",
        "#{windowNo,jdbcType=VARCHAR})"
    })
    int insert(Dishes record);

    @InsertProvider(type=DishesSqlProvider.class, method="insertSelective")
    int insertSelective(Dishes record);



    //通过菜名找到菜对象
    @Select({
            "select",
            "DISH_NO, DISH_NAME, DISH_PRICE, DISH_STOCK, WINDOW_NO",
            "from DISHES",
            "where DISH_NAME = #{dishName,jdbcType=VARCHAR}",
            "and WINDOW_NO=#{wno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="DISH_NO", property="dishNo", jdbcType=JdbcType.VARCHAR),
            @Result(column="DISH_NAME", property="dishName", jdbcType=JdbcType.VARCHAR),
            @Result(column="DISH_PRICE", property="dishPrice", jdbcType=JdbcType.DECIMAL),
            @Result(column="DISH_STOCK", property="dishStock", jdbcType=JdbcType.DECIMAL),
            @Result(column="WINDOW_NO", property="windowNo", jdbcType=JdbcType.VARCHAR)
    })
    Dishes getDishByName(String dishName,String wno);




    @SelectProvider(type=DishesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DISH_NO", property="dishNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DISH_NAME", property="dishName", jdbcType=JdbcType.VARCHAR),
        @Result(column="DISH_PRICE", property="dishPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="DISH_STOCK", property="dishStock", jdbcType=JdbcType.DECIMAL),
        @Result(column="WINDOW_NO", property="windowNo", jdbcType=JdbcType.VARCHAR)
    })
    List<Dishes> selectByExample(DishesExample example);

    @UpdateProvider(type=DishesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Dishes record, @Param("example") DishesExample example);

    @UpdateProvider(type=DishesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Dishes record, @Param("example") DishesExample example);


    @Update({
            "update DISHES",
            "set DISH_STOCK = DISH_STOCK-#{descAmount,jdbcType=DECIMAL}",
            "where DISH_NAME = #{dishName,jdbcType=VARCHAR}"
    })
    int updateDishStock(String dishName,Integer descAmount);
}