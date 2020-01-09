package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumD8Q4 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement loginbtn = driver.findElement(By.xpath("//a[@class='login_button[1]']"));
		loginbtn.click();
		WebElement ctn = driver.findElement(By.xpath("//input[@class='btn btn-default'][1]"));
		ctn.click();
	}
}
