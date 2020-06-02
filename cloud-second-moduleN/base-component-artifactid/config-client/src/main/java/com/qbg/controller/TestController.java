package com.qbg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title:TestController.java</p>
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date : 2020/6/1 16:00</p>
 *
 * @author guoqb
 * @version 1.0
 */
//#配置手动刷新 配置中心 1.依赖，2.配置management.endpoints..，3.controller添加@RefreshScope,4.post请求“http://clientadress/actuator/refresh”
@RefreshScope
@RestController
@RequestMapping("/")
public class TestController {

    @Value("${userinfo.username}")
    String username;
    @Value("${userinfo.password}")
    String password;

    @GetMapping("/test")
    public String test(){
        return "username:" + username + ",password:" + password;
    }
}
