package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NevigateMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		
		System.out.println(driver.getTitle());
			
		
		
		
		

	}

}
