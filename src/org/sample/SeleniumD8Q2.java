package org.sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumD8Q2 {
	public static void main(String[] args) {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement frame = driver.findElement(By.xpath("(//frame)[1]"));
	
	driver.switchTo().frame(frame);
	
	WebElement btnContinue = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
	
	btnContinue.click();
	
	
	Alert alert = driver.switchTo().alert();
	
	alert.accept();
	

}}
