package Selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsSample {
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program_Sample\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/strong"));
	    TakesScreenshot s = ((TakesScreenshot)driver);
	    File f = s.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(f, new File("C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\screenshots\\screenshot.jpg"));
	    
	    
	}

}
