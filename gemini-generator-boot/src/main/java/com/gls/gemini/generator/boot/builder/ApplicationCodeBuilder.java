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

@Slf4j
@Component
public class ApplicationCodeBuilder implements CodeBuilder {
    @Resource
    private DatasourceService datasourceService;

    @Override
    public void createFile(File root, CodeVo codeVo) {
        MavenVo maven = codeVo.getMaven();
        DatasourceVo datasource = codeVo.getDatasource();
        List<TableDto> tables = datasourceService.getTables(datasource);

        Map<String, Object> templateData = TemplateDataConverter.convert(maven, datasource, tables);
        log.info("templateData: {}", templateData);
        createFile(root, templateData, CodeEnums.PARENT_POM);
        createFile(root, templateData, CodeEnums.BOOT_POM);
        createFile(root, templateData, CodeEnums.BOOT_APPLICATION);
        createFile(root, templateData, CodeEnums.BOOT_APPLICATION_YML);
        createFile(root, templateData, CodeEnums.SDK_POM);
    }
}
