package com.zhongbenshuo.pepper;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.zhongbenshuo.pepper.mapper")//springboot的Mapper扫描的路径
public class PepperApplication {

    public static void main(String[] args) {

        SpringApplication.run(PepperApplication.class, args);
        log.info("************************************** 项目启动成功 **************************************");
    }

}
