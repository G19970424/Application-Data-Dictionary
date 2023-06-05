package cn.dictionary.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description AuthServer认证授权微服务
 * @Author gejj
 * @Date 2023/6/5 22:24
 * @Version 1.0
 **/
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
