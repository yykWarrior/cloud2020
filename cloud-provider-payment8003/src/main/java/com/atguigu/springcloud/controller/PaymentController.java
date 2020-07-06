package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.properties.Properties;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("payment/add")
    public CommonResult add(@RequestBody Payment payment){
        paymentService.add(payment);
        log.info("端口号"+properties.getPort());
            return new CommonResult(200,"success","服务器8003插入");

    }

    @RequestMapping("pay/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for(String s:services){
            log.info("element"+s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for(ServiceInstance instance:instances){
            System.out.println(instance.getServiceId()+"-"+instance.getHost()+"-"+instance.getPort()+"-"+instance.getUri());
            log.info(instance.getServiceId()+"-"+instance.getHost()+"-"+instance.getPort()+"-"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
