package com.gls.gemini.generator.boot.constants;

import com.gls.gemini.common.core.interfaces.IEnums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 数据类型枚举
 */
@Getter
@RequiredArgsConstructor
public enum DataTypeEnums implements IEnums {
    /**
     * 未知
     */
    UNKNOWN(0, "未知", "unknown", "Object"),
    /**
     * 小整数
     */
    TINYINT(1, "小整数", "tinyint", "Integer"),
    /**
     * 中整数
     */
    SMALLINT(2, "中整数", "smallint", "Integer"),
    /**
     * 中整数
     */
    MEDIUMINT(3, "中整数", "mediumint", "Integer"),
    /**
     * 整数
     */
    INT(4, "整数", "int", "Integer"),
    /**
     * 整数
     */
    INTEGER(5, "整数", "integer", "Integer"),
    /**
     * 大整数
     */
    BIGINT(6, "大整数", "bigint", "Long"),
    /**
     * 浮点数
     */
    FLOAT(7, "浮点数", "float", "Float"),
    /**
     * 双精度浮点数
     */
    DOUBLE(8, "双精度浮点数", "double", "Double"),
    /**
     * 小数
     */
    DECIMAL(9, "小数", "decimal", "BigDecimal"),
    /**
     * 日期
     */
    DATE(10, "日期", "date", "Date"),
    /**
     * 时间
     */
    TIME(11, "时间", "time", "Time"),
    /**
     * 年
     */
    YEAR(12, "年", "year", "String"),
    /**
     * 日期时间
     */
    DATETIME(13, "日期时间", "datetime", "Date"),
    /**
     * 时间戳
     */
    TIMESTAMP(14, "时间戳", "timestamp", "Date"),
    /**
     * 字符串
     */
    CHAR(15, "字符串", "char", "String"),
    /**
     * 字符串
     */
    VARCHAR(16, "字符串", "varchar", "String"),
    /**
     * 二进制字符串
     */
    TINYBLOB(17, "二进制字符串", "tinyblob", "byte[]"),
    /**
     * 短文本
     */
    TINYTEXT(18, "短文本", "tinytext", "String"),
    /**
     * 二进制字符串
     */
    BLOB(19, "二进制字符串", "blob", "byte[]"),
    /**
     * 文本
     */
    TEXT(20, "文本", "text", "String"),
    /**
     * 二进制字符串
     */
    MEDIUMBLOB(21, "二进制字符串", "mediumblob", "byte[]"),
    /**
     * 长文本
     */
    MEDIUMTEXT(22, "长文本", "mediumtext", "String"),
    /**
     * 二进制字符串
     */
    LONGBLOB(23, "二进制字符串", "longblob", "byte[]"),
    /**
     * 长文本
     */
    LONGTEXT(24, "长文本", "longtext", "String"),

    ;

    /**
     * 编码
     */
    private final Integer code;
    /**
     * 消息
     */
    private final String message;
    /**
     * 数据库数据类型
     */
    private final String dbDataType;
    /**
     * java数据类型
     */
    private final String javaDataType;

    public static DataTypeEnums getByDbDataType(String dbDataType) {
        for (DataTypeEnums value : values()) {
            if (value.getDbDataType().equalsIgnoreCase(dbDataType)) {
                return value;
            }
        }
        return UNKNOWN;
    }
}
