package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching Browers
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(8000);
		WebElement d = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
        js.executeScript("arguments[0].scrollIntoView(true)", d);
        Thread.sleep(8000);
        WebElement e = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
}