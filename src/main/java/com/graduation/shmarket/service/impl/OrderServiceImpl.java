package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.Order;
import com.graduation.shmarket.mapper.OrderMapper;
import com.graduation.shmarket.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
