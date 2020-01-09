package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Samplemouse {
	public static void main(String[] args) throws AWTException {

		// configure browsers
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\GIRI\\\\Desktop\\\\selenium\\\\eclipse-workspace\\\\SeliniumTest\\\\DriverFolder\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launch browser
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement username = driver
				.findElement(By.xpath("//html[@class='wf-lato-n4-active wf-lato-n7-active wf-lato-n3-active wf-active']"));
		Actions acc = new Actions(driver);
         acc.contextClick(username).perform();
		 //Robot r = new Robot();
		 //for (int i = 1; i < 4; i++) {
		
		 //r.keyPress(KeyEvent.VK_DOWN);
		 //r.keyRelease(KeyEvent.VK_DOWN);
		 //enter
		 //r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//WebElement username1 = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//username1.click();

		// Actions acc = new Actions(driver);
		// acc.contextClick(username).perform();
		// Robot r = new Robot();
		// for (int i = 1; i < 5; i++) {
		//
		// r.keyPress(KeyEvent.VK_DOWN);
		// r.keyRelease(KeyEvent.VK_DOWN);
		// enter
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);

	//}

	// WebElement nametxt=driver.findElement(By.id("InputName"));
	// nametxt.sendKeys("giri");

	// xxx.moveToElement(use1).perform();

	// WebElement use2 = driver.findElement(By.xpath("//h1[text()='Selenium Training
	// in Chennai']"));
	// String txtparam = use2.getText();
	// System.out.println(txtparam);

	// WebElement use2= driver.findElement(By.xpath("//p[text()='\r\n" +
	// " Our ']"));
	// String txtparam=use2.getText();
	// System.out.println(txtparam);

	// a[@href='//www.shopclues.com/medisys-double-mass-gainer-choco-3kg.html?adz_page=plp&adz_pos=1&campaign_id=31764']

	// WebElement desc= driver.findElement(By.id("pass"));
	// WebElement src1= driver.findElement(By.id("credit2"));
	// WebElement desc1= driver.findElement(By.id("bank"));
	// WebElement src2= driver.findElement(By.id("credit1"));
	// WebElement desc2= driver.findElement(By.id("loan"));
	// WebElement src3= driver.findElement(By.id("fourth"));
	// WebElement desc3= driver.findElement(By.id("amt8"));
	// Actions Acc=new Actions(driver);
	// Acc.keyDown(username, Keys.SHIFT).sendKeys(username, "giri").keyUp(username,
	// Keys.SHIFT).build().perform();
	// Acc.dragAndDrop(src1,desc1).perform();
	// Acc.dragAndDrop(src2,desc2).perform();
	// Acc.dragAndDrop(src3,desc3).perform();
	// Acc.moveToElement( btnCourse).perform();
	//// WebElement btn4Course= driver.findElement(By.id("amt7"));

	// Acc.moveToElement( btn4Course ).perform();
	// WebElement
	// bt5Course=driver.findElement(By.xpath("//span[text()='Microstrategy
	// Training']"));
	// bt5Course.click();
	// WebElement txtpara=driver.findElement(By.xpath("//h1[text()='ORACLE SQL
	// TRAINING IN CHENNAI']"));
	// String name =txtpara.getText();
	// System.out.println(name);
	// driver.quit();

	// Actions Acc=new Actions(driver);
	// Acc.moveToElement( btnCourse).perform();
	// WebElement btn1Course= driver.findElement(By.xpath("//span[text()=''Oracle
	// Training']"));
	// btn1Course.click();
	// driver.quit();
	// WebElement btn2Course= driver.findElement(By.xpath("//span[text()='Oracle
	// Training']"));
	// Acc.moveToElement( btn2Course).perform();
	// WebElement btn3Course= driver.findElement(By.xpath("(//span[@class='_1QZ6fC
	// _3Lgyp8'])[6]"));
	// btn3Course.click();
	// WebElement btn4Course=
	// driver.findElement(By.xpath("//a[@href='/furniture/dining-tables-sets/pr?sid=wwe,ur9&otracker=nmenu_sub_Home%20%26%20Furniture_0_Dining%20Tables%20%26%20Chairs']"));
	// btn4Course.click();
	// WebElement btn5Course=
	// driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/612/612/jbdys280/dining-set/q/g/z/6-seater-beige-rubber-wood-ds6p2wal04wb2v-perfect-homes-by-original-imafyqughv862tks.jpeg?q=70']"));
	// btn5Course.click();
	// WebElement btn6Course= driver.findElement(By.xpath("//button[@class='_2AkmmA
	// _2Npkh4 _2MWPVK']"));
	// btn6Course.click();
	//// driver.quit();

}
}