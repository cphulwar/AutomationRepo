package com.cp.autotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicResult {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement AllSuggesstion = driver.findElement(By.xpath("//*[@role='listbox']"));
		List<WebElement> options = AllSuggesstion.findElements(By.tagName("li"));
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i));
			driver.quit();
		}
	}

}
