package com.gls.gemini.generator.boot.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "数据源信息", description = "数据源信息")
public class DatasourceVo extends BaseVo implements Serializable {
    /**
     * 数据源名称 例如：gls
     */
    @ExcelProperty(value = "数据源名称")
    @Schema(title = "数据源名称", description = "数据源名称 例如：gls")
    private String name;
    /**
     * 数据库地址 例如：jdbc:mysql://localhost:3306/gls?useUnicode=true&characterEncoding=utf-8&useSSL=false
     */
    @ExcelProperty(value = "数据库地址")
    @Schema(title = "数据库地址", description = "数据库地址 例如：jdbc:mysql://localhost:3306/gls?useUnicode=true&characterEncoding=utf-8&useSSL=false")
    private String url;
    /**
     * 用户名 例如：root
     */
    @ExcelProperty(value = "用户名")
    @Schema(title = "用户名", description = "用户名 例如：root")
    private String username = "root";
    /**
     * 密码 例如：root
     */
    @ExcelProperty(value = "密码")
    @Schema(title = "密码", description = "密码 例如：root")
    private String password = "root";
    /**
     * 驱动 例如：com.mysql.cj.jdbc.Driver
     */
    @ExcelProperty(value = "驱动")
    @Schema(title = "驱动", description = "驱动 例如：com.mysql.cj.jdbc.Driver")
    private String driverClassName = "com.mysql.cj.jdbc.Driver";
    /**
     * 数据源类型 0:mysql 1:oracle 2:sqlserver 3:postgresql
     */
    @ExcelProperty(value = "数据源类型")
    @Schema(title = "数据源类型", description = "数据源类型 0:mysql 1:oracle 2:sqlserver 3:postgresql ")
    private Integer type;
    /**
     * 描述 例如：gls数据源
     */
    @ExcelProperty(value = "描述")
    @Schema(title = "描述", description = "描述 例如：gls数据源")
    private String description;
    /**
     * 状态 0:正常 1:禁用
     */
    @ExcelProperty(value = "状态")
    @Schema(title = "状态", description = "状态 0:正常 1:禁用")
    private Integer status;
}
