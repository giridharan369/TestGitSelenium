package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumD8Q7 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement framesrc = driver.findElement(By.xpath("(//frame)[1]"));

		driver.switchTo().frame(framesrc);

		WebElement txtUsername = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));

		txtUsername.sendKeys("537777572");

		WebElement btnContinue = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));

		btnContinue.click();

	}
}
