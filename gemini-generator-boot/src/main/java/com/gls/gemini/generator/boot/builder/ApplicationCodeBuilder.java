package com.gls.gemini.generator.boot.builder;

import com.gls.gemini.generator.boot.vo.CodeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.File;

@Slf4j
@Component
public class ApplicationCodeBuilder implements CodeBuilder {
    @Override
    public void createFile(File root, CodeVo codeVo) {

    }
}
