package com.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/2/21 0021.
 *
 * 没有application.properties文件时，启动出错,log4j……。
 *
 * 引入<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
    ，会自动添加一些rest风格管理服务，如/error,/info,/health……
 *
 *
 *
 * @SpringBootApplication <==> @Configuration, @EnableAutoConfiguration，@ComponentScan组合
 *
 */
@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext context) {
        return args -> {
            System.out.println("Spring Boot提供的bean:");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
