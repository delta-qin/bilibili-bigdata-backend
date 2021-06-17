package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.dao.VideosTopnInfoMapper;
import com.deltaqin.bilibili.redis.jedis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author deltaqin
 * @date 2021/6/17 下午2:32
 */
public class BaseController {
    @Autowired
    protected RedisService redisService;


}
