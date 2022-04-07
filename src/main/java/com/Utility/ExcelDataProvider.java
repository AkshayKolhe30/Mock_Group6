package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook  wb;
	public ExcelDataProvider() throws Exception {
		String path="C:\\Users\\lenovo\\eclipse-workspace\\BankingD\\TestData\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
	}
	
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
