package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.Login;
import com.graduation.shmarket.mapper.LoginMapper;
import com.graduation.shmarket.service.ILoginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录表 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login> implements ILoginService {

}
