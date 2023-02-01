package com.js.card.api.model;

import java.util.ArrayList;
import java.util.List;

public class WindowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WindowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWindowNoIsNull() {
            addCriterion("WINDOW_NO is null");
            return (Criteria) this;
        }

        public Criteria andWindowNoIsNotNull() {
            addCriterion("WINDOW_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWindowNoEqualTo(String value) {
            addCriterion("WINDOW_NO =", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoNotEqualTo(String value) {
            addCriterion("WINDOW_NO <>", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoGreaterThan(String value) {
            addCriterion("WINDOW_NO >", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOW_NO >=", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoLessThan(String value) {
            addCriterion("WINDOW_NO <", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoLessThanOrEqualTo(String value) {
            addCriterion("WINDOW_NO <=", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoLike(String value) {
            addCriterion("WINDOW_NO like", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoNotLike(String value) {
            addCriterion("WINDOW_NO not like", value, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoIn(List<String> values) {
            addCriterion("WINDOW_NO in", values, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoNotIn(List<String> values) {
            addCriterion("WINDOW_NO not in", values, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoBetween(String value1, String value2) {
            addCriterion("WINDOW_NO between", value1, value2, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNoNotBetween(String value1, String value2) {
            addCriterion("WINDOW_NO not between", value1, value2, "windowNo");
            return (Criteria) this;
        }

        public Criteria andWindowNameIsNull() {
            addCriterion("WINDOW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWindowNameIsNotNull() {
            addCriterion("WINDOW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWindowNameEqualTo(String value) {
            addCriterion("WINDOW_NAME =", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameNotEqualTo(String value) {
            addCriterion("WINDOW_NAME <>", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameGreaterThan(String value) {
            addCriterion("WINDOW_NAME >", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameGreaterThanOrEqualTo(String value) {
            addCriterion("WINDOW_NAME >=", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameLessThan(String value) {
            addCriterion("WINDOW_NAME <", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameLessThanOrEqualTo(String value) {
            addCriterion("WINDOW_NAME <=", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameLike(String value) {
            addCriterion("WINDOW_NAME like", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameNotLike(String value) {
            addCriterion("WINDOW_NAME not like", value, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameIn(List<String> values) {
            addCriterion("WINDOW_NAME in", values, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameNotIn(List<String> values) {
            addCriterion("WINDOW_NAME not in", values, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameBetween(String value1, String value2) {
            addCriterion("WINDOW_NAME between", value1, value2, "windowName");
            return (Criteria) this;
        }

        public Criteria andWindowNameNotBetween(String value1, String value2) {
            addCriterion("WINDOW_NAME not between", value1, value2, "windowName");
            return (Criteria) this;
        }

        public Criteria andCnoIsNull() {
            addCriterion("CNO is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("CNO is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("CNO =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("CNO <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("CNO >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("CNO >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("CNO <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("CNO <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("CNO like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("CNO not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("CNO in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("CNO not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("CNO between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("CNO not between", value1, value2, "cno");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}