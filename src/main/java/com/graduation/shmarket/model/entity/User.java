package com.graduation.shmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 真实名字
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 学院编号
     */
    private Integer depId;

    /**
     * 班别
     */
    private String userClass;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 微信
     */
    private String wechat;

    /**
     * QQ
     */
    private Integer qq;

    /**
     * 个性签名
     */
    private String remark;

    /**
     * 信誉（0-100）
     */
    private Integer prestige;

    /**
     * 身份
     */
    private Integer role;


}
