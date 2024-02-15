package com.gls.gemini.generator.boot.vo;

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
     * packaging 例如：jar
     */
    @Schema(title = "packaging", description = "packaging 例如：jar")
    private String packaging;
    /**
     * javaVersion 例如：1.8
     */
    @Schema(title = "javaVersion", description = "javaVersion 例如：1.8")
    private String javaVersion;
    /**
     * springBootVersion 例如：2.5.0
     */
    @Schema(title = "springBootVersion", description = "springBootVersion 例如：2.5.0")
    private String springBootVersion;
    /**
     * parentGroupId 例如：com.gls.gemini
     */
    @Schema(title = "parentGroupId", description = "parentGroupId 例如：com.gls.gemini")
    private String parentGroupId;
    /**
     * parentArtifactId 例如：gemini-project
     */
    @Schema(title = "parentArtifactId", description = "parentArtifactId 例如：gemini-project")
    private String parentArtifactId;
    /**
     * parentVersion 例如：0.0.1-SNAPSHOT
     */
    @Schema(title = "parentVersion", description = "parentVersion 例如：0.0.1-SNAPSHOT")
    private String parentVersion;
}
