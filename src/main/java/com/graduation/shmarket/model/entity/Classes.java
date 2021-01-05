package com.graduation.shmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 类别表
 * </p>
 *
 * @author Bangss
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类别编号
     */
    @TableId(value = "c_id", type = IdType.AUTO)
    private Integer cId;

    /**
     * 类别名称
     */
    private String cName;

    /**
     * 该类商品总数
     */
    private Integer cNum;


}
