package com.demo.kings.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiangtao
 * @date 2019-09-01 00:54.
 */
@SpringBootApplication
@ComponentScan(value = {"com.demo"})
@ImportResource(locations = {"classpath:spring/*.xml"})
public class KingsApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(KingsApplication.class);
        application.run(args);
    }
}
