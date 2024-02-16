package com.gls.gemini.generator.boot.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 表信息
 */
@Data
public class TableDto implements Serializable {
    /**
     * 表名 例如：sys_user
     */
    private String tableName;
    /**
     * 表注释 例如：用户表
     */
    private String tableComment;
    /**
     * 列信息
     */
    private List<ColumnDto> columns = new ArrayList<>();

}
