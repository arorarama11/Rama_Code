package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/strong")).getText());
		List<WebElement> radio = driver.findElements(By.name("sex"));
		boolean b = false;
		b = radio.get(0).isSelected();

		if (b == false) {
			radio.get(0).click();
		} else {
			radio.get(1).click();
		}

	}
}
