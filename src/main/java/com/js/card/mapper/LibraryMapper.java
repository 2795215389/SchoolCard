package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.Library;
import com.js.card.api.model.LibraryExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface LibraryMapper {
    @SelectProvider(type=LibrarySqlProvider.class, method="countByExample")
    long countByExample(LibraryExample example);

    @DeleteProvider(type=LibrarySqlProvider.class, method="deleteByExample")
    int deleteByExample(LibraryExample example);


    //存储过程
    //借书
    @Select({
            "call CARDMS.BORROW_BOOK(#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputBookName,jdbcType=VARCHAR,mode=IN})"
    })
    @Options(statementType = StatementType.CALLABLE)
    void borrowBook(String inputSno,String inputBookName);

    //南区借书
    @Select({
            "call CARDMS.BORROW_BOOK@WEST_SOUTH_DBLINK(#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputBookName,jdbcType=VARCHAR,mode=IN})"
    })
    @Options(statementType = StatementType.CALLABLE)
    void borrowSouth(String inputSno,String inputBookName);

    //还书
    @Select({
            "call CARDMS.RETURN_BOOK(#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputBookName,jdbcType=VARCHAR,mode=IN})"
    })
    @Options(statementType = StatementType.CALLABLE)
    void returnBook(String inputSno,String inputBookName);


    //南区还书
    @Select({
            "call CARDMS.RETURN_BOOK@WEST_SOUTH_DBLINK(#{inputSno,jdbcType=VARCHAR,mode=IN},#{inputBookName,jdbcType=VARCHAR,mode=IN})"
    })
    @Options(statementType = StatementType.CALLABLE)
    void returnSouth(String inputSno,String inputBookName);


    @Delete({
        "delete from LIBRARY",
        "where BOOK_NO = #{bookNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String bookNo);

    @Insert({
        "insert into LIBRARY (BOOK_NO, BOOK_NAME, ",
        "BOOK_STOCK)",
        "values (#{bookNo,jdbcType=VARCHAR}, #{bookName,jdbcType=VARCHAR}, ",
        "#{bookStock,jdbcType=VARCHAR})"
    })
    int insert(Library record);

    @InsertProvider(type=LibrarySqlProvider.class, method="insertSelective")
    int insertSelective(Library record);

    @SelectProvider(type=LibrarySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="BOOK_NO", property="bookNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BOOK_NAME", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BOOK_STOCK", property="bookStock", jdbcType=JdbcType.VARCHAR)
    })
    List<Library> selectByExample(LibraryExample example);

    @Select({
        "select",
        "BOOK_NO, BOOK_NAME, BOOK_STOCK",
        "from LIBRARY",
        "where BOOK_NO = #{bookNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="BOOK_NO", property="bookNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="BOOK_NAME", property="bookName", jdbcType=JdbcType.VARCHAR),
        @Result(column="BOOK_STOCK", property="bookStock", jdbcType=JdbcType.VARCHAR)
    })
    Library selectByPrimaryKey(String bookNo);

    @UpdateProvider(type=LibrarySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Library record, @Param("example") LibraryExample example);

    @UpdateProvider(type=LibrarySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Library record, @Param("example") LibraryExample example);

    @UpdateProvider(type=LibrarySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Library record);

    @Update({
        "update LIBRARY",
        "set BOOK_NAME = #{bookName,jdbcType=VARCHAR},",
          "BOOK_STOCK = #{bookStock,jdbcType=VARCHAR}",
        "where BOOK_NO = #{bookNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Library record);
}