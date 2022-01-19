package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Software\\\\chromedriver.exe");
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://google.com");
		
		String str=driver1.getTitle();
		
		System.out.println(str);
		
		if(str.equals("Google")) {
			System.out.println("Title is correct");
			
		}else {
			System.out.println("Title is incorrect");
		}
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getPageSource());
		

	}

}
