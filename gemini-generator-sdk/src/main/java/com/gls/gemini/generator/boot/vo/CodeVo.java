package com.gls.gemini.generator.boot.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(title = "代码生成", description = "代码生成")
public class CodeVo implements Serializable {

    /**
     * maven 信息
     */
    @Schema(title = "maven 信息", description = "maven 信息")
    private MavenVo maven;

    /**
     * 数据源信息
     */
    @Schema(title = "数据源信息", description = "数据源信息")
    private DatasourceVo datasource;

    /**
     * 表名前缀
     */
    @Schema(title = "表名前缀", description = "表名前缀")
    private String tablePrefix;

}
