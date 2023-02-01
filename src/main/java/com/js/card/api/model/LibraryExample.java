package com.js.card.api.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibraryExample() {
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

        public Criteria andBookNoIsNull() {
            addCriterion("BOOK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBookNoIsNotNull() {
            addCriterion("BOOK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBookNoEqualTo(String value) {
            addCriterion("BOOK_NO =", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotEqualTo(String value) {
            addCriterion("BOOK_NO <>", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThan(String value) {
            addCriterion("BOOK_NO >", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_NO >=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThan(String value) {
            addCriterion("BOOK_NO <", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLessThanOrEqualTo(String value) {
            addCriterion("BOOK_NO <=", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoLike(String value) {
            addCriterion("BOOK_NO like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotLike(String value) {
            addCriterion("BOOK_NO not like", value, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoIn(List<String> values) {
            addCriterion("BOOK_NO in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotIn(List<String> values) {
            addCriterion("BOOK_NO not in", values, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoBetween(String value1, String value2) {
            addCriterion("BOOK_NO between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNoNotBetween(String value1, String value2) {
            addCriterion("BOOK_NO not between", value1, value2, "bookNo");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("BOOK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("BOOK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("BOOK_NAME =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("BOOK_NAME <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("BOOK_NAME >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_NAME >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("BOOK_NAME <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("BOOK_NAME <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("BOOK_NAME like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("BOOK_NAME not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("BOOK_NAME in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("BOOK_NAME not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("BOOK_NAME between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("BOOK_NAME not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookStockIsNull() {
            addCriterion("BOOK_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andBookStockIsNotNull() {
            addCriterion("BOOK_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andBookStockEqualTo(String value) {
            addCriterion("BOOK_STOCK =", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotEqualTo(String value) {
            addCriterion("BOOK_STOCK <>", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockGreaterThan(String value) {
            addCriterion("BOOK_STOCK >", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_STOCK >=", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockLessThan(String value) {
            addCriterion("BOOK_STOCK <", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockLessThanOrEqualTo(String value) {
            addCriterion("BOOK_STOCK <=", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockLike(String value) {
            addCriterion("BOOK_STOCK like", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotLike(String value) {
            addCriterion("BOOK_STOCK not like", value, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockIn(List<String> values) {
            addCriterion("BOOK_STOCK in", values, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotIn(List<String> values) {
            addCriterion("BOOK_STOCK not in", values, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockBetween(String value1, String value2) {
            addCriterion("BOOK_STOCK between", value1, value2, "bookStock");
            return (Criteria) this;
        }

        public Criteria andBookStockNotBetween(String value1, String value2) {
            addCriterion("BOOK_STOCK not between", value1, value2, "bookStock");
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