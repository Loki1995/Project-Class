package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VickyAlert {

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement element =driver.findElement (By.id("promtButton"));
		element.click();
		Alert simple = driver.switchTo().alert();
		simple.accept();
		
}}