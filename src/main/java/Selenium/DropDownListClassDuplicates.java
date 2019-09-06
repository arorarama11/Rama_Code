package Selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListClassDuplicates {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement e = driver.findElement(By.id("continents"));
		Select s = new Select(e);
		List<WebElement> list = s.getOptions();
		HashSet<String> hs = new HashSet<>();
		
		for(int i=0; i < list.size(); i++)
		{
			String text = list.get(i).getText();
			boolean hs1 = hs.add(text);
			if(hs1 == false)
			{
				System.out.println(text);
			}
		}
	
	}

}
