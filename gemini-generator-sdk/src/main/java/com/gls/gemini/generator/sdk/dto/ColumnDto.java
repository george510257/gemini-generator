package com.gls.gemini.generator.sdk.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 列信息
 */
@Data
public class ColumnDto implements Serializable {
    /**
     * 列名 例如：id
     */
    private String columnName;
    /**
     * 列注释 例如：主键
     */
    private String columnComment;
    /**
     * 列类型 例如：bigint(20)
     */
    private String dataType;
    /**
     * 排序
     */
    private Long ordinalPosition;
    /**
     * 表名
     */
    private String tableName;

}
