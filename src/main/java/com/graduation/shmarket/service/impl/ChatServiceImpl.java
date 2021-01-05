package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.Chat;
import com.graduation.shmarket.mapper.ChatMapper;
import com.graduation.shmarket.service.IChatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 聊天室 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class ChatServiceImpl extends ServiceImpl<ChatMapper, Chat> implements IChatService {

}
