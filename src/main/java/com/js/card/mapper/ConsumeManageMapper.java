package com.js.card.mapper;

import java.util.List;
import com.js.card.api.model.ConsumeManage;
import com.js.card.api.model.ConsumeManageExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface ConsumeManageMapper {
    @SelectProvider(type=ConsumeManageSqlProvider.class, method="countByExample")
    long countByExample(ConsumeManageExample example);

    @DeleteProvider(type=ConsumeManageSqlProvider.class, method="deleteByExample")
    int deleteByExample(ConsumeManageExample example);

    @Insert({
        "insert into CONSUME_MANAGE (SNO, BEHAVE, ",
        "AMOUNT, CONSUME_TIME)",
        "values (#{sno,jdbcType=VARCHAR}, #{behave,jdbcType=VARCHAR}, ",
        "#{amount,jdbcType=DECIMAL}, #{consumeTime,jdbcType=TIMESTAMP})"
    })
    int insert(ConsumeManage record);

    @InsertProvider(type=ConsumeManageSqlProvider.class, method="insertSelective")
    int insertSelective(ConsumeManage record);

    @SelectProvider(type=ConsumeManageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SNO", property="sno", jdbcType=JdbcType.VARCHAR),
        @Result(column="BEHAVE", property="behave", jdbcType=JdbcType.VARCHAR),
        @Result(column="AMOUNT", property="amount", jdbcType=JdbcType.DECIMAL),
        @Result(column="CONSUME_TIME", property="consumeTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ConsumeManage> selectByExample(ConsumeManageExample example);

    @UpdateProvider(type=ConsumeManageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ConsumeManage record, @Param("example") ConsumeManageExample example);

    @UpdateProvider(type=ConsumeManageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ConsumeManage record, @Param("example") ConsumeManageExample example);
}