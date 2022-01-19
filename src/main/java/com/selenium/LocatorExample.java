package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorExample {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// driver.findElement(emailId).sendKeys("pankajtayade369@gmail.com");

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		//getElement(emailId).sendKeys("pankajtayade@gmail.com");
		//getElement(password).sendKeys("Dec@2021");

	}

	
	public static void doSendKeys(By locator,String value) {
		
		//getElement()
		
	}

}
