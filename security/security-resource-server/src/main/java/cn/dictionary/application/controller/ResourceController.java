package cn.dictionary.application.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gejj
 * @data 2023/6/7 16:32
 */
@RestController
public class ResourceController {

    @RequestMapping("/employee/list")
    //这是一个测试方法，如果资源服务器对token校验通过就能够访问该资源
    @PreAuthorize("hasAnyAuthority('employee:list')")
    public String list(){
        return "您的token验证通过,已经访问到真正的资源 employee:list";
    }

    @RequestMapping("/employee/add")
    //这是一个测试方法，如果资源服务器对token校验通过就能够访问该资源
    @PreAuthorize("hasAnyAuthority('employee:add')")
    public String add(){
        return "您的token验证通过,已经访问到真正的资源 employee:add";
    }
}
