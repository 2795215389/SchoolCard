package com.js.card.mapper;

import java.util.List;
import java.util.Map;
import com.js.card.api.model.CardManage;
import com.js.card.api.model.CardManageExample.Criteria;
import com.js.card.api.model.CardManageExample.Criterion;
import com.js.card.api.model.CardManageExample;
import org.apache.ibatis.jdbc.SQL;

public class CardManageSqlProvider {

    public String countByExample(CardManageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("CARD_MANAGE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CardManageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("CARD_MANAGE");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CardManage record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("CARD_MANAGE");
        
        if (record.getCardNo() != null) {
            sql.VALUES("CARD_NO", "#{cardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSno() != null) {
            sql.VALUES("SNO", "#{sno,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("BALANCE", "#{balance,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CardManageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CARD_NO");
        } else {
            sql.SELECT("CARD_NO");
        }
        sql.SELECT("SNO");
        sql.SELECT("BALANCE");
        sql.FROM("CARD_MANAGE");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CardManage record = (CardManage) parameter.get("record");
        CardManageExample example = (CardManageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("CARD_MANAGE");
        
        if (record.getCardNo() != null) {
            sql.SET("CARD_NO = #{record.cardNo,jdbcType=VARCHAR}");
        }
        
        if (record.getSno() != null) {
            sql.SET("SNO = #{record.sno,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("BALANCE = #{record.balance,jdbcType=DECIMAL}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("CARD_MANAGE");
        
        sql.SET("CARD_NO = #{record.cardNo,jdbcType=VARCHAR}");
        sql.SET("SNO = #{record.sno,jdbcType=VARCHAR}");
        sql.SET("BALANCE = #{record.balance,jdbcType=DECIMAL}");
        
        CardManageExample example = (CardManageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CardManage record) {
        SQL sql = new SQL();
        sql.UPDATE("CARD_MANAGE");
        
        if (record.getSno() != null) {
            sql.SET("SNO = #{sno,jdbcType=VARCHAR}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("BALANCE = #{balance,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("CARD_NO = #{cardNo,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CardManageExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}