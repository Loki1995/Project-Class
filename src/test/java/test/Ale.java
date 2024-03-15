package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ale {

	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get ("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement e =driver.findElement (By.id("promtButton"));
		e.click();
		Alert s = driver.switchTo().alert();
		s.accept();
}}
