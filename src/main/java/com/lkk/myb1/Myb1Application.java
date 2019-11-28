package com.lkk.myb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages= {"com.lkk.myb1.mapper"})
public class Myb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Myb1Application.class, args);
    }

}
