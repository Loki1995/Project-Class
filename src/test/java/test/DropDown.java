package test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.codec.http.multipart.FileUpload;

public class DropDown {

	public static void main(String[] args) throws InterruptedException, AWTException ,IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natar\\eclipse-workspace\\SampleProject\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement Gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
		Gender.click();
		
		WebElement First = driver.findElement(By.xpath("//input[@id='FirstName']"));
		Actions f = new Actions(driver);
		f.sendKeys(First, "Logesh").perform();
		
		WebElement Last = driver.findElement(By.xpath("//input[@id='LastName']"));
		Actions l = new Actions(driver);
		l.sendKeys(Last, "Natarajan").perform();
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		Actions e = new Actions(driver);
		e.sendKeys(Email, "natarajanlogesh5@gmail.com").perform();
		
		WebElement dropdown = driver.findElement(By.name("DateOfBirthDay"));
		Select s= new Select(dropdown);
		s.selectByIndex(17);
		
		WebElement dropdown1 = driver.findElement(By.name("DateOfBirthMonth"));
		Select s1= new Select(dropdown1);
		s1.selectByValue("8");
		
		WebElement dropdown2 = driver.findElement(By.name("DateOfBirthYear"));
		Select s2= new Select(dropdown2);
		s2.selectByVisibleText("1995");
		
	//	TakesScreenshot t = (TakesScreenshot)driver;
	//	File src= t.getScreenshotAs(OutputType.FILE);
	//	File dec= new File("C:\\Users\\natar\\eclipse-workspace\\SampleProject\\target\\ScreenShot");
		
		
		
}}
