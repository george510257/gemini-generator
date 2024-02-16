package com.gls.gemini.generator.boot.converter;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

public class DatasourceTypeConverter implements Converter<Integer> {

    @Override
    public Class<?> supportJavaTypeKey() {
        return Integer.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

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
