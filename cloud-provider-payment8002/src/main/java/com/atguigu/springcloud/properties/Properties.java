package com.atguigu.springcloud.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @version v1.0
 * @ClassName: Properties
 * @Description: TODO
 * @Author: yyk
 * @Date: 2020/5/13 20:28
 */
@Component
@ConfigurationProperties(prefix = "server")
@PropertySource("classpath:application.yml")
public class Properties {
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Properties() {
    }
}
