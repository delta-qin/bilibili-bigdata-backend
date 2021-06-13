package com.deltaqin.bilibili.dataobject;

import java.util.ArrayList;
import java.util.List;

public class UpTop100InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpTop100InfoExample() {
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

        public Criteria andUpNameIsNull() {
            addCriterion("up_name is null");
            return (Criteria) this;
        }

        public Criteria andUpNameIsNotNull() {
            addCriterion("up_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpNameEqualTo(String value) {
            addCriterion("up_name =", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotEqualTo(String value) {
            addCriterion("up_name <>", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThan(String value) {
            addCriterion("up_name >", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameGreaterThanOrEqualTo(String value) {
            addCriterion("up_name >=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThan(String value) {
            addCriterion("up_name <", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLessThanOrEqualTo(String value) {
            addCriterion("up_name <=", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameLike(String value) {
            addCriterion("up_name like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotLike(String value) {
            addCriterion("up_name not like", value, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameIn(List<String> values) {
            addCriterion("up_name in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotIn(List<String> values) {
            addCriterion("up_name not in", values, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameBetween(String value1, String value2) {
            addCriterion("up_name between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpNameNotBetween(String value1, String value2) {
            addCriterion("up_name not between", value1, value2, "upName");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountIsNull() {
            addCriterion("up_focus_count is null");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountIsNotNull() {
            addCriterion("up_focus_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountEqualTo(Integer value) {
            addCriterion("up_focus_count =", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountNotEqualTo(Integer value) {
            addCriterion("up_focus_count <>", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountGreaterThan(Integer value) {
            addCriterion("up_focus_count >", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_focus_count >=", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountLessThan(Integer value) {
            addCriterion("up_focus_count <", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountLessThanOrEqualTo(Integer value) {
            addCriterion("up_focus_count <=", value, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountIn(List<Integer> values) {
            addCriterion("up_focus_count in", values, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountNotIn(List<Integer> values) {
            addCriterion("up_focus_count not in", values, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountBetween(Integer value1, Integer value2) {
            addCriterion("up_focus_count between", value1, value2, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpFocusCountNotBetween(Integer value1, Integer value2) {
            addCriterion("up_focus_count not between", value1, value2, "upFocusCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountIsNull() {
            addCriterion("up_play_count is null");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountIsNotNull() {
            addCriterion("up_play_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountEqualTo(Integer value) {
            addCriterion("up_play_count =", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountNotEqualTo(Integer value) {
            addCriterion("up_play_count <>", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountGreaterThan(Integer value) {
            addCriterion("up_play_count >", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_play_count >=", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountLessThan(Integer value) {
            addCriterion("up_play_count <", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountLessThanOrEqualTo(Integer value) {
            addCriterion("up_play_count <=", value, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountIn(List<Integer> values) {
            addCriterion("up_play_count in", values, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountNotIn(List<Integer> values) {
            addCriterion("up_play_count not in", values, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountBetween(Integer value1, Integer value2) {
            addCriterion("up_play_count between", value1, value2, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpPlayCountNotBetween(Integer value1, Integer value2) {
            addCriterion("up_play_count not between", value1, value2, "upPlayCount");
            return (Criteria) this;
        }

        public Criteria andUpSexIsNull() {
            addCriterion("up_sex is null");
            return (Criteria) this;
        }

        public Criteria andUpSexIsNotNull() {
            addCriterion("up_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUpSexEqualTo(byte[] value) {
            addCriterion("up_sex =", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotEqualTo(byte[] value) {
            addCriterion("up_sex <>", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexGreaterThan(byte[] value) {
            addCriterion("up_sex >", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexGreaterThanOrEqualTo(byte[] value) {
            addCriterion("up_sex >=", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexLessThan(byte[] value) {
            addCriterion("up_sex <", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexLessThanOrEqualTo(byte[] value) {
            addCriterion("up_sex <=", value, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexIn(List<byte[]> values) {
            addCriterion("up_sex in", values, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotIn(List<byte[]> values) {
            addCriterion("up_sex not in", values, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexBetween(byte[] value1, byte[] value2) {
            addCriterion("up_sex between", value1, value2, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpSexNotBetween(byte[] value1, byte[] value2) {
            addCriterion("up_sex not between", value1, value2, "upSex");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdIsNull() {
            addCriterion("up_partition_id is null");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdIsNotNull() {
            addCriterion("up_partition_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdEqualTo(Integer value) {
            addCriterion("up_partition_id =", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdNotEqualTo(Integer value) {
            addCriterion("up_partition_id <>", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdGreaterThan(Integer value) {
            addCriterion("up_partition_id >", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_partition_id >=", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdLessThan(Integer value) {
            addCriterion("up_partition_id <", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("up_partition_id <=", value, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdIn(List<Integer> values) {
            addCriterion("up_partition_id in", values, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdNotIn(List<Integer> values) {
            addCriterion("up_partition_id not in", values, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdBetween(Integer value1, Integer value2) {
            addCriterion("up_partition_id between", value1, value2, "upPartitionId");
            return (Criteria) this;
        }

        public Criteria andUpPartitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("up_partition_id not between", value1, value2, "upPartitionId");
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