package com.gls.gemini.generator.boot.web.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import com.gls.gemini.generator.boot.web.service.CodeService;
import com.gls.gemini.generator.boot.web.service.DatasourceService;
import com.gls.gemini.generator.sdk.vo.CodeVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 代码生成 controller
 */
@Slf4j
@RestController
@RequestMapping("/code")
@Tag(name = "代码生成", description = "代码生成")
public class CodeController {
    /**
     * 代码生成服务
     */
    @Resource
    private CodeService codeService;
    /**
     * 数据源服务
     */
    @Resource
    private DatasourceService datasourceService;

    /**
     * 代码生成
     *
     * @param codeVo   代码生成信息
     * @param response 响应
     */
    @PostMapping("/generate")
    @Operation(summary = "生成代码", description = "生成代码")
    public void generate(@RequestBody CodeVo codeVo, HttpServletResponse response) throws IOException {
        log.info("generate code: {}", codeVo);
        // 切换数据源
        datasourceService.switchDatasource(codeVo.getDatasource());
        // 生成代码
        File file = codeService.generate(codeVo);
        // 清空数据源
        datasourceService.clearDatasource();
        // 设置响应头
        response.reset();
        response.setHeader("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");
        response.addHeader("Content-Length", "" + file.length());
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Expose-Headers", "*");
        response.setContentType("application/octet-stream; charset=UTF-8");
        // 写出响应
        InputStream inputStream = FileUtil.getInputStream(file);
        IoUtil.copy(inputStream, response.getOutputStream());
        // 删除临时文件
//        FileUtil.del(file);
    }
}
