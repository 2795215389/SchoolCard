package com.js.card.api.model;

import java.util.ArrayList;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("SNO is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("SNO is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("SNO =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("SNO <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("SNO >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("SNO >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("SNO <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("SNO <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("SNO like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("SNO not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("SNO in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("SNO not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("SNO between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("SNO not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("SNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("SNAME =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("SNAME <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("SNAME >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("SNAME >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("SNAME <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("SNAME <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("SNAME like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("SNAME not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("SNAME in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("SNAME not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("SNAME between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("SNAME not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSareaIsNull() {
            addCriterion("SAREA is null");
            return (Criteria) this;
        }

        public Criteria andSareaIsNotNull() {
            addCriterion("SAREA is not null");
            return (Criteria) this;
        }

        public Criteria andSareaEqualTo(String value) {
            addCriterion("SAREA =", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotEqualTo(String value) {
            addCriterion("SAREA <>", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThan(String value) {
            addCriterion("SAREA >", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaGreaterThanOrEqualTo(String value) {
            addCriterion("SAREA >=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThan(String value) {
            addCriterion("SAREA <", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLessThanOrEqualTo(String value) {
            addCriterion("SAREA <=", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaLike(String value) {
            addCriterion("SAREA like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotLike(String value) {
            addCriterion("SAREA not like", value, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaIn(List<String> values) {
            addCriterion("SAREA in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotIn(List<String> values) {
            addCriterion("SAREA not in", values, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaBetween(String value1, String value2) {
            addCriterion("SAREA between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andSareaNotBetween(String value1, String value2) {
            addCriterion("SAREA not between", value1, value2, "sarea");
            return (Criteria) this;
        }

        public Criteria andSdepartIsNull() {
            addCriterion("SDEPART is null");
            return (Criteria) this;
        }

        public Criteria andSdepartIsNotNull() {
            addCriterion("SDEPART is not null");
            return (Criteria) this;
        }

        public Criteria andSdepartEqualTo(String value) {
            addCriterion("SDEPART =", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartNotEqualTo(String value) {
            addCriterion("SDEPART <>", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartGreaterThan(String value) {
            addCriterion("SDEPART >", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartGreaterThanOrEqualTo(String value) {
            addCriterion("SDEPART >=", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartLessThan(String value) {
            addCriterion("SDEPART <", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartLessThanOrEqualTo(String value) {
            addCriterion("SDEPART <=", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartLike(String value) {
            addCriterion("SDEPART like", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartNotLike(String value) {
            addCriterion("SDEPART not like", value, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartIn(List<String> values) {
            addCriterion("SDEPART in", values, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartNotIn(List<String> values) {
            addCriterion("SDEPART not in", values, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartBetween(String value1, String value2) {
            addCriterion("SDEPART between", value1, value2, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSdepartNotBetween(String value1, String value2) {
            addCriterion("SDEPART not between", value1, value2, "sdepart");
            return (Criteria) this;
        }

        public Criteria andSclassIsNull() {
            addCriterion("SCLASS is null");
            return (Criteria) this;
        }

        public Criteria andSclassIsNotNull() {
            addCriterion("SCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andSclassEqualTo(String value) {
            addCriterion("SCLASS =", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotEqualTo(String value) {
            addCriterion("SCLASS <>", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThan(String value) {
            addCriterion("SCLASS >", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassGreaterThanOrEqualTo(String value) {
            addCriterion("SCLASS >=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThan(String value) {
            addCriterion("SCLASS <", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLessThanOrEqualTo(String value) {
            addCriterion("SCLASS <=", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassLike(String value) {
            addCriterion("SCLASS like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotLike(String value) {
            addCriterion("SCLASS not like", value, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassIn(List<String> values) {
            addCriterion("SCLASS in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotIn(List<String> values) {
            addCriterion("SCLASS not in", values, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassBetween(String value1, String value2) {
            addCriterion("SCLASS between", value1, value2, "sclass");
            return (Criteria) this;
        }

        public Criteria andSclassNotBetween(String value1, String value2) {
            addCriterion("SCLASS not between", value1, value2, "sclass");
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