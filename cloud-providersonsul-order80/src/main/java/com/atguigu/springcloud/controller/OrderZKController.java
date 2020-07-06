package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @ClassName: OrderZKController
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/14 10:52
 */
@RestController
public class OrderZKController {
    private final static String URL="http://consul-provider-service";
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("consumer/add")
    public String paymentInfo(){
        return restTemplate.getForObject(URL+"/payment/consul",String.class);
    }


}
