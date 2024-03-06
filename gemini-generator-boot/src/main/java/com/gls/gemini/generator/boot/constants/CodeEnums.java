package com.gls.gemini.generator.boot.constants;

import com.gls.gemini.common.core.interfaces.IEnums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 代码生成器枚举
 */
@Getter
@RequiredArgsConstructor
public enum CodeEnums implements IEnums {
    /**
     * 父项目pom文件
     */
    PARENT_POM(1, "父项目pom文件", "/pom/parent-pom.xml.vm", "/{artifactId}/pom.xml"),
    /**
     * 父项目.gitignore配置文件
     */
    PARENT_GIT_IGNORE(2, ".gitignore配置文件", "/resources/parent-gitignore.vm", "/{artifactId}/.gitignore"),
    /**
     * 父项目README.md配置文件
     */
    PARENT_README_MD(3, "README.md配置文件", "/resources/parent-readme.md.vm", "/{artifactId}/README.md"),
    /**
     * boot项目pom文件
     */
    BOOT_POM(4, "boot项目pom文件", "/pom/boot-pom.xml.vm", "/{artifactId}/{artifactId}-boot/pom.xml"),
    /**
     * boot项目Application.java
     */
    BOOT_APPLICATION(5, "boot项目Application.java", "/java/boot-application.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/{appNameUpper}BootApplication.java"),
    /**
     * boot项目application.yml
     */
    BOOT_APPLICATION_YML(6, "boot项目application.yml", "/resources/boot-application.yml.vm", "/{artifactId}/{artifactId}-boot/src/main/resources/application.yml"),
    /**
     * boot项目Controller.java
     */
    BOOT_CONTROLLER(7, "boot项目Controller.java", "/java/boot-controller.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/controller/{entityNameUpper}Controller.java"),
    /**
     * boot项目Converter.java
     */
    BOOT_CONVERTER(8, "boot项目Converter.java", "/java/boot-converter.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/converter/{entityNameUpper}Converter.java"),
    /**
     * boot项目Entity.java
     */
    BOOT_ENTITY(9, "boot项目Entity.java", "/java/boot-entity.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/entity/{entityNameUpper}Entity.java"),
    /**
     * boot项目Mapper.java
     */
    BOOT_MAPPER(10, "boot项目Mapper.java", "/java/boot-mapper.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/mapper/{entityNameUpper}Mapper.java"),
    /**
     * boot项目Mapper.xml
     */
    BOOT_MAPPER_XML(11, "boot项目Mapper.xml", "/resources/boot-mapper.xml.vm", "/{artifactId}/{artifactId}-boot/src/main/resources/mapper/{entityNameUpper}Mapper.xml"),
    /**
     * boot项目Service.java
     */
    BOOT_SERVICE(12, "boot项目Service.java", "/java/boot-service.java.vm", "/{artifactId}/{artifactId}-boot/src/main/java/{packagePath}/boot/web/service/{entityNameUpper}Service.java"),
    /**
     * sdk项目pom文件
     */
    SDK_POM(13, "sdk项目pom文件", "/pom/sdk-pom.xml.vm", "/{artifactId}/{artifactId}-sdk/pom.xml"),
    /**
     * sdk项目Vo.java
     */
    SDK_VO(14, "sdk项目Vo.java", "/java/sdk-vo.java.vm", "/{artifactId}/{artifactId}-sdk/src/main/java/{packagePath}/sdk/vo/{entityNameUpper}Vo.java"),
    /**
     * sdk项目FeignClient.java
     */
    SDK_FEIGN(15, "sdk项目FeignClient.java", "/java/sdk-feign.java.vm", "/{artifactId}/{artifactId}-sdk/src/main/java/{packagePath}/sdk/feign/{entityNameUpper}Feign.java"),
    /**
     * sdk项目SdkAutoConfig.java
     */
    SDK_AUTO_CONFIG(16, "sdk项目SdkAutoConfig.java", "/java/sdk-auto-config.java.vm", "/{artifactId}/{artifactId}-sdk/src/main/java/{packagePath}/sdk/{appNameUpper}SdkAutoConfig.java"),
    /**
     * sdk项目imports文件
     */
    SDK_IMPORTS(17, "sdk项目imports文件", "/resources/sdk-imports.vm", "/{artifactId}/{artifactId}-sdk/src/main/resources/META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports"),
    ;

    /**
     * 编码
     */
    private final Integer code;
    /**
     * 消息
     */
    private final String message;
    /**
     * 模板路径
     */
    private final String template;
    /**
     * 文件路径
     */
    private final String fileName;

}
