package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionTextWithoutUsingIndex {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//a[text()='Images']"));
		
		Actions a = new Actions(driver);
		
		a.contextClick(e).build().perform();
		
	    a.sendKeys("t").perform();
		
		
		

	}
}
