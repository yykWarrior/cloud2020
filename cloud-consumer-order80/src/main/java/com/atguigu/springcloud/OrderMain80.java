package com.atguigu.springcloud;

import com.atguigu.rbrule.MySelfRule;
import com.atguigu.springcloud.config.TemConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @version v1.0
 * @ClassName: OrderMain80
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/10 21:28
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
