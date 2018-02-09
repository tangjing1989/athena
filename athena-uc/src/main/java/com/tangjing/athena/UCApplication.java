package com.tangjing.athena;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@MapperScan ("com.tangjing.athena.uc.dao")
public class UCApplication {

    public static void main ( String[] args ) {
        SpringApplication.run(UCApplication.class);
    }
}
