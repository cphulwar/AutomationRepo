package com.cp.autotest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException, Exception {
		// Create prefs map to store all preferences
		Map<String, Integer> prefs = new HashMap<String, Integer>();

		// Put this into prefs map to switch off browser notification
		prefs.put("profile.default_content_setting_values.notifications", 2);
		Logger logger = Logger.getLogger("Log4j");

		PropertyConfigurator.configure("C:\\Users\\CP\\workspace\\autotest-framework\\log4j.properties");

		// Create chrome options to set this prefs
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		logger.info("Driver created");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.facebook.com/");
		logger.info("URL opened");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
		username.clear();
		username.sendKeys("chetan.phulwar@gmail.com");
		WebElement yeardropdown = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(yeardropdown);
		List<WebElement> yearsvalue = year.getOptions();
		logger.info(yearsvalue);
		for (int i = 0; i < yearsvalue.size(); i++) {
			System.out.println(yearsvalue.get(i).getText());
			logger.info(yearsvalue.get(i).getText());
		}
		year.selectByValue("1992");
		year.selectByVisibleText("1964");

		ScreenShotUtils.captureScreenShot(driver, "screenshot-" + LocalDateTime.now().toString().replaceAll(":", " "));
		WebElement password = driver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
		password.clear();
		password.sendKeys("Chetan@13");
		 driver.manage().window().maximize();

		/*
		 * driver.findElement(By.xpath(
		 * "//label[@id='loginbutton']//input[@type='submit']")).click(); //
		 * wait.until(ExpectedConditions.alertIsPresent()); //
		 * driver.switchTo().alert().accept(); Thread.sleep(10000);
		 * driver.close();
		 * 
		 * driver.findElement(By.xpath("//input[@name='q' and @type='text']")).
		 * sendKeys("Manish Phulwar"); driver.findElement(By.xpath(
		 * "//form[contains(@action,direct_search)]//button[@type='submit']")).
		 * click(); Thread.sleep(10000); driver.findElement(By.
		 * xpath("//div[text()='Manish Phulwar']//following::span//div[@class='_6a uiPopover']"
		 * )) .click(); Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//div[text()='Manish Phulwar']//following::div[ends-with(@id,'g_2']//span[text()='Send message']"
		 * ));
		 */
	}

}
