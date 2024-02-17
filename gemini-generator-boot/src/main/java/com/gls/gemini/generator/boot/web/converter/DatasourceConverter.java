package com.gls.gemini.generator.boot.web.converter;

import com.gls.gemini.common.core.base.BaseConverter;
import com.gls.gemini.generator.boot.web.entity.DatasourceEntity;
import com.gls.gemini.generator.sdk.vo.DatasourceVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * 数据源管理 转换器
 *
 * @author george
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface DatasourceConverter extends BaseConverter<DatasourceVo, DatasourceEntity> {
}
