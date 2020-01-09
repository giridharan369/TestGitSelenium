

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiple {
	public static void main(String[] args) throws InterruptedException {

		// configure browsers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement dnmonth = driver.findElement(By.id("selenium_commands"));

		Select s = new Select(dnmonth);
		List<WebElement>element=s.getOptions();
		int optionsize=element.size();
		for(int i=0;i<optionsize;i++) {
			s.selectByIndex(i);
		}
		
		
		
		
		
		
		
		//s.selectByIndex(0);
		//s.selectByIndex(1);
		//s.selectByIndex(2);
		
	}

}
