package com.gls.gemini.generator.boot.builder;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.template.Template;
import cn.hutool.extra.template.TemplateConfig;
import cn.hutool.extra.template.TemplateUtil;
import com.gls.gemini.generator.boot.constants.CodeEnums;
import com.gls.gemini.generator.boot.vo.CodeVo;

import java.io.File;
import java.util.Map;

/**
 * 代码生成器
 */
@FunctionalInterface
public interface CodeBuilder {

    /**
     * 生成代码
     *
     * @param root   根目录
     * @param codeVo 代码请求
     */
    void createFile(File root, CodeVo codeVo);

    /**
     * 生成代码
     *
     * @param root      根目录
     * @param data      代码请求
     * @param codeEnums 代码枚举
     */
    default void createFile(File root, Map<String, Object> data, CodeEnums codeEnums) {
        // 获取模板
        TemplateConfig config = new TemplateConfig("templates", TemplateConfig.ResourceMode.CLASSPATH);
        Template template = TemplateUtil.createEngine(config).getTemplate(codeEnums.getTemplate());

        // 获取文件
        String fileName = StrUtil.format(codeEnums.getFileName(), data);
        File file = FileUtil.file(root, fileName);

        // 渲染模板
        template.render(data, file);
    }
}
