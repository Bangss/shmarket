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
 * 订单表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号，自动增长
     */
    @TableId(value = "o_id", type = IdType.AUTO)
    private Integer oId;

    /**
     * 商品编号
     */
    private Integer gId;

    /**
     * 卖家编号
     */
    private Integer sId;

    /**
     * 买家编号
     */
    private Integer bId;

    /**
     * 下单时间
     */
    private LocalDateTime oTime;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 支付时间
     */
    private LocalDateTime saleTime;

    /**
     * 交易完成时间
     */
    private LocalDateTime finishTime;

    /**
     * 订单状态
0：待支付
1：已支付
2：已取消
3：申请退款中
4：退款成功
5：退款失败
     */
    private Integer state;


}
