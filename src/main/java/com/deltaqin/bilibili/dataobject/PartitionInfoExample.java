package com.deltaqin.bilibili.dataobject;

import java.util.ArrayList;
import java.util.List;

public class PartitionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartitionInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("like_count =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("like_count >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("like_count <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("like_count in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountIsNull() {
            addCriterion("coins_count is null");
            return (Criteria) this;
        }

        public Criteria andCoinsCountIsNotNull() {
            addCriterion("coins_count is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsCountEqualTo(Integer value) {
            addCriterion("coins_count =", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountNotEqualTo(Integer value) {
            addCriterion("coins_count <>", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountGreaterThan(Integer value) {
            addCriterion("coins_count >", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("coins_count >=", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountLessThan(Integer value) {
            addCriterion("coins_count <", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountLessThanOrEqualTo(Integer value) {
            addCriterion("coins_count <=", value, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountIn(List<Integer> values) {
            addCriterion("coins_count in", values, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountNotIn(List<Integer> values) {
            addCriterion("coins_count not in", values, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountBetween(Integer value1, Integer value2) {
            addCriterion("coins_count between", value1, value2, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCoinsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("coins_count not between", value1, value2, "coinsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountIsNull() {
            addCriterion("collections_count is null");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountIsNotNull() {
            addCriterion("collections_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountEqualTo(Integer value) {
            addCriterion("collections_count =", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountNotEqualTo(Integer value) {
            addCriterion("collections_count <>", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountGreaterThan(Integer value) {
            addCriterion("collections_count >", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collections_count >=", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountLessThan(Integer value) {
            addCriterion("collections_count <", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountLessThanOrEqualTo(Integer value) {
            addCriterion("collections_count <=", value, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountIn(List<Integer> values) {
            addCriterion("collections_count in", values, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountNotIn(List<Integer> values) {
            addCriterion("collections_count not in", values, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountBetween(Integer value1, Integer value2) {
            addCriterion("collections_count between", value1, value2, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCollectionsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("collections_count not between", value1, value2, "collectionsCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShareCountIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShareCountEqualTo(Integer value) {
            addCriterion("share_count =", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotEqualTo(Integer value) {
            addCriterion("share_count <>", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThan(Integer value) {
            addCriterion("share_count >", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_count >=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThan(Integer value) {
            addCriterion("share_count <", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountLessThanOrEqualTo(Integer value) {
            addCriterion("share_count <=", value, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountIn(List<Integer> values) {
            addCriterion("share_count in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotIn(List<Integer> values) {
            addCriterion("share_count not in", values, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountBetween(Integer value1, Integer value2) {
            addCriterion("share_count between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andShareCountNotBetween(Integer value1, Integer value2) {
            addCriterion("share_count not between", value1, value2, "shareCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountIsNull() {
            addCriterion("barrage_count is null");
            return (Criteria) this;
        }

        public Criteria andBarrageCountIsNotNull() {
            addCriterion("barrage_count is not null");
            return (Criteria) this;
        }

        public Criteria andBarrageCountEqualTo(Integer value) {
            addCriterion("barrage_count =", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountNotEqualTo(Integer value) {
            addCriterion("barrage_count <>", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountGreaterThan(Integer value) {
            addCriterion("barrage_count >", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("barrage_count >=", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountLessThan(Integer value) {
            addCriterion("barrage_count <", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountLessThanOrEqualTo(Integer value) {
            addCriterion("barrage_count <=", value, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountIn(List<Integer> values) {
            addCriterion("barrage_count in", values, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountNotIn(List<Integer> values) {
            addCriterion("barrage_count not in", values, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountBetween(Integer value1, Integer value2) {
            addCriterion("barrage_count between", value1, value2, "barrageCount");
            return (Criteria) this;
        }

        public Criteria andBarrageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("barrage_count not between", value1, value2, "barrageCount");
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