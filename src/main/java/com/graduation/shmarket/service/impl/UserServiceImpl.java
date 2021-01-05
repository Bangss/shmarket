package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.User;
import com.graduation.shmarket.mapper.UserMapper;
import com.graduation.shmarket.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
