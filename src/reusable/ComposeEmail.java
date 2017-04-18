package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ComposeEmail {

	
WebDriver dvr;


	
	public ComposeEmail(WebDriver ldvr)
	{
		this.dvr=ldvr;
	}
	
	
	@FindBy(how=How.XPATH, using="//div[text()='COMPOSE'][@class='T-I J-J5-Ji T-I-KE L3']")
	@CacheLookup
	WebElement Composeemail;
	
	
	
	@FindBy(how=How.XPATH, using="//div[@class='wO nr l1']//textarea[@id=':mz']")
	@CacheLookup
	WebElement ToEmail;
	
	
	@FindBy(how=How.XPATH, using="//input[@id=':mj']")
	@CacheLookup
	WebElement Subject;
	
	@FindBy(how=How.XPATH, using="//div[@id=':nl']")
	@CacheLookup
	WebElement Mailbody;
	
	
	@FindBy(how=How.XPATH, using="//div[@id=':m9']")
	@CacheLookup
	WebElement Clicksend;
	
	
	public void composeemail(String to, String subject,String body) throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(dvr,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='COMPOSE'][@class='T-I J-J5-Ji T-I-KE L3']")));
		
		Composeemail.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='wO nr l1']//textarea[@id=':mz']")));
		ToEmail.click();
		ToEmail.sendKeys(to);
		Subject.sendKeys(subject);
		Mailbody.sendKeys(body);
		Clicksend.click();
		
		

	}
	
	
}

