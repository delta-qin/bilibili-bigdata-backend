package com.deltaqin.bilibili.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaidaUpInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaidaUpInfoExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("mid not between", value1, value2, "mid");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andFaceIsNull() {
            addCriterion("face is null");
            return (Criteria) this;
        }

        public Criteria andFaceIsNotNull() {
            addCriterion("face is not null");
            return (Criteria) this;
        }

        public Criteria andFaceEqualTo(String value) {
            addCriterion("face =", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotEqualTo(String value) {
            addCriterion("face <>", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThan(String value) {
            addCriterion("face >", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThanOrEqualTo(String value) {
            addCriterion("face >=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThan(String value) {
            addCriterion("face <", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThanOrEqualTo(String value) {
            addCriterion("face <=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLike(String value) {
            addCriterion("face like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotLike(String value) {
            addCriterion("face not like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceIn(List<String> values) {
            addCriterion("face in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotIn(List<String> values) {
            addCriterion("face not in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceBetween(String value1, String value2) {
            addCriterion("face between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotBetween(String value1, String value2) {
            addCriterion("face not between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andArchiveViewIsNull() {
            addCriterion("archive_view is null");
            return (Criteria) this;
        }

        public Criteria andArchiveViewIsNotNull() {
            addCriterion("archive_view is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveViewEqualTo(Long value) {
            addCriterion("archive_view =", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewNotEqualTo(Long value) {
            addCriterion("archive_view <>", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewGreaterThan(Long value) {
            addCriterion("archive_view >", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewGreaterThanOrEqualTo(Long value) {
            addCriterion("archive_view >=", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewLessThan(Long value) {
            addCriterion("archive_view <", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewLessThanOrEqualTo(Long value) {
            addCriterion("archive_view <=", value, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewIn(List<Long> values) {
            addCriterion("archive_view in", values, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewNotIn(List<Long> values) {
            addCriterion("archive_view not in", values, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewBetween(Long value1, Long value2) {
            addCriterion("archive_view between", value1, value2, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArchiveViewNotBetween(Long value1, Long value2) {
            addCriterion("archive_view not between", value1, value2, "archiveView");
            return (Criteria) this;
        }

        public Criteria andArticleViewIsNull() {
            addCriterion("article_view is null");
            return (Criteria) this;
        }

        public Criteria andArticleViewIsNotNull() {
            addCriterion("article_view is not null");
            return (Criteria) this;
        }

        public Criteria andArticleViewEqualTo(Long value) {
            addCriterion("article_view =", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewNotEqualTo(Long value) {
            addCriterion("article_view <>", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewGreaterThan(Long value) {
            addCriterion("article_view >", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewGreaterThanOrEqualTo(Long value) {
            addCriterion("article_view >=", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewLessThan(Long value) {
            addCriterion("article_view <", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewLessThanOrEqualTo(Long value) {
            addCriterion("article_view <=", value, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewIn(List<Long> values) {
            addCriterion("article_view in", values, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewNotIn(List<Long> values) {
            addCriterion("article_view not in", values, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewBetween(Long value1, Long value2) {
            addCriterion("article_view between", value1, value2, "articleView");
            return (Criteria) this;
        }

        public Criteria andArticleViewNotBetween(Long value1, Long value2) {
            addCriterion("article_view not between", value1, value2, "articleView");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Long value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Long value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Long value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Long value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Long value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Long value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Long> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Long> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Long value1, Long value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Long value1, Long value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andFollowingIsNull() {
            addCriterion("following is null");
            return (Criteria) this;
        }

        public Criteria andFollowingIsNotNull() {
            addCriterion("following is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingEqualTo(Long value) {
            addCriterion("following =", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingNotEqualTo(Long value) {
            addCriterion("following <>", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingGreaterThan(Long value) {
            addCriterion("following >", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingGreaterThanOrEqualTo(Long value) {
            addCriterion("following >=", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingLessThan(Long value) {
            addCriterion("following <", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingLessThanOrEqualTo(Long value) {
            addCriterion("following <=", value, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingIn(List<Long> values) {
            addCriterion("following in", values, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingNotIn(List<Long> values) {
            addCriterion("following not in", values, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingBetween(Long value1, Long value2) {
            addCriterion("following between", value1, value2, "following");
            return (Criteria) this;
        }

        public Criteria andFollowingNotBetween(Long value1, Long value2) {
            addCriterion("following not between", value1, value2, "following");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNull() {
            addCriterion("follower is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIsNotNull() {
            addCriterion("follower is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerEqualTo(Long value) {
            addCriterion("follower =", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotEqualTo(Long value) {
            addCriterion("follower <>", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThan(Long value) {
            addCriterion("follower >", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerGreaterThanOrEqualTo(Long value) {
            addCriterion("follower >=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThan(Long value) {
            addCriterion("follower <", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerLessThanOrEqualTo(Long value) {
            addCriterion("follower <=", value, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerIn(List<Long> values) {
            addCriterion("follower in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotIn(List<Long> values) {
            addCriterion("follower not in", values, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerBetween(Long value1, Long value2) {
            addCriterion("follower between", value1, value2, "follower");
            return (Criteria) this;
        }

        public Criteria andFollowerNotBetween(Long value1, Long value2) {
            addCriterion("follower not between", value1, value2, "follower");
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