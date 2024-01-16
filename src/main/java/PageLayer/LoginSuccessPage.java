package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginSuccessPage extends BaseClass{

	
	@FindBy(xpath="//h3[text()='Login Successfully']")
	private WebElement loginsuccessmsg  ;
	
	public LoginSuccessPage()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	public String getLoginSuccessText()
	{
		return loginsuccessmsg.getText();
		
	}
	
	public String getLoginSuccessPageUrl()
	{
		
	return	driver.getCurrentUrl();
		
	}
	
}
