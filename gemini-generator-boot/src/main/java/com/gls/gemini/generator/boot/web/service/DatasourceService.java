package com.gls.gemini.generator.boot.web.service;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gls.gemini.generator.boot.dto.ColumnDto;
import com.gls.gemini.generator.boot.dto.TableDto;
import com.gls.gemini.generator.boot.vo.DatasourceVo;
import com.gls.gemini.generator.boot.web.converter.DatasourceConverter;
import com.gls.gemini.generator.boot.web.entity.DatasourceEntity;
import com.gls.gemini.generator.boot.web.mapper.DatasourceMapper;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据源管理 service
 *
 * @author george
 */
@Slf4j
@Service
public class DatasourceService extends BaseServiceImpl<DatasourceConverter, DatasourceMapper, DatasourceVo, DatasourceEntity> {

    @Resource
    private DynamicRoutingDataSource dataSource;

    public List<TableDto> getTables() {
        return baseMapper.getTables();
    }

    public List<ColumnDto> getColumns(TableDto table) {
        return baseMapper.getColumns(table);
    }

    public void switchDatasource(DatasourceVo datasource) {
        // 查询数据源是否存在
        boolean exists = baseMapper.exists(new QueryWrapper<DatasourceEntity>().eq(DatasourceEntity.COL_NAME, datasource.getName()));
        if (!exists) {
            log.error("数据源不存在: {}", datasource);
            this.insert(datasource);
            dataSource.afterPropertiesSet();
        }
        // 切换数据源
        DynamicDataSourceContextHolder.push(datasource.getName());
    }
}
