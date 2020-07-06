package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @version v1.0
 * @ClassName: PaymentSonsulController
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/14 21:46
 */
@RestController
public class PaymentSonsulController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/consul")
    public String paymentzk(){
        return "zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
