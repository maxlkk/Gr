package com.lkk.myb1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages= {"com.lkk.myb1.mapper"})
public class Myb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Myb1Application.class, args);
    }

}
