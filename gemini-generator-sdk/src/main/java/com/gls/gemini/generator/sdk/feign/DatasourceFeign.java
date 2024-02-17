package com.gls.gemini.generator.sdk.feign;

import com.gls.gemini.generator.sdk.vo.DatasourceVo;
import com.gls.gemini.sdk.core.feign.BaseFeign;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 数据源表 Feign
 *
 * @author gemini 自动生成
 * @version 0.0.1-SNAPSHOT
 * @date 2024-02-17
 */
@FeignClient(name = "gemini-generator", contextId = "datasource", path = "/datasource")
public interface DatasourceFeign extends BaseFeign<DatasourceVo> {
}
