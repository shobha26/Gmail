package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;

public class Testclass {
	 
	
	@Test
	public void verifyvaliduser() throws InterruptedException
	{
		WebDriver dvr= BrowserFactory.startBrowser("firefox","http://www.gmail.com");
		LoginPage login_page=PageFactory.initElements(dvr, LoginPage.class);
		
		login_page.login_gmail("shubha2602@gmail.com", "anu_02607");
		
	    ComposeEmail compose_email=PageFactory.initElements(dvr, ComposeEmail.class);
	    
	    compose_email.composeemail("upadhyayshobha26@gmail.com","Test","Test");
	    
	    
		
		
	}

}
