package com.gls.gemini.generator.boot.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApplicationVo implements Serializable {

    /**
     * 应用名
     */
    private String name;
    /**
     * 应用名 - 首字母大写
     */
    private String nameUpper;
    /**
     * 应用名 - 全大写
     */
    private String nameUpperAll;
}
