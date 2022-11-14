package Locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpagepractice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement username = driver.findElement(By.cssSelector("#username"));
		username.sendKeys("rahulshettyacademy");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("learning");
		
		
		WebElement user = driver.findElement(By.xpath("//input[@value='user']")); 
		user.click();
		
		WebElement okay = driver.findElement(By.id("okayBtn"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		String text= okay.getText();	
		System.out.println(text);
		
		
		
	

	}

}
