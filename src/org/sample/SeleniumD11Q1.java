package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumD11Q1 {
	public static void main(String[] args) throws InterruptedException {
		// Configure Browers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching Browers
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			WebElement row = trows.get(i);
			String s=row.getText();
			System.out.println(s);

			// fetching data
			List<WebElement> data = driver.findElements(By.tagName("td"));
			for (int j = 0; j <= data.size(); j++) {
				WebElement tdata = data.get(j);
				String sys = tdata.getText();
				if (sys.equals("Dubai")) {
					System.out.println(sys);
					System.out.println("Row number:" + i);
					System.out.println("cell number:" + j);
				}

			}
		}

	}
}
