package com.deltaqin.bilibili.model;

import lombok.Data;

/**
 * @author deltaqin
 * @date 2021/6/17 下午4:48
 */
@Data
public class Top5ThreeModel implements Comparable<Top5ThreeModel>{
    private String name;
    private Double score;
    private int count;

    @Override
    public int compareTo(Top5ThreeModel o) {
        return new Double((o.getScore() - score)).intValue();
    }
}
