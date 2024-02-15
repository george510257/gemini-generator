package com.gls.gemini.generator.boot.web.service;

import com.gls.gemini.generator.boot.vo.DatasourceVo;
import com.gls.gemini.generator.boot.web.converter.DatasourceConverter;
import com.gls.gemini.generator.boot.web.entity.DatasourceEntity;
import com.gls.gemini.generator.boot.web.mapper.DatasourceMapper;
import com.gls.gemini.starter.mybatis.base.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 数据源管理 service
 *
 * @author george
 */
@Slf4j
@Service
public class DatasourceService extends BaseServiceImpl<DatasourceConverter, DatasourceMapper, DatasourceVo, DatasourceEntity> {
}
