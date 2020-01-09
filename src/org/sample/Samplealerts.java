package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samplealerts {
	public static void main(String[] args) throws InterruptedException {

		// configure browsers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement e = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		e.click();

		WebElement f = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		f.click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.dismiss();

		WebElement f1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		f1.click();
		WebElement f2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		f2.click();

		Alert a2 = driver.switchTo().alert();
		Thread.sleep(5000);
		a2.dismiss();
		
		WebElement f3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		f3.click();
		WebElement c = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		c.click();

		Alert a4 = driver.switchTo().alert();
		Thread.sleep(3000);
		a4.sendKeys("giri");
		a4.accept();

	}

}
