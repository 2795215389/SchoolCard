package com.js.card.mapper;

import java.util.List;
import java.util.Map;
import com.js.card.api.model.Library;
import com.js.card.api.model.LibraryExample.Criteria;
import com.js.card.api.model.LibraryExample.Criterion;
import com.js.card.api.model.LibraryExample;
import org.apache.ibatis.jdbc.SQL;

public class LibrarySqlProvider {

    public String countByExample(LibraryExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("LIBRARY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(LibraryExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("LIBRARY");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Library record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("LIBRARY");
        
        if (record.getBookNo() != null) {
            sql.VALUES("BOOK_NO", "#{bookNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBookName() != null) {
            sql.VALUES("BOOK_NAME", "#{bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookStock() != null) {
            sql.VALUES("BOOK_STOCK", "#{bookStock,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(LibraryExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("BOOK_NO");
        } else {
            sql.SELECT("BOOK_NO");
        }
        sql.SELECT("BOOK_NAME");
        sql.SELECT("BOOK_STOCK");
        sql.FROM("LIBRARY");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Library record = (Library) parameter.get("record");
        LibraryExample example = (LibraryExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("LIBRARY");
        
        if (record.getBookNo() != null) {
            sql.SET("BOOK_NO = #{record.bookNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBookName() != null) {
            sql.SET("BOOK_NAME = #{record.bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookStock() != null) {
            sql.SET("BOOK_STOCK = #{record.bookStock,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("LIBRARY");
        
        sql.SET("BOOK_NO = #{record.bookNo,jdbcType=VARCHAR}");
        sql.SET("BOOK_NAME = #{record.bookName,jdbcType=VARCHAR}");
        sql.SET("BOOK_STOCK = #{record.bookStock,jdbcType=VARCHAR}");
        
        LibraryExample example = (LibraryExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Library record) {
        SQL sql = new SQL();
        sql.UPDATE("LIBRARY");
        
        if (record.getBookName() != null) {
            sql.SET("BOOK_NAME = #{bookName,jdbcType=VARCHAR}");
        }
        
        if (record.getBookStock() != null) {
            sql.SET("BOOK_STOCK = #{bookStock,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("BOOK_NO = #{bookNo,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, LibraryExample example, boolean includeExamplePhrase) {
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