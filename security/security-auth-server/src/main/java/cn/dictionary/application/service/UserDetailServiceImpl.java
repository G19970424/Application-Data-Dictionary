package cn.dictionary.application.service;

import cn.dictionary.application.dao.mapper.PermissionMapper;
import cn.dictionary.application.dao.mapper.UserMapper;
import cn.dictionary.application.dao.pojo.Permission;
import cn.dictionary.application.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author gejj
 * @data 2023/6/6 15:57
 */
@Component
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    /**
     * spring security自定义用户认证方法
     * @param s
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User userFromDB = userMapper.selectByUsername(s);
        if(null == userFromDB){
            throw new RuntimeException("无效的用户");
        }
        String password = userFromDB.getPassword();

        //查询用户的权限
        List<Permission> permission = permissionMapper.selectPermissionsByUserId(userFromDB.getId());

        //用户的权限列表,暂时为空
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        permission.forEach(e->{
            System.out.println("用户："+userFromDB.getUsername()+" 加载权限："+e.getExpression());
            authorities.add(new SimpleGrantedAuthority(e.getExpression()));
        });
        //注意：这里的User是Security的User不是我们自己的User
        org.springframework.security.core.userdetails.User  user = new org.springframework.security.core.userdetails.User (s,new BCryptPasswordEncoder().encode(password), authorities);

        return user;
    }
}
