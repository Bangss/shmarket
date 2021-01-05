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
 * 聊天室
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 聊天室编号
     */
    @TableId(value = "chat_id", type = IdType.AUTO)
    private Integer chatId;

    /**
     * 卖家
     */
    private Integer sId;

    /**
     * 买家
     */
    private Integer bId;

    /**
     * 发送时间
     */
    private LocalDateTime sendTime;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否已读
0：未读
1：已读
     */
    private Integer isRead;


}
