package cn.dictionary.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author gejj
 * @data 2023/6/6 16:08
 */
@Configuration
@EnableWebSecurity(debug = false)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()   //屏蔽跨域防护
                .authorizeRequests()    //进行授权处理
                .antMatchers("/login").permitAll() //允许访问登录接口
                .anyRequest().authenticated() //拦截其他路径
                .and().formLogin()  //允许表单提交
                .and().logout().permitAll();    //登出
    }
}
