package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) {
		//configure browsers
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vauci\\eclipse-workspace\\SeliniumTest\\DriverFolder\\geckodriver.exe");

		
		
		
		WebDriver driver=new FirefoxDriver();
		//launch browser
		driver.get("https://www.flipkart.com/");
		
		
		
		//title
		String ti=driver.getTitle();
		System.out.println(ti);
		//current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
	driver.navigate().to("https://www.amazon.com/");
	//back
	driver.navigate().back();
	//forward
	driver.navigate().forward();
	//refresh
	driver.navigate().refresh();
	//driver.quit();
	}

}
