package com.atguigu.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName: Payment
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/8 19:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
