package com.graduation.shmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品编号，自动增长
     */
    @TableId(value = "g_id", type = IdType.AUTO)
    private Integer gId;

    /**
     * 商品名称
     */
    private String gName;

    /**
     * 店家编号
     */
    private Integer userId;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 类别编号
     */
    private Integer cId;

    /**
     * 上架时间
     */
    private LocalDateTime upTime;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 差评数
     */
    private Integer hateNum;

    /**
     * 想要数
     */
    private Integer wantNum;

    /**
     * 留言
     */
    private Integer mId;

    /**
     * 图片
     */
    private Blob photo;

    /**
     * 视频
     */
    private Blob video;


}
