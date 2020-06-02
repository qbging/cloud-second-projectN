package com.qbg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>Title:ConfigClientApplication.java</p>
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date : 2020/6/1 15:56</p>
 *
 * @author guoqb
 * @version 1.0
 */
//@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication {
    protected static final Logger log = LoggerFactory.getLogger(ConfigClientApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigClientApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();

        for (String profile : activeProfiles) {
            log.warn("ConfigApplication 使用profile为:{}" , profile);
        }
    }
}
