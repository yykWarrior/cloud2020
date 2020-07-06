package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @ClassName: OrderController
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/10 21:33
 */
@RestController
public class OrderController {
    //private static final String PAYMENT_URL="http://localhost:8002";
    private static final String PAYMENT_URL="http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;
    @GetMapping("resume/create")
    public CommonResult create( Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/add",payment,CommonResult.class);
    }
}
