package com.gls.gemini.generator.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.generator.boot.web.service.DatasourceService;
import com.gls.gemini.generator.sdk.feign.DatasourceFeign;
import com.gls.gemini.generator.sdk.vo.DatasourceVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据源表 控制器
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 */
@Slf4j
@RestController
@RequestMapping("/datasource")
@Tag(name = "datasource", description = "数据源表")
public class DatasourceController extends BaseController<DatasourceService, DatasourceVo> implements DatasourceFeign {
}