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
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 数据源管理 service
 *
 * @author george
 */
@Slf4j
@Service
public class DatasourceService extends BaseServiceImpl<DatasourceConverter, DatasourceMapper, DatasourceVo, DatasourceEntity> {

    /**
     * 动态数据源
     */
    @Resource
    private DynamicRoutingDataSource dataSource;

    /**
     * 切换数据源
     *
     * @param datasource 数据源
     */
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

    /**
     * 清除数据源
     */
    public void clearDatasource() {
        DynamicDataSourceContextHolder.clear();
    }

    /**
     * 获取所有表
     *
     * @return 表信息
     */
    public List<TableDto> getAllTables() {
        return baseMapper.getAllTables();
    }

    /**
     * 获取所有列
     *
     * @return 列信息
     */
    public Map<String, List<ColumnDto>> getAllColumns() {
        List<ColumnDto> allColumns = baseMapper.getAllColumns();
        return allColumns.stream().collect(Collectors.groupingBy(ColumnDto::getTableName));
    }
}
