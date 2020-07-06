package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @version v1.0
 * @ClassName: TemConfig
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/10 21:30
 */
@Configuration
public class TemConfig {
    @Bean
    @LoadBalanced
    //ribbon做负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
