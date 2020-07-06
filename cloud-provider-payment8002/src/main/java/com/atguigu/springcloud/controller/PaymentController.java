package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.properties.Properties;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version v1.0
 * @ClassName: PaymentController
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/8 20:28
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Autowired
    private Properties properties;

    @PostMapping("payment/add")
    public CommonResult add(@RequestBody Payment payment){
        paymentService.add(payment);
        log.info("端口号"+properties.getPort());
            return new CommonResult(200,"success","服务器8002插入");

    }
}
