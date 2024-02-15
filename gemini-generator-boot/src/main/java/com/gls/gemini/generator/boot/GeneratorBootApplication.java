package com.gls.gemini.generator.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成启动类
 */
@SpringBootApplication
public class GeneratorBootApplication {
    /**
     * 启动方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(GeneratorBootApplication.class, args);
    }
}