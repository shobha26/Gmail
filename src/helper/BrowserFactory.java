package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
 static	WebDriver dvr;
	
	public static WebDriver startBrowser(String browserName, String URL)
	{
		
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","../GmailNewProject/Drivers/geckodriver.exe");
			dvr= new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","../GmailNewPrject/Drivers/geckodriver.exe");
			dvr= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			dvr= new InternetExplorerDriver();
		}
		
		dvr.manage().window().maximize();
		
		dvr.get(URL);
		return dvr;
	}

}
