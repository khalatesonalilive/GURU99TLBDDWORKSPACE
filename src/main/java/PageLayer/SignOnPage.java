package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class SignOnPage extends BaseClass{

	@FindBy(name="userName")
	private WebElement uname ;
	
	@FindBy(name="password")
	private WebElement pass ;
	
	@FindBy(name="submit")
	private WebElement submitButton  ;
	
	public SignOnPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signOnInformation(String userName, String passWord)
	{
		Wait.sendKeys(uname, userName);
		Wait.sendKeys(pass, passWord);
		Wait.click(submitButton);
		
		
	}
}
