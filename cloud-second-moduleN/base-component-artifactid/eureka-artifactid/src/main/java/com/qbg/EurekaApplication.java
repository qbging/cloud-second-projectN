package com.qbg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

/**
 * <p>Title:EurekaApplication.java</p>
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date : 2020/5/27 15:51</p>
 *
 * @author guoqb
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    protected static final Logger log = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(EurekaApplication.class, args);

        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.warn("EurekaApplication 使用profile为:{}" , profile);
        }
    }
}
