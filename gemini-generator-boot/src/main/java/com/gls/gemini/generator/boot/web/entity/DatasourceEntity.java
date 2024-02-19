package com.gls.gemini.generator.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 数据源表 实体类
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_datasource")
public class DatasourceEntity extends BaseEntity {

    public static final String COL_NAME = "name";
    public static final String COL_URL = "url";
    public static final String COL_USERNAME = "username";
    public static final String COL_PASSWORD = "password";
    public static final String COL_DRIVER_CLASS_NAME = "driver_class_name";
    public static final String COL_TYPE = "type";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_STATUS = "status";
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 数据源名称
     */
    private String name;
    /**
     * 数据源url
     */
    private String url;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 驱动类名
     */
    private String driverClassName;
    /**
     * 数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL
     */
    private Boolean type;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态 0:禁用 1:启用
     */
    private Boolean status;
}
