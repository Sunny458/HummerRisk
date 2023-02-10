package com.hummer.common.core.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RuleInspectionReportExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public RuleInspectionReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
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
            String column = condition;
            column = Objects.requireNonNull(column, "Condition must not be null!");
            criteria.add(new Criterion(column));
        }

        protected void addCriterion(String condition, Object value, String property) {
            Object column = value;
            column = Objects.requireNonNull(column, "Value must not be null!");
            criteria.add(new Criterion(condition, column));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            Object column1 = value1;
            Object column2 = value2;
            column1 = Objects.requireNonNull(column1, "Value must not be null!");
            column2 = Objects.requireNonNull(column2, "Value must not be null!");
            criteria.add(new Criterion(condition, column1, column2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelIsNull() {
            addCriterion("item_sort_first_level is null");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelIsNotNull() {
            addCriterion("item_sort_first_level is not null");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelEqualTo(String value) {
            addCriterion("item_sort_first_level =", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelNotEqualTo(String value) {
            addCriterion("item_sort_first_level <>", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelGreaterThan(String value) {
            addCriterion("item_sort_first_level >", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelGreaterThanOrEqualTo(String value) {
            addCriterion("item_sort_first_level >=", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelLessThan(String value) {
            addCriterion("item_sort_first_level <", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelLessThanOrEqualTo(String value) {
            addCriterion("item_sort_first_level <=", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelLike(String value) {
            addCriterion("item_sort_first_level like", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelNotLike(String value) {
            addCriterion("item_sort_first_level not like", value, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelIn(List<String> values) {
            addCriterion("item_sort_first_level in", values, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelNotIn(List<String> values) {
            addCriterion("item_sort_first_level not in", values, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelBetween(String value1, String value2) {
            addCriterion("item_sort_first_level between", value1, value2, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortFirstLevelNotBetween(String value1, String value2) {
            addCriterion("item_sort_first_level not between", value1, value2, "itemSortFirstLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelIsNull() {
            addCriterion("item_sort_second_level is null");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelIsNotNull() {
            addCriterion("item_sort_second_level is not null");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelEqualTo(String value) {
            addCriterion("item_sort_second_level =", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelNotEqualTo(String value) {
            addCriterion("item_sort_second_level <>", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelGreaterThan(String value) {
            addCriterion("item_sort_second_level >", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelGreaterThanOrEqualTo(String value) {
            addCriterion("item_sort_second_level >=", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelLessThan(String value) {
            addCriterion("item_sort_second_level <", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelLessThanOrEqualTo(String value) {
            addCriterion("item_sort_second_level <=", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelLike(String value) {
            addCriterion("item_sort_second_level like", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelNotLike(String value) {
            addCriterion("item_sort_second_level not like", value, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelIn(List<String> values) {
            addCriterion("item_sort_second_level in", values, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelNotIn(List<String> values) {
            addCriterion("item_sort_second_level not in", values, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelBetween(String value1, String value2) {
            addCriterion("item_sort_second_level between", value1, value2, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andItemSortSecondLevelNotBetween(String value1, String value2) {
            addCriterion("item_sort_second_level not between", value1, value2, "itemSortSecondLevel");
            return (Criteria) this;
        }

        public Criteria andImprovementIsNull() {
            addCriterion("improvement is null");
            return (Criteria) this;
        }

        public Criteria andImprovementIsNotNull() {
            addCriterion("improvement is not null");
            return (Criteria) this;
        }

        public Criteria andImprovementEqualTo(String value) {
            addCriterion("improvement =", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementNotEqualTo(String value) {
            addCriterion("improvement <>", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementGreaterThan(String value) {
            addCriterion("improvement >", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementGreaterThanOrEqualTo(String value) {
            addCriterion("improvement >=", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementLessThan(String value) {
            addCriterion("improvement <", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementLessThanOrEqualTo(String value) {
            addCriterion("improvement <=", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementLike(String value) {
            addCriterion("improvement like", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementNotLike(String value) {
            addCriterion("improvement not like", value, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementIn(List<String> values) {
            addCriterion("improvement in", values, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementNotIn(List<String> values) {
            addCriterion("improvement not in", values, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementBetween(String value1, String value2) {
            addCriterion("improvement between", value1, value2, "improvement");
            return (Criteria) this;
        }

        public Criteria andImprovementNotBetween(String value1, String value2) {
            addCriterion("improvement not between", value1, value2, "improvement");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rule_inspection_report
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 19 17:40:09 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rule_inspection_report
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2022
     */
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
