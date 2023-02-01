package com.js.card.mapper;

import java.util.List;
import java.util.Map;
import com.js.card.api.model.Window;
import com.js.card.api.model.WindowExample.Criteria;
import com.js.card.api.model.WindowExample.Criterion;
import com.js.card.api.model.WindowExample;
import org.apache.ibatis.jdbc.SQL;

public class WindowSqlProvider {

    public String countByExample(WindowExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("WINDOW");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(WindowExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("WINDOW");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Window record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("WINDOW");
        
        if (record.getWindowNo() != null) {
            sql.VALUES("WINDOW_NO", "#{windowNo,jdbcType=VARCHAR}");
        }
        
        if (record.getWindowName() != null) {
            sql.VALUES("WINDOW_NAME", "#{windowName,jdbcType=VARCHAR}");
        }
        
        if (record.getCno() != null) {
            sql.VALUES("CNO", "#{cno,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(WindowExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("WINDOW_NO");
        } else {
            sql.SELECT("WINDOW_NO");
        }
        sql.SELECT("WINDOW_NAME");
        sql.SELECT("CNO");
        sql.FROM("WINDOW");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Window record = (Window) parameter.get("record");
        WindowExample example = (WindowExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("WINDOW");
        
        if (record.getWindowNo() != null) {
            sql.SET("WINDOW_NO = #{record.windowNo,jdbcType=VARCHAR}");
        }
        
        if (record.getWindowName() != null) {
            sql.SET("WINDOW_NAME = #{record.windowName,jdbcType=VARCHAR}");
        }
        
        if (record.getCno() != null) {
            sql.SET("CNO = #{record.cno,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("WINDOW");
        
        sql.SET("WINDOW_NO = #{record.windowNo,jdbcType=VARCHAR}");
        sql.SET("WINDOW_NAME = #{record.windowName,jdbcType=VARCHAR}");
        sql.SET("CNO = #{record.cno,jdbcType=VARCHAR}");
        
        WindowExample example = (WindowExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, WindowExample example, boolean includeExamplePhrase) {
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