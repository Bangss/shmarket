package com.graduation.shmarket.service.impl;

import com.graduation.shmarket.model.entity.Comment;
import com.graduation.shmarket.mapper.CommentMapper;
import com.graduation.shmarket.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评价表 服务实现类
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
