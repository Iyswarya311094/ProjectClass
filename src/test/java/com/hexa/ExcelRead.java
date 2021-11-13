package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\workspace\\FrameWork\\Excel data\\ExcelRead.xlsx");
		// Convert file into Java Object
		FileInputStream fileInput = new FileInputStream(f);
		// Workbook
		Workbook w = new XSSFWorkbook(fileInput);
		Sheet sheet = w.getSheet("Sheet1");
		Row r = sheet.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();

				if (type == 1) {
					String sValue = cell.getStringCellValue();
					System.out.println(sValue);
				} else if (type == 0) {

					if (DateUtil.isCellDateFormatted(cell))

					{
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
						String string = sdf.format(dateCellValue);
						System.out.println(string);

					} else {
						double numericCellValue = cell.getNumericCellValue();
						long l = (long) numericCellValue;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}
			}

		}

	}
}