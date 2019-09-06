package InterviewQuestion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleClass {
	
	public static void main(String[] args)
	{
		int count = 0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window:" +parentWindow);
		
		Set<String> s1 = driver.getWindowHandles();
		
		System.out.println("child window: " +s1);
		
		String childWindow1 = (String) s1.toArray()[0];
		System.out.println(childWindow1);
		
		String childWindow2 = (String) s1.toArray()[1];
		System.out.println(childWindow2);
		
		String childWindow3 = (String) s1.toArray()[2];
		System.out.println(childWindow3);
		
		driver.switchTo().window(childWindow2);
		System.out.println(driver.switchTo().window(childWindow2).getTitle());
		
		driver.switchTo().window(childWindow3);
		driver.close();
		
		
	}

}
