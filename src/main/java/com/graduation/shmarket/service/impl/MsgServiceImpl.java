package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.Msg;
import com.graduation.shmarket.mapper.MsgMapper;
import com.graduation.shmarket.service.IMsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class MsgServiceImpl extends ServiceImpl<MsgMapper, Msg> implements IMsgService {

}
