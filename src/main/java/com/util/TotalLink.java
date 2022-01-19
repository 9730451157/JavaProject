package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		List<WebElement> str = driver.findElements(By.tagName("a"));

		System.out.println(str.size());

		for (WebElement e : str) {
			String st = e.getText();
			if (!st.isEmpty()) {
				System.out.println(st);
			}
		}

	}

}
