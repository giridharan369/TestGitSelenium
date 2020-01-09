package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanuch {
	
	

	public static void main(String[] args) {
		//configure browsers
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRI\\Desktop\\selenium\\eclipse-workspace\\SeliniumTest\\DriverFolder\\chromedriver.exe");

		
		
		
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		
		
		
		//title
		//String ti=driver.getTitle();
		//System.out.println(ti);
		//current url
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//find the loc of user name
		//
		WebElement b=driver.findElement(By.xpath("//span[contains(text(),'testimonial-content')]"));
		String name =b.getText();
		System.out.println(name);
		driver.quit();
		//inser
		//txtuserName.sendKeys("giri");
		
	//find the loc of password
	//WebElement	txtPassword=driver.findElement(By.id("password"));
	
	//insert
	//txtPassword.sendKeys("1234");
	}

	}



						