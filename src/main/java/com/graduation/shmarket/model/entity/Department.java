package com.graduation.shmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学院表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学院编号
     */
    @TableId(value = "dep_id", type = IdType.AUTO)
    private Integer depId;

    /**
     * 学院名称
     */
    private String depName;


}
