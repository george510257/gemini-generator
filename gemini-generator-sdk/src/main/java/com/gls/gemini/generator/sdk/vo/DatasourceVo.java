package com.gls.gemini.generator.sdk.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.gls.gemini.sdk.core.vo.BaseVo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据源表 Vo
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Schema(title = "datasource", description = "数据源表Vo")
public class DatasourceVo extends BaseVo {

    /**
     * 数据源名称
     */
    @ExcelProperty(value = "数据源名称")
    @Schema(title = "数据源名称", description = "数据源名称")
    private String name;
    /**
     * 数据源url
     */
    @ExcelProperty(value = "数据源url")
    @Schema(title = "数据源url", description = "数据源url")
    private String url;
    /**
     * 用户名
     */
    @ExcelProperty(value = "用户名")
    @Schema(title = "用户名", description = "用户名")
    private String username;
    /**
     * 密码
     */
    @ExcelProperty(value = "密码")
    @Schema(title = "密码", description = "密码")
    private String password;
    /**
     * 驱动类名
     */
    @ExcelProperty(value = "驱动类名")
    @Schema(title = "驱动类名", description = "驱动类名")
    private String driverClassName;
    /**
     * 数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL
     */
    @ExcelProperty(value = "数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL")
    @Schema(title = "数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL", description = "数据源类型 0:MySQL 1:Oracle 2:SQLServer 3:PostgreSQL")
    private Integer type;
    /**
     * 描述
     */
    @ExcelProperty(value = "描述")
    @Schema(title = "描述", description = "描述")
    private String description;
    /**
     * 状态 0:禁用 1:启用
     */
    @ExcelProperty(value = "状态 0:禁用 1:启用")
    @Schema(title = "状态 0:禁用 1:启用", description = "状态 0:禁用 1:启用")
    private Integer status;
}
