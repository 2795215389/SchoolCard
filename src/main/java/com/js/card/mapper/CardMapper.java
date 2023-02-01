package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.*;
import com.js.card.api.model.CardExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface CardMapper {
    @SelectProvider(type=CardSqlProvider.class, method="countByExample")
    long countByExample(CardExample example);

    @DeleteProvider(type=CardSqlProvider.class, method="deleteByExample")
    int deleteByExample(CardExample example);

    @Delete({
        "delete from CARD",
        "where SNO = #{sno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String sno);

    @Insert({
        "insert into CARD (SNO, SNAME, ",
        "SAREA, SDEPART, ",
        "SCLASS)",
        "values (#{sno,jdbcType=VARCHAR}, #{sname,jdbcType=VARCHAR}, ",
        "#{sarea,jdbcType=VARCHAR}, #{sdepart,jdbcType=VARCHAR}, ",
        "#{sclass,jdbcType=VARCHAR})"
    })
    int insert(Card record);

    @InsertProvider(type=CardSqlProvider.class, method="insertSelective")
    int insertSelective(Card record);

    @SelectProvider(type=CardSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SNAME", property="sname", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAREA", property="sarea", jdbcType=JdbcType.VARCHAR),
        @Result(column="SDEPART", property="sdepart", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCLASS", property="sclass", jdbcType=JdbcType.VARCHAR)
    })
    List<Card> selectByExample(CardExample example);

    @Select({
        "select",
        "SNO, SNAME, SAREA, SDEPART, SCLASS",
        "from CARD",
        "where SNO = #{sno,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SNAME", property="sname", jdbcType=JdbcType.VARCHAR),
        @Result(column="SAREA", property="sarea", jdbcType=JdbcType.VARCHAR),
        @Result(column="SDEPART", property="sdepart", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCLASS", property="sclass", jdbcType=JdbcType.VARCHAR)
    })
    Card selectByPrimaryKey(String sno);

    @UpdateProvider(type=CardSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    @UpdateProvider(type=CardSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    @UpdateProvider(type=CardSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Card record);

    @Update({
        "update CARD",
        "set SNAME = #{sname,jdbcType=VARCHAR},",
          "SAREA = #{sarea,jdbcType=VARCHAR},",
          "SDEPART = #{sdepart,jdbcType=VARCHAR},",
          "SCLASS = #{sclass,jdbcType=VARCHAR}",
        "where SNO = #{sno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Card record);
}