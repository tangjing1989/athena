package com.tangjing.athena;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
@MapperScan ("com.tangjing.athena.baseServer.dao")
public class BaseServerApplication {
    public static void main ( String[] args ) {
        SpringApplication.run(BaseServerApplication.class);
    }

}
