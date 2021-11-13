package com.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestNg2 {
	static WebDriver driver;

	@Parameters({ "UserName", "Password" })
	@Test
	private void test11(@Optional("selenium") String s1, String s2) {
		System.setProperty("webdriver.edge.driver", "D:\\workspace\\FrameWork\\Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(s2);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
