package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.Window;
import com.js.card.api.model.WindowExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface WindowMapper {
    @SelectProvider(type=WindowSqlProvider.class, method="countByExample")
    long countByExample(WindowExample example);

    @DeleteProvider(type=WindowSqlProvider.class, method="deleteByExample")
    int deleteByExample(WindowExample example);

    @Insert({
        "insert into WINDOW (WINDOW_NO, WINDOW_NAME, ",
        "CNO)",
        "values (#{windowNo,jdbcType=VARCHAR}, #{windowName,jdbcType=VARCHAR}, ",
        "#{cno,jdbcType=VARCHAR})"
    })
    int insert(Window record);

    @InsertProvider(type=WindowSqlProvider.class, method="insertSelective")
    int insertSelective(Window record);



    @Select({
            "select",
            "WINDOW_NO, WINDOW_NAME, CNO",
            "FROM WINDOW",
            "WHERE WINDOW_NAME = #{windowName,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="WINDOW_NO", property="windowNo", jdbcType=JdbcType.VARCHAR),
            @Result(column="WINDOW_NAME", property="windowName", jdbcType=JdbcType.VARCHAR),
            @Result(column="CNO", property="cno", jdbcType=JdbcType.VARCHAR)
    })
    Window selectWindowByName(String wname);


    @SelectProvider(type=WindowSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="WINDOW_NO", property="windowNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="WINDOW_NAME", property="windowName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CNO", property="cno", jdbcType=JdbcType.VARCHAR)
    })
    List<Window> selectByExample(WindowExample example);



    @UpdateProvider(type=WindowSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Window record, @Param("example") WindowExample example);

    @UpdateProvider(type=WindowSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Window record, @Param("example") WindowExample example);
}