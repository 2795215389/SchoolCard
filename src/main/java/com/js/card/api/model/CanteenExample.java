package com.js.card.api.model;

import java.util.ArrayList;
import java.util.List;

public class CanteenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CanteenExample() {
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

        public Criteria andCnameIsNull() {
            addCriterion("CNAME is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CNAME =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CNAME <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CNAME >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CNAME >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CNAME <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CNAME <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CNAME like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CNAME not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CNAME in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CNAME not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CNAME between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CNAME not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andClocIsNull() {
            addCriterion("CLOC is null");
            return (Criteria) this;
        }

        public Criteria andClocIsNotNull() {
            addCriterion("CLOC is not null");
            return (Criteria) this;
        }

        public Criteria andClocEqualTo(String value) {
            addCriterion("CLOC =", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocNotEqualTo(String value) {
            addCriterion("CLOC <>", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocGreaterThan(String value) {
            addCriterion("CLOC >", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocGreaterThanOrEqualTo(String value) {
            addCriterion("CLOC >=", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocLessThan(String value) {
            addCriterion("CLOC <", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocLessThanOrEqualTo(String value) {
            addCriterion("CLOC <=", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocLike(String value) {
            addCriterion("CLOC like", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocNotLike(String value) {
            addCriterion("CLOC not like", value, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocIn(List<String> values) {
            addCriterion("CLOC in", values, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocNotIn(List<String> values) {
            addCriterion("CLOC not in", values, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocBetween(String value1, String value2) {
            addCriterion("CLOC between", value1, value2, "cloc");
            return (Criteria) this;
        }

        public Criteria andClocNotBetween(String value1, String value2) {
            addCriterion("CLOC not between", value1, value2, "cloc");
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