package com.hexa;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample1 {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.edge.driver", "D:\\workspace\\FrameWork\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Verify url", url.contains("face"));
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Quit Browser");
	}

	@Test
	public void test1() {
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("java");
		Assert.assertEquals("Verify Password", "java", txtPass.getAttribute("value"));
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
}
