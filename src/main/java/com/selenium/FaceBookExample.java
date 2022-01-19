package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium Software\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pankajtayade369@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Mar@2021");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
