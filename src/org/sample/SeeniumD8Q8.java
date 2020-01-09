package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeniumD8Q8 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dummyUsername = driver.findElement(By.xpath("//input[@name='DUMMY1']"));
		dummyUsername.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));

		txtUsername.sendKeys("543333672");

	}

}
