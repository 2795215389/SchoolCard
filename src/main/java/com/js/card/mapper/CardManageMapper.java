package com.js.card.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.js.card.api.model.CardManage;
import com.js.card.api.model.CardManageExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface CardManageMapper {
    @SelectProvider(type=CardManageSqlProvider.class, method="countByExample")
    long countByExample(CardManageExample example);

    @DeleteProvider(type=CardManageSqlProvider.class, method="deleteByExample")
    int deleteByExample(CardManageExample example);


    @Select("{call CARDMS.CARD_REGISTER(#{inputSno,jdbcType=VARCHAR,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void cardRegister(String inputSno);


    @Select("{call CARDMS.WS_CARD(#{inputSno,jdbcType=VARCHAR,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void wsCard(String inputSno);

    @Select("{call CARDMS.WS_BACK(#{inputSno,jdbcType=VARCHAR,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void wsBack(String inputSno);


    @Select("{call CARDMS.CARD_RECHARGE(#{inputSno,jdbcType=VARCHAR,mode=IN}," +
            "#{inAdd,jdbcType=DECIMAL,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void cardRecharge(String inputSno, BigDecimal inAdd);


    @Select("{call CARDMS.CARD_REPLACE(#{inputSno,jdbcType=VARCHAR,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void cardReplace(String inputSno);

    @Select("{call CARDMS.CARD_DELETE(#{inputSno,jdbcType=VARCHAR,mode=IN})}")
    @Options(statementType = StatementType.CALLABLE)
    void cardDelete(String inputSno);

    @Delete({
        "delete from CARD_MANAGE",
        "where CARD_NO = #{cardNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String cardNo);

    @Insert({
        "insert into CARD_MANAGE (CARD_NO, SNO, ",
        "BALANCE)",
        "values (#{cardNo,jdbcType=VARCHAR}, #{sno,jdbcType=VARCHAR}, ",
        "#{balance,jdbcType=DECIMAL})"
    })
    int insert(CardManage record);

    @InsertProvider(type=CardManageSqlProvider.class, method="insertSelective")
    int insertSelective(CardManage record);

    @SelectProvider(type=CardManageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="BALANCE", property="balance", jdbcType=JdbcType.DECIMAL)
    })
    List<CardManage> selectByExample(CardManageExample example);

    @Select({
        "select",
        "CARD_NO, SNO, BALANCE",
        "from CARD_MANAGE",
        "where CARD_NO = #{cardNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="BALANCE", property="balance", jdbcType=JdbcType.DECIMAL)
    })
    CardManage selectByPrimaryKey(String cardNo);



    @Select({
            "select",
            "CARD_NO, SNO, BALANCE",
            "from CARD_MANAGE@WEST_SOUTH_DBLINK"
    })
    @Results({
            @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
            @Result(column="BALANCE", property="balance", jdbcType=JdbcType.DECIMAL)
    })
    List<CardManage> getAllSouth();

    @Select({
            "select",
            "CARD_NO, SNO, BALANCE",
            "from CARD_MANAGE",
            "where SNO = #{sno,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="CARD_NO", property="cardNo", jdbcType=JdbcType.VARCHAR, id=true),
            @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
            @Result(column="BALANCE", property="balance", jdbcType=JdbcType.DECIMAL)
    })
    CardManage selectBySno(String sno);


    //根据学号查余额
    @Select({
            "select",
            "CARD_NO, SNO, BALANCE",
            "from CARD_MANAGE",
            "where SNO = #{sno,jdbcType=VARCHAR}"
    })
    @Result(column="BALANCE", property="balance", jdbcType=JdbcType.DOUBLE)
    Double selectBalanceBySno(String sno);

    @UpdateProvider(type=CardManageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CardManage record, @Param("example") CardManageExample example);

    @UpdateProvider(type=CardManageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CardManage record, @Param("example") CardManageExample example);

    @UpdateProvider(type=CardManageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CardManage record);

    @Update({
        "update CARD_MANAGE",
        "set SNO = #{sno,jdbcType=VARCHAR},",
          "BALANCE = #{balance,jdbcType=DECIMAL}",
        "where CARD_NO = #{cardNo,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(CardManage record);


    @Update({
            "update CARD_MANAGE",
            "set BALANCE = BALANCE-#{amount,jdbcType=DECIMAL}",
            "where SNO = #{Sno,jdbcType=VARCHAR}"
    })
    int updateBalance(String Sno,BigDecimal amount);
}