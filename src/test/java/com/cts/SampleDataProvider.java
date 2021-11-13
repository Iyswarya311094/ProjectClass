package com.cts;

import org.testng.AssertJUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleDataProvider {
	@Test(dataProvider = "res")
	private void test(String s1, String s2) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		AssertJUnit.assertTrue("verify url", driver.getCurrentUrl().contains("hotel"));

		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s2);
		Assert.assertEquals("Java", txtPass);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@DataProvider(name = "res")
	private Object[][] test1() {
		return new Object[][] { { "abi", "abi@123" }, { "raj", "raj@123" }, { "arul", "arul@123" } };

	}
}
