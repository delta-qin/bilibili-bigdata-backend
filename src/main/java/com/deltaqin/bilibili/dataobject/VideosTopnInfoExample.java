package com.deltaqin.bilibili.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideosTopnInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideosTopnInfoExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Long value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Long value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Long value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Long value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Long value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Long value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Long> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Long> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Long value1, Long value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Long value1, Long value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andBvidIsNull() {
            addCriterion("bvid is null");
            return (Criteria) this;
        }

        public Criteria andBvidIsNotNull() {
            addCriterion("bvid is not null");
            return (Criteria) this;
        }

        public Criteria andBvidEqualTo(String value) {
            addCriterion("bvid =", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotEqualTo(String value) {
            addCriterion("bvid <>", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidGreaterThan(String value) {
            addCriterion("bvid >", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidGreaterThanOrEqualTo(String value) {
            addCriterion("bvid >=", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidLessThan(String value) {
            addCriterion("bvid <", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidLessThanOrEqualTo(String value) {
            addCriterion("bvid <=", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidLike(String value) {
            addCriterion("bvid like", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotLike(String value) {
            addCriterion("bvid not like", value, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidIn(List<String> values) {
            addCriterion("bvid in", values, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotIn(List<String> values) {
            addCriterion("bvid not in", values, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidBetween(String value1, String value2) {
            addCriterion("bvid between", value1, value2, "bvid");
            return (Criteria) this;
        }

        public Criteria andBvidNotBetween(String value1, String value2) {
            addCriterion("bvid not between", value1, value2, "bvid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
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

        public Criteria andDanmakuIsNull() {
            addCriterion("danmaku is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuIsNotNull() {
            addCriterion("danmaku is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuEqualTo(Long value) {
            addCriterion("danmaku =", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuNotEqualTo(Long value) {
            addCriterion("danmaku <>", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuGreaterThan(Long value) {
            addCriterion("danmaku >", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuGreaterThanOrEqualTo(Long value) {
            addCriterion("danmaku >=", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuLessThan(Long value) {
            addCriterion("danmaku <", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuLessThanOrEqualTo(Long value) {
            addCriterion("danmaku <=", value, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuIn(List<Long> values) {
            addCriterion("danmaku in", values, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuNotIn(List<Long> values) {
            addCriterion("danmaku not in", values, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuBetween(Long value1, Long value2) {
            addCriterion("danmaku between", value1, value2, "danmaku");
            return (Criteria) this;
        }

        public Criteria andDanmakuNotBetween(Long value1, Long value2) {
            addCriterion("danmaku not between", value1, value2, "danmaku");
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