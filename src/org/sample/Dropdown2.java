package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	public static void main(String[] args) throws InterruptedException {

		// configure browsers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("https://www.facebook.com/");
		WebElement dnmonth=driver.findElement(By.id("month"));
    
	Select s= new Select(dnmonth);
	s.selectByVisibleText("Jun");
	List<WebElement>element=s.getOptions();
	for(WebElement element1:element) {
		String name=element1.getAttribute("value");
		System.out.println(name);
		
			
	
	}

	
		
	}
	}


