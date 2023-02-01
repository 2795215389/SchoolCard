package com.js.card.mapper;

import java.util.List;
import java.util.Map;
import com.js.card.api.model.Card;
import com.js.card.api.model.CardExample.Criteria;
import com.js.card.api.model.CardExample.Criterion;
import com.js.card.api.model.CardExample;
import org.apache.ibatis.jdbc.SQL;

public class CardSqlProvider {

    public String countByExample(CardExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("CARD");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CardExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("CARD");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Card record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("CARD");
        
        if (record.getSno() != null) {
            sql.VALUES("SNO", "#{sno,jdbcType=VARCHAR}");
        }
        
        if (record.getSname() != null) {
            sql.VALUES("SNAME", "#{sname,jdbcType=VARCHAR}");
        }
        
        if (record.getSarea() != null) {
            sql.VALUES("SAREA", "#{sarea,jdbcType=VARCHAR}");
        }
        
        if (record.getSdepart() != null) {
            sql.VALUES("SDEPART", "#{sdepart,jdbcType=VARCHAR}");
        }
        
        if (record.getSclass() != null) {
            sql.VALUES("SCLASS", "#{sclass,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CardExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("SNO");
        } else {
            sql.SELECT("SNO");
        }
        sql.SELECT("SNAME");
        sql.SELECT("SAREA");
        sql.SELECT("SDEPART");
        sql.SELECT("SCLASS");
        sql.FROM("CARD");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Card record = (Card) parameter.get("record");
        CardExample example = (CardExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("CARD");
        
        if (record.getSno() != null) {
            sql.SET("SNO = #{record.sno,jdbcType=VARCHAR}");
        }
        
        if (record.getSname() != null) {
            sql.SET("SNAME = #{record.sname,jdbcType=VARCHAR}");
        }
        
        if (record.getSarea() != null) {
            sql.SET("SAREA = #{record.sarea,jdbcType=VARCHAR}");
        }
        
        if (record.getSdepart() != null) {
            sql.SET("SDEPART = #{record.sdepart,jdbcType=VARCHAR}");
        }
        
        if (record.getSclass() != null) {
            sql.SET("SCLASS = #{record.sclass,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("CARD");
        
        sql.SET("SNO = #{record.sno,jdbcType=VARCHAR}");
        sql.SET("SNAME = #{record.sname,jdbcType=VARCHAR}");
        sql.SET("SAREA = #{record.sarea,jdbcType=VARCHAR}");
        sql.SET("SDEPART = #{record.sdepart,jdbcType=VARCHAR}");
        sql.SET("SCLASS = #{record.sclass,jdbcType=VARCHAR}");
        
        CardExample example = (CardExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Card record) {
        SQL sql = new SQL();
        sql.UPDATE("CARD");
        
        if (record.getSname() != null) {
            sql.SET("SNAME = #{sname,jdbcType=VARCHAR}");
        }
        
        if (record.getSarea() != null) {
            sql.SET("SAREA = #{sarea,jdbcType=VARCHAR}");
        }
        
        if (record.getSdepart() != null) {
            sql.SET("SDEPART = #{sdepart,jdbcType=VARCHAR}");
        }
        
        if (record.getSclass() != null) {
            sql.SET("SCLASS = #{sclass,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("SNO = #{sno,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CardExample example, boolean includeExamplePhrase) {
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