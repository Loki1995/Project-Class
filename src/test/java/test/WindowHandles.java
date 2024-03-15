package test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {
	public static void main(String[] args) throws InterruptedException, AWTException ,IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=7645187540960345585&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301174&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//Actions s = new Actions(driver);
		//s.sendKeys(search, "Iphone").perform();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Redmi",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Redmi A3 (Olive Green, 3GB RAM, 64GB Storage) | Premium Halo Design | 90Hz Display')]")).click();
		
		String P = driver.getWindowHandle();
		Set<String> C = driver.getWindowHandles();
		
		for (String x : C) {
		if(!P.equals (x)) {
		driver.switchTo().window(x);
		WebElement element = driver. findElement (By.xpath(" //*[text()=' Buy Now ']"));
		String text = element. getText();
		System.out.println(text);
		
		
	}
}}}
