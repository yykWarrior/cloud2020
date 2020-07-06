package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version v1.0
 * @ClassName: PaymentSonsulMain80
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/14 21:44
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentSonsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSonsulMain80.class);
    }
}
