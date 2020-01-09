package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeeniumD11Q11 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching Browers
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for (WebElement x : trows) {
			List<WebElement> tdata = x.findElements(By.tagName("td"));
			for (WebElement y : tdata) {
				String text = y.getText();
				System.out.println(text);
			}

		}
	}
}