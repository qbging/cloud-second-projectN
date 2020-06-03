package com.qbg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>Title:GateWayApplication.java</p>
 * <p>Copyright: 公共服务与应急管理战略业务本部 Copyright(c)2018</p >
 * <p>Date : 2020/6/2 14:35</p>
 *
 * @author guoqb
 * @version 1.0
 */
@SpringBootApplication
public class GateWayApplication {
    protected static final Logger log = LoggerFactory.getLogger(GateWayApplication.class);
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(GateWayApplication.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();

        for (String profile : activeProfiles) {
            log.warn("ConfigApplication 使用profile为:{}" , profile);
        }
    }
}
