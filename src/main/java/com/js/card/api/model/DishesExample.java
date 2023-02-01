package com.js.card.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishesExample() {
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

        public Criteria andDishNoIsNull() {
            addCriterion("DISH_NO is null");
            return (Criteria) this;
        }

        public Criteria andDishNoIsNotNull() {
            addCriterion("DISH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDishNoEqualTo(String value) {
            addCriterion("DISH_NO =", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoNotEqualTo(String value) {
            addCriterion("DISH_NO <>", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoGreaterThan(String value) {
            addCriterion("DISH_NO >", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoGreaterThanOrEqualTo(String value) {
            addCriterion("DISH_NO >=", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoLessThan(String value) {
            addCriterion("DISH_NO <", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoLessThanOrEqualTo(String value) {
            addCriterion("DISH_NO <=", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoLike(String value) {
            addCriterion("DISH_NO like", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoNotLike(String value) {
            addCriterion("DISH_NO not like", value, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoIn(List<String> values) {
            addCriterion("DISH_NO in", values, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoNotIn(List<String> values) {
            addCriterion("DISH_NO not in", values, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoBetween(String value1, String value2) {
            addCriterion("DISH_NO between", value1, value2, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNoNotBetween(String value1, String value2) {
            addCriterion("DISH_NO not between", value1, value2, "dishNo");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNull() {
            addCriterion("DISH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDishNameIsNotNull() {
            addCriterion("DISH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDishNameEqualTo(String value) {
            addCriterion("DISH_NAME =", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotEqualTo(String value) {
            addCriterion("DISH_NAME <>", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThan(String value) {
            addCriterion("DISH_NAME >", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISH_NAME >=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThan(String value) {
            addCriterion("DISH_NAME <", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLessThanOrEqualTo(String value) {
            addCriterion("DISH_NAME <=", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameLike(String value) {
            addCriterion("DISH_NAME like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotLike(String value) {
            addCriterion("DISH_NAME not like", value, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameIn(List<String> values) {
            addCriterion("DISH_NAME in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotIn(List<String> values) {
            addCriterion("DISH_NAME not in", values, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameBetween(String value1, String value2) {
            addCriterion("DISH_NAME between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishNameNotBetween(String value1, String value2) {
            addCriterion("DISH_NAME not between", value1, value2, "dishName");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNull() {
            addCriterion("DISH_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDishPriceIsNotNull() {
            addCriterion("DISH_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDishPriceEqualTo(BigDecimal value) {
            addCriterion("DISH_PRICE =", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotEqualTo(BigDecimal value) {
            addCriterion("DISH_PRICE <>", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThan(BigDecimal value) {
            addCriterion("DISH_PRICE >", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISH_PRICE >=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThan(BigDecimal value) {
            addCriterion("DISH_PRICE <", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISH_PRICE <=", value, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceIn(List<BigDecimal> values) {
            addCriterion("DISH_PRICE in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotIn(List<BigDecimal> values) {
            addCriterion("DISH_PRICE not in", values, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISH_PRICE between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISH_PRICE not between", value1, value2, "dishPrice");
            return (Criteria) this;
        }

        public Criteria andDishStockIsNull() {
            addCriterion("DISH_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andDishStockIsNotNull() {
            addCriterion("DISH_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andDishStockEqualTo(Short value) {
            addCriterion("DISH_STOCK =", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockNotEqualTo(Short value) {
            addCriterion("DISH_STOCK <>", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockGreaterThan(Short value) {
            addCriterion("DISH_STOCK >", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockGreaterThanOrEqualTo(Short value) {
            addCriterion("DISH_STOCK >=", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockLessThan(Short value) {
            addCriterion("DISH_STOCK <", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockLessThanOrEqualTo(Short value) {
            addCriterion("DISH_STOCK <=", value, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockIn(List<Short> values) {
            addCriterion("DISH_STOCK in", values, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockNotIn(List<Short> values) {
            addCriterion("DISH_STOCK not in", values, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockBetween(Short value1, Short value2) {
            addCriterion("DISH_STOCK between", value1, value2, "dishStock");
            return (Criteria) this;
        }

        public Criteria andDishStockNotBetween(Short value1, Short value2) {
            addCriterion("DISH_STOCK not between", value1, value2, "dishStock");
            return (Criteria) this;
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