package com.graduation.shmarket.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评价表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private Integer oId;

    /**
     * 内容
     */
    private String content;

    /**
     * 星星（1-2：差评，3-4：中评，5：好评）
     */
    private Integer evaluate;

    /**
     * 评价时间
     */
    private LocalDateTime comTime;


}
