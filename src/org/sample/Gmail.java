package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {

		
			//configure browsers
			System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRI\\Desktop\\selenium\\eclipse-workspace\\SeliniumTest\\DriverFolder\\chromedriver.exe");

			
			
			
			WebDriver driver=new ChromeDriver();
			//launch browser
			driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			WebElement hi=driver.findElement(By.id("identifierId"));
			hi.sendKeys("giridharankothandaraman");
		    WebElement 	btnNext=driver.findElement(By.xpath("//span[text()='Next']"));
			
				btnNext.click();
				Thread.sleep(30);
				WebElement bi=driver.findElement(By.name("password"));
				bi.sendKeys("ki");
				 WebElement btn1Next=driver.findElement(By.xpath("//span[text()='Next']"));
					
					btn1Next.click();
					driver.quit();
	}

}
