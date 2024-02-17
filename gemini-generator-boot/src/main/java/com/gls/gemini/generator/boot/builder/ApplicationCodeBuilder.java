package com.gls.gemini.generator.boot.builder;

import com.gls.gemini.generator.boot.constants.CodeEnums;
import com.gls.gemini.generator.boot.dto.TableDto;
import com.gls.gemini.generator.boot.vo.CodeVo;
import com.gls.gemini.generator.boot.vo.DatasourceVo;
import com.gls.gemini.generator.boot.vo.MavenVo;
import com.gls.gemini.generator.boot.web.converter.TemplateDataConverter;
import com.gls.gemini.generator.boot.web.service.DatasourceService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * 应用级代码生成
 */
@Slf4j
@Component
public class ApplicationCodeBuilder implements CodeBuilder {
    /**
     * 数据源服务
     */
    @Resource
    private DatasourceService datasourceService;

    /**
     * 生成代码
     *
     * @param root   根目录
     * @param codeVo 代码请求
     */
    @Override
    public void createFile(File root, CodeVo codeVo) {
        // 获取maven信息
        MavenVo maven = codeVo.getMaven();
        // 获取数据源信息
        DatasourceVo datasource = codeVo.getDatasource();
        // 获取表信息
        List<TableDto> tables = datasourceService.getAllTables();
        // 获取模板数据
        Map<String, Object> templateData = TemplateDataConverter.convert(maven, datasource, tables, codeVo.getTablePrefix());
        log.info("templateData: {}", templateData);

        // 生成文件 - 父pom
        this.createFile(root, templateData, CodeEnums.PARENT_POM);

        // 生成文件 - boot pom
        this.createFile(root, templateData, CodeEnums.BOOT_POM);
        // 生成文件 - boot application
        this.createFile(root, templateData, CodeEnums.BOOT_APPLICATION);
        // 生成文件 - boot application yml
        this.createFile(root, templateData, CodeEnums.BOOT_APPLICATION_YML);

        // 生成文件 - sdk pom
        this.createFile(root, templateData, CodeEnums.SDK_POM);
    }
}
