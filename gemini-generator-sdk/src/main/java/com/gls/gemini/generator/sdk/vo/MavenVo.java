package com.gls.gemini.generator.sdk.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * maven 信息
 */
@Data
@Schema(title = "maven 信息", description = "maven 信息")
public class MavenVo implements Serializable {
    /**
     * groupId 例如：com.gls.gemini.generator
     */
    @Schema(title = "groupId", description = "groupId 例如：com.gls.gemini.generator")
    private String groupId;
    /**
     * artifactId 例如：gemini-generator
     */
    @Schema(title = "artifactId", description = "artifactId 例如：gemini-generator")
    private String artifactId;
    /**
     * version 例如：0.0.1-SNAPSHOT
     */
    @Schema(title = "version", description = "version 例如：0.0.1-SNAPSHOT")
    private String version;
    /**
     * name 例如：generator
     */
    @Schema(title = "name", description = "name 例如：generator")
    private String name;
    /**
     * description 例如：代码生成器
     */
    @Schema(title = "description", description = "description 例如：代码生成器")
    private String description;
    /**
     * parentVersion 例如：0.0.1-SNAPSHOT
     */
    @Schema(title = "parentVersion", description = "parentVersion 例如：0.0.1-SNAPSHOT")
    private String parentVersion;
}
