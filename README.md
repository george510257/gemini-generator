## 项目介绍

- 项目名称：gemini-generator
- 项目描述：代码生成器服务

## 项目结构

```lua
─ gemini-generator
├─db -- 数据库脚本
├─gemini-generator-boot -- 启动模块
│  └─src
│     └─main
│        ├─java
│        │  └─com.gls.gemini.generator.boot
│        │     ├─config -- 配置
│        │     └─web
│        │        ├─controller -- 控制器
│        │        ├─converter -- 转换器
│        │        ├─entity -- 实体
│        │        ├─mapper -- mapper
│        │        └─service -- 服务
│        └─resources
│           └─mapper -- mapper文件
└─gemini-generator-sdk -- sdk模块
   └─src
      └─main
         ├─java
         │  └─com.gls.gemini.generator.sdk
         │     ├─feign -- feign
         │     └─vo -- vo
         └─resources
            └─META-INF
               └─spring -- spring配置文件
```