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
     * 字符串
     */
    STRING(1, "字符串", "varchar", "String"),
    /**
     * 整型
     */
    INTEGER(2, "整型", "int", "Integer"),
    /**
     * 长整型
     */
    LONG(3, "长整型", "bigint", "Long"),
    /**
     * 浮点型
     */
    FLOAT(4, "浮点型", "float", "Float"),
    /**
     * 双精度浮点型
     */
    DOUBLE(5, "双精度浮点型", "double", "Double"),
    /**
     * 日期
     */
    DATE(6, "日期", "datetime", "Date"),
    /**
     * 时间
     */
    TIME(7, "时间", "time", "Time"),
    /**
     * 时间戳
     */
    TIMESTAMP(8, "时间戳", "timestamp", "Timestamp"),
    /**
     * 布尔
     */
    BOOLEAN(9, "布尔", "tinyint", "Boolean"),
    /**
     * 字节
     */
    BYTE(10, "字节", "tinyint", "Byte"),
    /**
     * 字节数组
     */
    BYTE_ARRAY(11, "字节数组", "blob", "byte[]"),
    /**
     * 大文本
     */
    TEXT(12, "大文本", "text", "String"),
    /**
     * 二进制
     */
    BINARY(13, "二进制", "binary", "byte[]"),
    /**
     * 二进制大对象
     */
    BLOB(14, "二进制大对象", "blob", "byte[]"),
    /**
     * 字符串大对象
     */
    CLOB(15, "字符串大对象", "clob", "String"),
    /**
     * 数组
     */
    ARRAY(16, "数组", "array", "List"),
    /**
     * 对象
     */
    OBJECT(17, "对象", "object", "Object"),
    /**
     * JSON
     */
    JSON(18, "JSON", "json", "String"),
    /**
     * XML
     */
    XML(19, "XML", "xml", "String"),
    /**
     * 枚举
     */
    ENUM(20, "枚举", "enum", "Enum"),
    /**
     * 未知
     */
    UNKNOWN(21, "未知", "unknown", "Object");

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
