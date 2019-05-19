package com.cp.autotest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtils {

	public static void captureScreenShot(WebDriver driver, String filename) {
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile,
					new File("C:\\Users\\CP\\Documents\\ChetanJava\\Screenshots\\" + filename + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro while capturing screen shot " + e);
		}
	}

}
