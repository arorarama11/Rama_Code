package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AugoSuggestionTextSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		try {
			driver.findElement(By.name("q")).sendKeys("selenium");

			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul/li/div/div/div/span[text()='selenium']")));

			List<WebElement> list = driver.findElements(By.xpath("//ul/li/div/div/div/span[text()='selenium']"));
			int count = list.size();

			for (int i = 0; i < count; i++) {
				String text = list.get(i).getText();
				System.out.println(text);
				if (text.equals("selenium interview questions")) {
					list.get(i).click();
					break;
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
