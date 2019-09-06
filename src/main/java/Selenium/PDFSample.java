package Selenium;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;







import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDFSample {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BOI\\Rama_Pratice_Workspace\\Program_Sample\\file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://toolsqa.com/automation-practice-form");
		URL pdfpath = new URL("http://www.pdf995.com/samples/pdf.pdf");
		InputStream is = pdfpath.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		
		PDDocument doc = null;
		doc = PDDocument.load(bis);
		
		String text = new PDFTextStripper().getText(doc);
		System.out.println(text);
		
	}
}
