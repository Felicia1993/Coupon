package com.xdclass.couponapp;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.xdclass.userapp.service")
@MapperScan("com.xdclass.couponapp.mapper")//扫描当前package下的所有包
public class CouponAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponAppApplication.class, args);
    }
    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        public void run() {
            System.out.println("JVM shutdown hook");
        }
    }));
}
