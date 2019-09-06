package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Encapsulation_SampleSelenium1 {
	
	private WebElement un;
	private WebElement pwd;
	private WebElement login;
	
	public Encapsulation_SampleSelenium1(WebDriver driver)
	{
		un = driver.findElement(By.name("email"));
		pwd = driver.findElement(By.name("pass"));
		login = driver.findElement(By.xpath("//td/label[@id='loginbutton']"));
	}
	
	public void login(String uname, String password)
	{
		un.sendKeys(uname);
		pwd.sendKeys(password);
		login.sendKeys(Keys.TAB);
		login.sendKeys(Keys.ENTER);
	}

}

public class Encapsulation_SampleSelenium
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Encapsulation_SampleSelenium1 en = new Encapsulation_SampleSelenium1(driver);
		en.login("arorarama11@gmail.com", "ilovegod@20");
		Thread.sleep(2000);
		en.login("admin", "manager");
	}
}
