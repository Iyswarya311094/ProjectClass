package com.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base1 {
	static WebDriver driver;

	public Base1() {
		System.setProperty("webdriver.edge.driver", "D:\\workspace\\FrameWork\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();

	}

	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void sendInput(WebElement element, String data) {

		element.sendKeys(data);
	}

	public void clickElement(WebElement element) {
		element.click();
	}

	public String getDataFromExcel(String location, String sName, int rNo, int cNo) throws IOException {
		File f = new File(location);
		FileInputStream fInput = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fInput);
		Sheet s = w.getSheet(sName);
		Row row = s.getRow(rNo);
		Cell cell = row.getCell(cNo);
		return cell.getStringCellValue();

	}

	public void selectFromDropdown(WebElement element, String value) {
		// new Select(element).selectByValue(value);

		Select s = new Select(element);
		s.selectByValue(value);
	}

	public String getText(WebElement element) {
		return element.getAttribute("value");
		// return element.getText();

	}
}
