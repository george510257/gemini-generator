package com.gls.gemini.generator.boot.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
@Schema(title = "实体信息", description = "实体信息")
public class EntityVo implements Serializable {
    /**
     * 实体名 例如：user
     */
    @Schema(title = "实体名", description = "实体名 例如：user")
    private String entityName;
    /**
     * 实体名首字母大写 例如：User
     */
    @Schema(title = "实体名首字母大写", description = "实体名首字母大写 例如：User")
    private String entityNameUpper;
    /**
     * 实体描述 例如：用户
     */
    @Schema(title = "实体描述", description = "实体描述 例如：用户")
    private String entityDescription;
    /**
     * 表名 例如：t_user
     */
    @Schema(title = "表名", description = "表名 例如：t_user")
    private String tableName;
    /**
     * 主键名 例如：id
     */
    @Schema(title = "主键名", description = "主键名 例如：id")
    private String primaryKey;
    /**
     * 主键类型 例如：Long
     */
    @Schema(title = "主键类型", description = "主键类型 例如：Long")
    private String primaryKeyType;
}
