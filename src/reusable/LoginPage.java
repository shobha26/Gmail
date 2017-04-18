package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
	WebDriver dvr;
	
	public LoginPage(WebDriver ldvr)
	{
		this.dvr=ldvr;
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@id='Email']")
	@CacheLookup
	WebElement Username;
	
	@FindBy(how=How.XPATH, using="//input[@id='next']")
	@CacheLookup
	WebElement ClickNext;
	
	@FindBy(how=How.XPATH, using="//input[@id='Passwd']")
	@CacheLookup
	WebElement Password;
	
	@FindBy(how=How.XPATH, using="//input[@id='signIn']")
	@CacheLookup
	WebElement Clicksubmit;
	
	public void login_gmail(String uid,String pass) throws InterruptedException
	{
	Username.sendKeys(uid);
	ClickNext.click();
	Thread.sleep(2000);
	Password.sendKeys(pass);
	Clicksubmit.click();
	}
	
	
}
