package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver = b.launchBrowser();
		WebElement txtUser = driver.findElement(By.id("email"));
		b.input(txtUser, "greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		b.input(txtUser, "pass");
		WebElement btnlogin = driver.findElement(By.name("Login"));
		b.btnLogin(btnlogin);
	}
}
