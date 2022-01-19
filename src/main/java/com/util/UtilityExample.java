package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityExample {
	
	private WebDriver driver;
	
	
	
	public WebDriver launchUrl(String browser) {
		
		System.out.println("Chrome is launch");
		
		if(browser.equals("Chrome")) {
			System.setProperty("Webdriver.chrome.driver","D:\\Selenium Software\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else {
			System.out.println("launce other driver");
		}
		
				return driver;
		
	}
			

}
