package com.gls.gemini.generator.boot;

import com.gls.gemini.generator.boot.constants.GeneratorProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Gemini Generator 启动类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@EnableConfigurationProperties({GeneratorProperties.class})
public class GeneratorBootApplication {
    /**
     * Gemini Generator启动入口
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(GeneratorBootApplication.class, args);
    }
}