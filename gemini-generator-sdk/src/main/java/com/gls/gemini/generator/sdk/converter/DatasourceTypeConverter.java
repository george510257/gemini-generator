package com.gls.gemini.generator.sdk.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

/**
 * 数据源类型转换器
 */
public class DatasourceTypeConverter implements Converter<Integer> {
    /**
     * 支持的Java类型
     *
     * @return Java类型
     */
    @Override
    public Class<?> supportJavaTypeKey() {
        return Integer.class;
    }

    /**
     * 支持的Excel类型
     *
     * @return Excel类型
     */
    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    /**
     * 转换Java数据
     *
     * @param cellData            单元格数据
     * @param contentProperty     内容属性
     * @param globalConfiguration 全局配置
     * @return Java数据
     * @throws Exception 异常
     */
    @Override
    public Integer convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if (cellData.getStringValue().equals("mysql")) {
            return 0;
        } else if (cellData.getStringValue().equals("oracle")) {
            return 1;
        } else if (cellData.getStringValue().equals("sqlserver")) {
            return 2;
        } else if (cellData.getStringValue().equals("postgresql")) {
            return 3;
        }
        return 0;
    }

    /**
     * 转换Excel数据
     *
     * @param value               Java数据
     * @param contentProperty     内容属性
     * @param globalConfiguration 全局配置
     * @return Excel数据
     * @throws Exception 异常
     */
    @Override
    public WriteCellData<?> convertToExcelData(Integer value, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) throws Exception {
        if (value == 0) {
            return new WriteCellData<>("mysql");
        } else if (value == 1) {
            return new WriteCellData<>("oracle");
        } else if (value == 2) {
            return new WriteCellData<>("sqlserver");
        } else if (value == 3) {
            return new WriteCellData<>("postgresql");
        }
        return new WriteCellData<>("mysql");
    }
}
