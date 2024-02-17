package com.gls.gemini.generator.boot.web.converter;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.gls.gemini.generator.boot.constants.DataTypeEnums;
import com.gls.gemini.generator.boot.dto.ColumnDto;
import com.gls.gemini.generator.boot.dto.TableDto;
import com.gls.gemini.generator.boot.vo.DatasourceVo;
import com.gls.gemini.generator.boot.vo.MavenVo;
import lombok.experimental.UtilityClass;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 模板数据转换器
 */
@UtilityClass
public class TemplateDataConverter {

    /**
     * 转换模板数据
     *
     * @param maven      maven信息
     * @param datasource 数据源信息
     * @param tables     表信息
     * @return 模板数据
     */
    public Map<String, Object> convert(MavenVo maven, DatasourceVo datasource, List<TableDto> tables, String tablePrefix) {
        Map<String, Object> templateData = new HashMap<>();
        templateData.putAll(convert(maven));
        templateData.putAll(convert(datasource));
        templateData.put("tables", convertTables(tables, tablePrefix));
        templateData.put("date", DateUtil.format(new Date(), DatePattern.NORM_DATE_PATTERN));
        return templateData;
    }

    /**
     * 转换模板数据
     *
     * @param maven      maven信息
     * @param datasource 数据源信息
     * @param table      表信息
     * @param columns    列信息
     * @return 模板数据
     */
    public Map<String, Object> convert(MavenVo maven, DatasourceVo datasource, TableDto table, String tablePrefix, List<ColumnDto> columns) {
        Map<String, Object> templateData = new HashMap<>();
        templateData.putAll(convert(maven));
        templateData.putAll(convert(datasource));
        templateData.putAll(convert(table, tablePrefix));
        templateData.put("columns", convertColumns(columns));
        templateData.put("date", DateUtil.format(new Date(), DatePattern.NORM_DATE_PATTERN));
        return templateData;
    }

    /**
     * 转换列信息
     *
     * @param columns 列信息
     * @return 列信息
     */
    private List<Map<String, Object>> convertColumns(List<ColumnDto> columns) {
        return columns.stream().map(TemplateDataConverter::convert).collect(Collectors.toList());
    }

    /**
     * 转换列信息
     *
     * @param columnDto 列信息
     * @return 列信息
     */
    private Map<String, Object> convert(ColumnDto columnDto) {
        Map<String, Object> templateData = BeanUtil.beanToMap(columnDto);
        // fieldName 例如：userId
        String fieldName = StrUtil.toCamelCase(columnDto.getColumnName());
        templateData.put("fieldName", fieldName);
        // fieldNameUpper 例如：UserId
        templateData.put("fieldNameUpper", StrUtil.upperFirst(fieldName));
        // columnNameUpper 例如：USER_ID
        templateData.put("columnNameUpper", columnDto.getColumnName().toUpperCase());
        // fieldType 例如：Long
        templateData.put("fieldType", convertFieldType(columnDto.getDataType()));
        return templateData;
    }

    /**
     * 转换数据类型
     *
     * @param dataType 数据类型
     * @return 数据类型
     */
    private String convertFieldType(String dataType) {
        return DataTypeEnums.getByDbDataType(dataType).getJavaDataType();
    }

    /**
     * 转换表信息
     *
     * @param tables 表信息
     * @return 表信息
     */
    private List<Map<String, Object>> convertTables(List<TableDto> tables, String tablePrefix) {
        return tables.stream().map(table -> convert(table, tablePrefix)).collect(Collectors.toList());
    }

    /**
     * 转换表信息
     *
     * @param tableDto    表信息
     * @param tablePrefix 表前缀
     * @return 表信息
     */
    private Map<String, Object> convert(TableDto tableDto, String tablePrefix) {
        Map<String, Object> templateData = BeanUtil.beanToMap(tableDto);
        // entityName 例如：sysUser
        String entityName = StrUtil.toCamelCase(StrUtil.removePrefix(tableDto.getTableName(), tablePrefix));
        templateData.put("entityName", entityName);
        // entityNameUpper 例如：SysUser
        templateData.put("entityNameUpper", StrUtil.upperFirst(entityName));
        return templateData;
    }

    /**
     * 转换数据源信息
     *
     * @param datasource 数据源信息
     * @return 数据源信息
     */
    private Map<String, Object> convert(DatasourceVo datasource) {
        Map<String, Object> templateData = new HashMap<>();
        // driverClassName 例如：com.mysql.cj.jdbc.Driver
        templateData.put("driverClassName", datasource.getDriverClassName());
        // url 例如：jdbc:mysql://localhost:3306/gemini?useUnicode=true&characterEncoding=utf-8&useSSL=false
        templateData.put("url", datasource.getUrl());
        // username 例如：root
        templateData.put("username", datasource.getUsername());
        // password 例如：123456
        templateData.put("password", datasource.getPassword());
        return templateData;
    }

    /**
     * 转换maven信息
     *
     * @param maven maven信息
     * @return maven信息
     */
    private Map<String, Object> convert(MavenVo maven) {
        Map<String, Object> templateData = BeanUtil.beanToMap(maven);
        // packagePath 例如：com/gls/gemini/generator
        templateData.put("packagePath", maven.getGroupId().replace(".", "/"));
        // appName 例如：generator
        String appName = maven.getArtifactId().substring(maven.getArtifactId().lastIndexOf("-") + 1);
        templateData.put("appName", appName);
        // appNameUpper 例如：Generator
        templateData.put("appNameUpper", StrUtil.upperFirst(appName));
        return templateData;
    }
}
