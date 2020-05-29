package com.qbg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>Title:ConfigApplication.java</p>
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date : 2020/5/28 17:20</p>
 *
 * @author guoqb
 * @version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {
    protected static final Logger log = LoggerFactory.getLogger(ConfigApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();

        for (String profile : activeProfiles) {
            log.warn("ConfigApplication 使用profile为:{}" , profile);
        }
    }
}
