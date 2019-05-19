package com.cp.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");// to open url
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("cphulwar");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("8983302595");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//div[@role='button' and contains(text(),'Compose')]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("chetan.phulwar@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Hi !!!!");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi, Manish");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='button' and contains(text(),'Send')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='button']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[ contains(@href,'Log')]")).click();
		Thread.sleep(2000);
		driver.close();
		driver.findElement(By.xpath("//a[ contains(@href,'Log')]")).isSelected();
	}
	
}
