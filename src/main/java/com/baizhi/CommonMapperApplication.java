package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.baizhi.mapper")
@SpringBootApplication
public class CommonMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonMapperApplication.class, args);
    }
}
