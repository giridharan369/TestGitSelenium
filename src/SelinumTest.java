import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelinumTest {
public static void main(String[] args) {
	//configure browsers
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vauci\\eclipse-workspace\\SeliniumTest\\lib\\selenium-server-standalone-3.141.59.jar");

	WebDriver driver=new ChromeDriver();
	//launch browser
	driver.get("https://www.facebook.com");
	//title
	String ti=driver.getTitle();
	System.out.println(ti);
	//current url
	String url=driver.getCurrentUrl();
	System.out.println(url);
	}

}
