package org.sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://www.snapdeal.com/");
		

		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("iphone x", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Apple iPhone X Bumper Cases TZTIMEZ - Red']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		for(String x:allwindow) {
			if(!parent.equals(x)) {
				driver.switchTo().window(x);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(), 'T&C')]")).click();
		}

	}
}
