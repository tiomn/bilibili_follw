package com.tiomn.entity;

import lombok.Data;

/**
 * @Date 2020/04/24 11:10
 * @Version v1.0
 * @Author jishupeng
 * @Description TODO 哔哩哔哩api实体类
 * @ClassName Bilibili
 */
@Data
public class Bilibili {
    /**
     * bilibili user mid
     * mid you can find in
     * @see <a href="https://api.bilibli.com">bilbili.com</a>
     * uid or uuid
     */
    private Integer mid;
    /** the number of now this mid following */
    private Integer following=0;
    /** the number of now this mid how many who send the security message */
    private Integer whisper=0;

    private Integer black;
    /** the number of now this mid how many is follow */
    private Integer follower=0;
    /** response code */
    private Integer code;
    /** response message */
    private String message;

    private String ttl;

    private boolean followerIncrease;

    private Integer IncreaseNum=0;
}
