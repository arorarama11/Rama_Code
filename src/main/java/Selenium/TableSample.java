package Selenium;

import java.util.List;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSample {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program_Sample\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		WebElement baseTable = driver.findElement(By.tagName("table"));
		/*WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String rowText = tableRow.getText();
		System.out.println(rowText);
		WebElement tableColumn = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
	    String colText = tableColumn.getText();
	    System.out.println("Column value is : " + colText); 
		*/
	    List<WebElement> tableRow =  baseTable.findElements(By.tagName("tr"));
	    int rowCount = tableRow.size();
	    System.out.println(rowCount);
	    
		for(int i=0; i<rowCount; i++)
		{
			String rowText = tableRow.get(i).getText();
			System.out.println(rowText);
			
			List<WebElement> tableColumn = baseTable.findElements(By.tagName("td"));
			for(int j=0; j<tableColumn.size(); j++)
			{
				String colText = tableColumn.get(j).getText();
				System.out.println(colText);
			}
		}
		
		
	}

}
