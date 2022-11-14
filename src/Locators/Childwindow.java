package Locators;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement multiplewinodwsbutton = driver.findElement(By.linkText("Multiple Windows"));
		multiplewinodwsbutton.click();
		
		String mainurl= driver.getCurrentUrl();
		System.out.println(mainurl);
		
		WebElement firstwindow = driver.findElement(By.linkText("Click Here"));
		firstwindow.click();
		
		ArrayList<String> childbrowseraddresses = new ArrayList<String> (driver.getWindowHandles());
		
		String secondchildwindow = childbrowseraddresses.get(1);
		driver.switchTo().window(secondchildwindow);
		
		String secondchildwindowurl= driver.getCurrentUrl();
		System.out.println(secondchildwindowurl);
		
		WebElement child2text = driver.findElement(By.xpath("//div[@class='example']//h3"));
		System.out.println(child2text.getText());
	
		String firstchildwindow = childbrowseraddresses.get(0);
		driver.switchTo().window(firstchildwindow);
		
		String firstchildwindowurl= driver.getCurrentUrl();
		System.out.println(firstchildwindowurl);
		
		WebElement child1text = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		System.out.println(child1text.getText());
		
	}

}
