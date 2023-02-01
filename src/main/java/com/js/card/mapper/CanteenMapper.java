package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.Canteen;
import com.js.card.api.model.CanteenExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CanteenMapper {
    @SelectProvider(type=CanteenSqlProvider.class, method="countByExample")
    long countByExample(CanteenExample example);

    @DeleteProvider(type=CanteenSqlProvider.class, method="deleteByExample")
    int deleteByExample(CanteenExample example);

    @Delete({
        "delete from CANTEEN",
        "where CNO = #{cno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String cno);

    @Insert({
        "insert into CANTEEN (CNO, CNAME, ",
        "CLOC)",
        "values (#{cno,jdbcType=VARCHAR}, #{cname,jdbcType=VARCHAR}, ",
        "#{cloc,jdbcType=VARCHAR})"
    })
    int insert(Canteen record);

    @InsertProvider(type=CanteenSqlProvider.class, method="insertSelective")
    int insertSelective(Canteen record);

    @SelectProvider(type=CanteenSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CNO", property="cno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CNAME", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLOC", property="cloc", jdbcType=JdbcType.VARCHAR)
    })
    List<Canteen> selectByExample(CanteenExample example);

    @Select({
        "select",
        "CNO, CNAME, CLOC",
        "from CANTEEN",
        "where CNO = #{cno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CNO", property="cno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CNAME", property="cname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLOC", property="cloc", jdbcType=JdbcType.VARCHAR)
    })
    Canteen selectByPrimaryKey(String cno);

    @UpdateProvider(type=CanteenSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Canteen record, @Param("example") CanteenExample example);

    @UpdateProvider(type=CanteenSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Canteen record, @Param("example") CanteenExample example);

    @UpdateProvider(type=CanteenSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Canteen record);

    @Update({
        "update CANTEEN",
        "set CNAME = #{cname,jdbcType=VARCHAR},",
          "CLOC = #{cloc,jdbcType=VARCHAR}",
        "where CNO = #{cno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Canteen record);
}