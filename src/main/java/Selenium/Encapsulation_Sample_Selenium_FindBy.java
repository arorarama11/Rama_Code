package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Encapsulation_SampleSelenium2 {
	
	@FindBy(name="email")
	private WebElement un;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//td/label[@id='loginbutton']")
	private WebElement login;
	
	public Encapsulation_SampleSelenium2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname, String password)
	{
		un.sendKeys(uname);
		pwd.sendKeys(password);
		login.sendKeys(Keys.TAB);
		login.sendKeys(Keys.ENTER);
	}

}

public class Encapsulation_Sample_Selenium_FindBy
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Encapsulation_SampleSelenium2 en = new Encapsulation_SampleSelenium2(driver);
		en.login("arorarama11@gmail.com", "ilovegod@20");
		Thread.sleep(2000);
		en.login("admin", "manager");
	}
}
