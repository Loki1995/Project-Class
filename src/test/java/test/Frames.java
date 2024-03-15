package test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException, AWTException ,IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		List<WebElement> E=driver.findElements(By.id("singleframe"));
		driver.switchTo().frame(E.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Logesh");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[text()='Home']")).click();
}}
