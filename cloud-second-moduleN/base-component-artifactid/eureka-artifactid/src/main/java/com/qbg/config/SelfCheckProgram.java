package com.qbg.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SelfCheckProgram implements CommandLineRunner {

    @Value("${spring.cloud.client.ip-address}")
    private String ip;
    @Value("${spring.cloud.client.hostname}")
    private String hostName;

    @Override
    public void run(String... strings) throws Exception {
        log.warn("spring.cloud.client.ip-address = {}" ,ip);
        log.warn("spring.cloud.client.hostname = {}", hostName);
    }
}
