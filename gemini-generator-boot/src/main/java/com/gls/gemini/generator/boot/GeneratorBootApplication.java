package com.gls.gemini.generator.boot;

import com.gls.gemini.generator.boot.constants.GeneratorProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 代码生成启动类
 */
@SpringBootApplication
@EnableConfigurationProperties({GeneratorProperties.class})
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