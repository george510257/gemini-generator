package com.gls.gemini.generator.boot.web.controller;

import com.gls.gemini.boot.core.base.BaseController;
import com.gls.gemini.generator.boot.web.service.DatasourceService;
import com.gls.gemini.generator.sdk.vo.DatasourceVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据源管理 controller
 *
 * @author george
 */
@Slf4j
@RestController
@RequestMapping("/datasource")
@Tag(name = "数据源管理", description = "数据源管理")
public class DatasourceController extends BaseController<DatasourceService, DatasourceVo> {
}
