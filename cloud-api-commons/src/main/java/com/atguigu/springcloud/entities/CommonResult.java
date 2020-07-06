package com.atguigu.springcloud.entities;

/**
 * @version v1.0
 * @ClassName: CommonResult
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/8 19:45
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;
    private String message;
    private T data;
    /*public CommonResult ( Integer code , String message){
        this(code, message,data:null);
    }*/
}

