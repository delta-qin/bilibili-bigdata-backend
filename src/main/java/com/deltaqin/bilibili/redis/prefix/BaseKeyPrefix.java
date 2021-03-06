package com.deltaqin.bilibili.redis.prefix;

/**
 * 每一类key应该有相同的前缀
 *
 * 所有的key前缀使用数据库的名字，这样删除的时候可以直接按照前缀删除
 *
 * @author deltaqin
 * @date 2021/6/14 上午8:33
 */
public class BaseKeyPrefix implements KeyPrefix {

    private String prefix;

    private int expireSeconds;

    public BaseKeyPrefix(String prefix) {
        this(prefix, 0);
    }

    public BaseKeyPrefix(String prefix, int expireSeconds) {
        this.prefix = prefix;
        this.expireSeconds = expireSeconds;
    }

    // 使用  类名+属性名  作为前缀，最后追加自己的key
    @Override
    public String getPrefix() {
        String simpleName = getClass().getSimpleName();

        return simpleName + ":" + prefix;
    }

    @Override
    public int expireSeconds() {
        return expireSeconds;
    }
}
