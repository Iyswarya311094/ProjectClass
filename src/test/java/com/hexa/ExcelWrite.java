package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\workspace\\FrameWork\\Excel data\\Excel.xlsx");
		FileInputStream fInput = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fInput);
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		if (stringCellValue.equals("Java")) {
			cell.setCellValue("Mobile");
		}

		FileOutputStream fOut = new FileOutputStream(f);
		w.write(fOut);
		fOut.close();
	}
}