package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3 {
	public static void main(String[] args) throws InterruptedException {
	// Configure Browers
	System.setProperty("webdriver.chrome.driver",
			"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	// launching Browers
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.className("//input[@class='_2zrpKA _1dBPDZ']"));
	// type casting one interface into another
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// insert into js
	Thread.sleep(5000);
	js.executeScript("arguments[0].setAttribute('value','giniitech@gmail.com')", user);
	Thread.sleep(5000);
	WebElement password = driver.findElement(By.id("password"));
	// type casting one interface into another
	js.executeScript("arguments[0].setAttribute('value','1234567896')", password);
	Object obj = js.executeScript("return arguments[0].getAttribute('value')", user);
	String s = (String) obj;
	System.out.println(s);
	Object obj1=js.executeScript("return arguments[0].getAttribute('value')", password);
	String s1=(String)obj1;
	System.out.println(s1);
	//click the button
	WebElement button=driver.findElement(By.id("login"));
	js.executeScript("arguments[0].click()",button);

}
}
