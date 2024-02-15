package com.gls.gemini.generator.boot.web.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gls.gemini.starter.mybatis.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 数据源管理 实体
 *
 * @author george
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
     * 名称
     */
    private String name;
    /**
     * URL
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
     * 类型 0:mysql 1:oracle 2:sqlserver 3:postgresql
     */
    private Integer type;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态 0:正常 1:禁用
     */
    private Integer status;

}
