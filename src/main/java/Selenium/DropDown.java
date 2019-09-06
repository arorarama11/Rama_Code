package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		WebElement e = driver.findElement(By.id("continents"));
		Select s = new Select(e);
		s.selectByIndex(0);
		s.selectByValue("Navigation Commands");
		List<WebElement> list = s.getOptions();
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String svalue = s.getOptions().get(i).getText();
			System.out.println(svalue);

			s.selectByIndex(i);
		}

		s.deselectAll();
	}
}
