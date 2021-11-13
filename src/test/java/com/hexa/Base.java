package com.hexa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.ege.driver", "D:\\workspace\\FrameWork\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}

	public void sendUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void input(WebElement element, String data) {

		element.sendKeys(data);
	}

	public void btnLogin(WebElement btn) {
		btn.click();
	}

	public String getCurrentUrl(WebDriver driver) {

		return driver.getCurrentUrl();
	}

	public String getTite(WebDriver driver) {

		return driver.getTitle();
	}

	public String getText(WebElement element) {

		return element.getText();
	}

	public String getAttribute(WebElement element) {
		return element.getAttribute("value");

	}

	public void mouseOver(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public void drag(WebDriver driver, WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public void ContextClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public void close(WebDriver driver) {
		driver.close();

	}

	public void quit(WebDriver driver) {
		driver.quit();

	}

	public void robot(int key) throws AWTException {
		Robot r = new Robot();
		r.keyPress(key);
		r.keyRelease(key);

	}

	public void alert(WebDriver driver, int choice) {
		Alert a = driver.switchTo().alert();
		if (choice == 1) {
			a.accept();
		} else {
			a.dismiss();
		}
	}

}
