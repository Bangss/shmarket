package com.graduation.shmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 留言表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Msg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "m_id", type = IdType.AUTO)
    private Integer mId;

    /**
     * 留言人编号
     */
    private Integer userId;

    /**
     * 内容
     */
    private String content;

    /**
     * 父结点
     */
    private Integer parents;

    /**
     * 子结点
     */
    private Integer kids;

    /**
     * 留言时间
     */
    private LocalDateTime mTime;

    /**
     * 点赞数
     */
    private Integer likeNum;


}
