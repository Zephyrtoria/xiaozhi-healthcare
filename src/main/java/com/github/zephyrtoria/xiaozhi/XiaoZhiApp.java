package com.github.zephyrtoria.xiaozhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.zephyrtoria.xiaozhi.mapper")
public class XiaoZhiApp {
    public static void main(String[] args) {
        SpringApplication.run(XiaoZhiApp.class, args);
    }
}
