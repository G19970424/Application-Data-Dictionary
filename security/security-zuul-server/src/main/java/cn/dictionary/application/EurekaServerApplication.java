package cn.dictionary.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @Description ZuulServer网关微服务
 * @Author gejj
 * @Date 2023/6/5 22:23
 * @Version 1.0
 **/
@SpringBootApplication
@EnableZuulServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
