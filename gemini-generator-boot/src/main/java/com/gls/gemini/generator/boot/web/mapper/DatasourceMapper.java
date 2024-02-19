package com.gls.gemini.generator.boot.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gls.gemini.generator.boot.web.entity.DatasourceEntity;
import com.gls.gemini.generator.sdk.dto.ColumnDto;
import com.gls.gemini.generator.sdk.dto.TableDto;

import java.util.List;

/**
 * 数据源表 Mapper
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-19
 */
public interface DatasourceMapper extends BaseMapper<DatasourceEntity> {
    /**
     * 获取所有表
     *
     * @return 表信息
     */
    List<TableDto> getAllTables();

    /**
     * 获取所有列
     *
     * @return 列信息
     */
    List<ColumnDto> getAllColumns();
}
