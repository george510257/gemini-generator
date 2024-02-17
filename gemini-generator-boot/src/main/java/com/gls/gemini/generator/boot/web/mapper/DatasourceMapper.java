package com.gls.gemini.generator.boot.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gls.gemini.generator.boot.dto.ColumnDto;
import com.gls.gemini.generator.boot.dto.TableDto;
import com.gls.gemini.generator.boot.web.entity.DatasourceEntity;

import java.util.List;

/**
 * 数据源管理 Mapper
 *
 * @author george
 */
public interface DatasourceMapper extends BaseMapper<DatasourceEntity> {
    List<TableDto> getTables();

    List<ColumnDto> getColumns(TableDto table);
}
