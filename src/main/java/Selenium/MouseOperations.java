package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program_Sample\\file\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myntra.com/");

		driver.manage().window().maximize();

		/* Thread.sleep(3000); \
		 * ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");*/
		 
		Actions a = new Actions(driver);
		By menLink = By.linkText("Men");
		WebElement e = driver.findElement(menLink);
		a.moveToElement(e).build().perform();

		driver.findElement(By.linkText("Bags & Backpacks")).click();

		Thread.sleep(3000);

		Actions a1 = new Actions(driver);
		By sel = By.xpath("//*[@class='results-base']/li[1]");
		driver.findElement(sel);

		driver.quit();
	}

}
