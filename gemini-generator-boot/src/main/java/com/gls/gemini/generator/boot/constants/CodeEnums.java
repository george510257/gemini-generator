package com.gls.gemini.generator.boot.constants;

import com.gls.gemini.common.core.interfaces.IEnums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CodeEnums implements IEnums {
    /**
     * 父项目pom文件
     */
    PARENT_POM(1, "父项目pom文件", "parent-pom.xml.vm", "/pom", "pom.xml", "{artifactId}"),

    /**
     * boot项目pom文件
     */
    BOOT_POM(2, "boot项目pom文件", "boot-pom.xml.vm", "/pom", "pom.xml", "{artifactId}/{artifactId}-boot"),
    /**
     * boot项目application
     */
    BOOT_APPLICATION(3, "boot项目application", "boot-application.java.vm", "/java", "{appName}BootApplication.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot"),
    /**
     * boot项目application.yml
     */
    BOOT_APPLICATION_YML(4, "boot项目application.yml", "boot-application.yml.vm", "/resources", "application.yml", "{artifactId}/{artifactId}-boot/src/main/resources"),
    /**
     * boot项目controller
     */
    BOOT_CONTROLLER(5, "boot项目controller", "boot-controller.java.vm", "/java", "{entityType}Controller.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/controller"),
    /**
     * boot项目converter
     */
    BOOT_CONVERTER(6, "boot项目converter", "boot-converter.java.vm", "/java", "{entityType}Converter.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/converter"),
    /**
     * boot项目entity
     */
    BOOT_ENTITY(7, "boot项目entity", "boot-entity.java.vm", "/java", "{entityType}.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/entity"),
    /**
     * boot项目mapper
     */
    BOOT_MAPPER(8, "boot项目mapper", "boot-mapper.java.vm", "/java", "{entityType}Mapper.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/mapper"),
    /**
     * boot项目mapper.xml
     */
    BOOT_MAPPER_XML(9, "boot项目mapper.xml", "boot-mapper.xml.vm", "/resources", "{entityType}Mapper.xml", "{artifactId}/{artifactId}-boot/src/main/resources/mapper"),
    /**
     * boot项目service
     */
    BOOT_SERVICE(10, "boot项目service", "boot-service.java.vm", "/java", "{entityType}Service.java", "{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/service"),

    /**
     * sdk项目pom文件
     */
    SDK_POM(11, "sdk项目pom文件", "sdk-pom.xml.vm", "/pom", "pom.xml", "{artifactId}/{artifactId}-sdk"),
    /**
     * sdk项目vo
     */
    SDK_VO(12, "sdk项目vo", "sdk-vo.java.vm", "/java", "{entityType}Vo.java", "{artifactId}/{artifactId}-sdk/src/main/java/{packagePath}/sdk/vo"),
    /**
     * sdk项目feign
     */
    SDK_FEIGN(13, "sdk项目feign", "sdk-feign.java.vm", "/java", "{entityType}Feign.java", "{artifactId}/{artifactId}-sdk/src/main/java/{packagePath}/sdk/feign");


    /**
     * 编码
     */
    private final Integer code;
    /**
     * 名称
     */
    private final String message;
    /**
     * 模板
     */
    private final String template;
    /**
     * 模板路径
     */
    private final String templatePath;
    /**
     * 文件名
     */
    private final String fileName;
    /**
     * 文件包
     */
    private final String filePackage;

}
