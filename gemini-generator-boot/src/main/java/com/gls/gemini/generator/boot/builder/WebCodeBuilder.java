package com.gls.gemini.generator.boot.builder;

import com.gls.gemini.generator.boot.constants.CodeEnums;
import com.gls.gemini.generator.boot.dto.ColumnDto;
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
 * web代码生成
 */
@Slf4j
@Component
public class WebCodeBuilder implements CodeBuilder {

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
        // 获取所有列信息
        Map<String, List<ColumnDto>> allColumns = datasourceService.getAllColumns();
        for (TableDto table : tables) {
            // 获取列信息
            List<ColumnDto> columns = allColumns.get(table.getTableName());
            // 获取模板数据
            Map<String, Object> templateData = TemplateDataConverter.convert(maven, datasource, table, columns);
            log.info("templateData: {}", templateData);

            // 生成文件 - boot controller
            this.createFile(root, templateData, CodeEnums.BOOT_CONTROLLER);
            // 生成文件 - boot converter
            this.createFile(root, templateData, CodeEnums.BOOT_CONVERTER);
            // 生成文件 - boot service
            this.createFile(root, templateData, CodeEnums.BOOT_SERVICE);
            // 生成文件 - boot mapper
            this.createFile(root, templateData, CodeEnums.BOOT_MAPPER);
            // 生成文件 - boot mapper xml
            this.createFile(root, templateData, CodeEnums.BOOT_MAPPER_XML);
            // 生成文件 - boot entity
            this.createFile(root, templateData, CodeEnums.BOOT_ENTITY);

            // 生成文件 - sdk feign
            this.createFile(root, templateData, CodeEnums.SDK_FEIGN);
            // 生成文件 - sdk vo
            this.createFile(root, templateData, CodeEnums.SDK_VO);
        }
    }
}
