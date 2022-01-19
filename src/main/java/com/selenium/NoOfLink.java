package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoOfLink {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		List<WebElement>list =driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(WebElement e:list) {
			System.out.println(e);
		}
		

	}

}
