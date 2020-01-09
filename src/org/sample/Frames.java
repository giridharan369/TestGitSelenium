package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching Browers
		driver.get(
				"https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		
		WebElement f =driver.findElement(By.xpath("//img[@src='/content/dam/sprint/us/en/icons/icon-sign-in.svg'][1]"));
		f.click();

	}
}