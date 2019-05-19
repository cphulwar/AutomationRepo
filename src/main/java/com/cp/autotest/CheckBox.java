package com.cp.autotest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.get(0).isSelected());
		checkbox.get(0).click();
		System.out.println(checkbox.get(0).isSelected());

	}

}
