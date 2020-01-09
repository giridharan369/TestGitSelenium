package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumD8Q3 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

	
	
	
	
	
	WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


WebElement btnLogin = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
btnLogin.click();

Thread.sleep(1000);

Alert alert = driver.switchTo().alert();

alert.accept();

}
}
