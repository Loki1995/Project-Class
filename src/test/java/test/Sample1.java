package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:///www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement element2 = driver.findElement(By.id("email"));
		Actions b = new Actions(driver);
		b.moveToElement(element2).perform();
		
		WebElement element3 = driver. findElement (By.id("email") );
		Actions c = new Actions (driver);
		c.sendKeys(element3, "logesh").perform() ;
		Thread. sleep (2000) ;
		c.doubleClick(element3).perform (); 
		Thread. sleep (2000) ;
		c.contextClick (element3).build().perform () ;
		
		Robot r = new Robot() ;
		for (int i = 0; i < 7; i++) {
		r.keyPress(KeyEvent.VK_DOWN) ;
		r.keyRelease(KeyEvent. VK_DOWN) ;}
		r.keyPress(KeyEvent.VK_ENTER) ;
		r. keyRelease (KeyEvent. VK_ENTER);
		
		r. keyPress (KeyEvent.VK_TAB) ;
		r. keyRelease (KeyEvent. VK_TAB) ;
		r. keyPress (KeyEvent. VK_CONTROL);
		r. keyPress (KeyEvent. VK_V) ;
		r. keyRelease (KeyEvent.VK_V);
		r. keyRelease (KeyEvent.VK_CONTROL) ;

}}
