package cn.dictionary.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description AuthServer认证授权微服务
 * @Author gejj
 * @Date 2023/6/5 22:24
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan("cn.dictionary.application.dao.mapper")
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class,args);
    }
}
