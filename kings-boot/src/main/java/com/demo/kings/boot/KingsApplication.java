package com.demo.kings.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiangtao
 * @date 2019-09-01 00:54.
 */
@SpringBootApplication
@ComponentScan(value = {"com.demo"})
public class KingsApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(KingsApplication.class);
        application.run(args);
    }
}
