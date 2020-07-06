package com.atguigu.rbrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version v1.0
 * @ClassName: MySelfRule
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/7/4 9:45
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule_yyk();
    }
}
