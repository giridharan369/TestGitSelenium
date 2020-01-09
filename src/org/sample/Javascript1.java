package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching Browers
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(8000);
		js.executeScript("window.scrollBy(0,3000)");
		String d = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']")).getText();

		String s = (String) d;
		System.out.println(s);

	}
}