package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:///www.facebook.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	String title = driver.getTitle();
	System.out.println(title);
	String pagesource = driver.getPageSource();
	System.out .println(pagesource);
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys ("logesh");
	WebElement element1 = driver.findElement(By.id("pass"));
	element1.sendKeys("Loki");
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	for (int i= 0;i<elements.size();i++);
	int i =0;{
	WebElement webElement = elements.get(i);
	String text = webElement.getText();
	System.out.println(text);
	driver.quit();
}
}}
