package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByLocator {

	static  WebDriver driver;

	public static void main(String[] args) {

		// static WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// driver.findElement(By.id("input-email")).sendKeys("pankajtayade369@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("Dec@2021");

		//By EmailId = By.id("input-email");
		//By password = By.id("input-password");
		
		//getElement(EmailId).sendKeys("pankajtayade@gmail.com");
		//getElement(password).sendKeys("Dec@2021");
		
		//By EmailId = By.id("input-email");
		//By password = By.id("input-password");
		
		//doSendKeys(EmailId,"pankajtayade369@gmail.com");
		//doSendKeys(password,"Dec@2021");
		
		By EmailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtilityClass ut1=new ElementUtilityClass(driver);
		
		ut1.doSendKeys(EmailId, "pankajtayade369@gmail.com");
		ut1.doSendKeys(password, "Dec@2021");
		//ut1.doSendKeys(password,"pankajtayade369@gmail.com");
		
		
		

	}
	
	public String DogetText(By locator) {
		
		return getElement(locator).getText();
		
	}
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

			

}
