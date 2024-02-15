package com.gls.gemini.generator.boot.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(title = "数据源信息", description = "数据源信息")
public class DataSourceVo implements Serializable {
    /**
     * 数据库地址 例如：jdbc:mysql://localhost:3306/gls?useUnicode=true&characterEncoding=utf-8&useSSL=false
     */
    @Schema(title = "数据库地址", description = "数据库地址 例如：jdbc:mysql://localhost:3306/gls?useUnicode=true&characterEncoding=utf-8&useSSL=false")
    private String url;
    /**
     * 用户名 例如：root
     */
    @Schema(title = "用户名", description = "用户名 例如：root")
    private String username = "root";
    /**
     * 密码 例如：root
     */
    @Schema(title = "密码", description = "密码 例如：root")
    private String password = "root";
    /**
     * 驱动 例如：com.mysql.cj.jdbc.Driver
     */
    @Schema(title = "驱动", description = "驱动 例如：com.mysql.cj.jdbc.Driver")
    private String driverClassName = "com.mysql.cj.jdbc.Driver";
}
