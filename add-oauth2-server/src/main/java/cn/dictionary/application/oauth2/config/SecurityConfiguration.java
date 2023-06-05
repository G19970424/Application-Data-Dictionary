package cn.dictionary.application.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.web.SecurityFilterChain;

import javax.annotation.Resource;

/**
 * @author gejj
 * @data 2023/6/5 15:33
 */
@Configuration
public class SecurityConfiguration  {

    @Resource
    private RedisConnectionFactory factory;

    @Bean
    public RedisTokenStore redisTokenStore(){
        RedisTokenStore redisTokenStore = new RedisTokenStore(factory);
        redisTokenStore.setPrefix("TOKEN:");
        return redisTokenStore;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }

    @Bean
    public AuthenticationManager authenticationManager(){
        return
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http){
        http.passwordManagement(passwordEncoder)
    }
}
