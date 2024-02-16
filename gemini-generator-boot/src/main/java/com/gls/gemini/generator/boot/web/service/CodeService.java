package com.gls.gemini.generator.boot.web.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ZipUtil;
import com.gls.gemini.generator.boot.builder.CodeBuilder;
import com.gls.gemini.generator.boot.constants.GeneratorProperties;
import com.gls.gemini.generator.boot.vo.CodeVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

/**
 * 代码生成服务
 */
@Service
public class CodeService {
    @Resource
    private GeneratorProperties generatorProperties;

    @Resource
    private List<CodeBuilder> codeBuilders;

    /**
     * 生成代码
     *
     * @param codeVo 代码生成请求
     * @return 代码文件
     */
    public File generate(CodeVo codeVo) {
        // 创建临时文件夹
        File root = this.getRootPath(codeVo.getMaven().getArtifactId());
        // 生成代码
        codeBuilders.forEach(codeBuilder -> codeBuilder.createFile(root, codeVo));
        // 压缩文件
        File zipFile = ZipUtil.zip(root);
        // 删除临时文件夹
        FileUtil.del(root);
        return zipFile;
    }

    /**
     * 获取根路径
     *
     * @param artifactId 项目名称
     * @return 根路径
     */
    private File getRootPath(String artifactId) {
        // 获取根路径
        String rootPath = generatorProperties.getTempPath() + File.separator + artifactId;
        // 判断文件夹是否存在 不存在则创建 存在则清空文件夹
        File root = new File(rootPath);
        if (root.exists()) {
            root.delete();
        }
        root.mkdirs();
        return root;
    }
}
