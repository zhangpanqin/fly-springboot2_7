package com.mflyyou.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangpanqin
 */
@SpringBootApplication
public class Springboot27Application {
    static String _$name = "小明";

    public static void main(String[] args) {
        SpringApplication.run(Springboot27Application.class, args);
        System.out.println(_$name);
    }

}
