package com.deltaqin.bilibili.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnsInfoExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Long value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Long value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Long value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Long value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Long value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Long value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Long> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Long> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Long value1, Long value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Long value1, Long value2) {
            addCriterion("view not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNull() {
            addCriterion("favorite is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteIsNotNull() {
            addCriterion("favorite is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteEqualTo(Long value) {
            addCriterion("favorite =", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotEqualTo(Long value) {
            addCriterion("favorite <>", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThan(Long value) {
            addCriterion("favorite >", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteGreaterThanOrEqualTo(Long value) {
            addCriterion("favorite >=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThan(Long value) {
            addCriterion("favorite <", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteLessThanOrEqualTo(Long value) {
            addCriterion("favorite <=", value, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteIn(List<Long> values) {
            addCriterion("favorite in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotIn(List<Long> values) {
            addCriterion("favorite not in", values, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteBetween(Long value1, Long value2) {
            addCriterion("favorite between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andFavoriteNotBetween(Long value1, Long value2) {
            addCriterion("favorite not between", value1, value2, "favorite");
            return (Criteria) this;
        }

        public Criteria andLikeIsNull() {
            addCriterion("like is null");
            return (Criteria) this;
        }

        public Criteria andLikeIsNotNull() {
            addCriterion("like is not null");
            return (Criteria) this;
        }

        public Criteria andLikeEqualTo(Long value) {
            addCriterion("like =", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotEqualTo(Long value) {
            addCriterion("like <>", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThan(Long value) {
            addCriterion("like >", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThanOrEqualTo(Long value) {
            addCriterion("like >=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThan(Long value) {
            addCriterion("like <", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThanOrEqualTo(Long value) {
            addCriterion("like <=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeIn(List<Long> values) {
            addCriterion("like in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotIn(List<Long> values) {
            addCriterion("like not in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeBetween(Long value1, Long value2) {
            addCriterion("like between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotBetween(Long value1, Long value2) {
            addCriterion("like not between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andDislikeIsNull() {
            addCriterion("dislike is null");
            return (Criteria) this;
        }

        public Criteria andDislikeIsNotNull() {
            addCriterion("dislike is not null");
            return (Criteria) this;
        }

        public Criteria andDislikeEqualTo(Long value) {
            addCriterion("dislike =", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotEqualTo(Long value) {
            addCriterion("dislike <>", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeGreaterThan(Long value) {
            addCriterion("dislike >", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeGreaterThanOrEqualTo(Long value) {
            addCriterion("dislike >=", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeLessThan(Long value) {
            addCriterion("dislike <", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeLessThanOrEqualTo(Long value) {
            addCriterion("dislike <=", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeIn(List<Long> values) {
            addCriterion("dislike in", values, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotIn(List<Long> values) {
            addCriterion("dislike not in", values, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeBetween(Long value1, Long value2) {
            addCriterion("dislike between", value1, value2, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotBetween(Long value1, Long value2) {
            addCriterion("dislike not between", value1, value2, "dislike");
            return (Criteria) this;
        }

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(Long value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(Long value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(Long value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(Long value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(Long value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(Long value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<Long> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<Long> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(Long value1, Long value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(Long value1, Long value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andShareIsNull() {
            addCriterion("share is null");
            return (Criteria) this;
        }

        public Criteria andShareIsNotNull() {
            addCriterion("share is not null");
            return (Criteria) this;
        }

        public Criteria andShareEqualTo(Long value) {
            addCriterion("share =", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotEqualTo(Long value) {
            addCriterion("share <>", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThan(Long value) {
            addCriterion("share >", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareGreaterThanOrEqualTo(Long value) {
            addCriterion("share >=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThan(Long value) {
            addCriterion("share <", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareLessThanOrEqualTo(Long value) {
            addCriterion("share <=", value, "share");
            return (Criteria) this;
        }

        public Criteria andShareIn(List<Long> values) {
            addCriterion("share in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotIn(List<Long> values) {
            addCriterion("share not in", values, "share");
            return (Criteria) this;
        }

        public Criteria andShareBetween(Long value1, Long value2) {
            addCriterion("share between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andShareNotBetween(Long value1, Long value2) {
            addCriterion("share not between", value1, value2, "share");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Long value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Long value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Long value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Long value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Long value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Long value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Long> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Long> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Long value1, Long value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Long value1, Long value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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