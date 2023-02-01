package com.js.card.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodNoIsNull() {
            addCriterion("GOOD_NO is null");
            return (Criteria) this;
        }

        public Criteria andGoodNoIsNotNull() {
            addCriterion("GOOD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNoEqualTo(String value) {
            addCriterion("GOOD_NO =", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotEqualTo(String value) {
            addCriterion("GOOD_NO <>", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThan(String value) {
            addCriterion("GOOD_NO >", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_NO >=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThan(String value) {
            addCriterion("GOOD_NO <", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThanOrEqualTo(String value) {
            addCriterion("GOOD_NO <=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLike(String value) {
            addCriterion("GOOD_NO like", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotLike(String value) {
            addCriterion("GOOD_NO not like", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoIn(List<String> values) {
            addCriterion("GOOD_NO in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotIn(List<String> values) {
            addCriterion("GOOD_NO not in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoBetween(String value1, String value2) {
            addCriterion("GOOD_NO between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotBetween(String value1, String value2) {
            addCriterion("GOOD_NO not between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("GOOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("GOOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("GOOD_NAME =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("GOOD_NAME <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("GOOD_NAME >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("GOOD_NAME <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("GOOD_NAME like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("GOOD_NAME not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("GOOD_NAME in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("GOOD_NAME not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("GOOD_NAME between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("GOOD_NAME not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("GOOD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("GOOD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("GOOD_PRICE >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("GOOD_PRICE <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_PRICE <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_PRICE not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_PRICE not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodStockIsNull() {
            addCriterion("GOOD_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andGoodStockIsNotNull() {
            addCriterion("GOOD_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStockEqualTo(Integer value) {
            addCriterion("GOOD_STOCK =", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotEqualTo(Integer value) {
            addCriterion("GOOD_STOCK <>", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockGreaterThan(Integer value) {
            addCriterion("GOOD_STOCK >", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOOD_STOCK >=", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockLessThan(Integer value) {
            addCriterion("GOOD_STOCK <", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockLessThanOrEqualTo(Integer value) {
            addCriterion("GOOD_STOCK <=", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockIn(List<Integer> values) {
            addCriterion("GOOD_STOCK in", values, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotIn(List<Integer> values) {
            addCriterion("GOOD_STOCK not in", values, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockBetween(Integer value1, Integer value2) {
            addCriterion("GOOD_STOCK between", value1, value2, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotBetween(Integer value1, Integer value2) {
            addCriterion("GOOD_STOCK not between", value1, value2, "goodStock");
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