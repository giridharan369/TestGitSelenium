package org.sample;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutput;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {

		// configure browsers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("http://greenstech.in/selenium-course-content.html");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		// DESINATION

		File desc = new File(
				"C:\\Users\\GIRI\\Desktop\\selenium\\eclipse-workspace\\SeliniumTest\\screenshot\\GIRI.png");

		FileUtils.copyFile(temp, desc);

	}
}
