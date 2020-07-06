package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName: Dept
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/7/2 11:13
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain =true)
public class Dept implements Serializable {
    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;
}
