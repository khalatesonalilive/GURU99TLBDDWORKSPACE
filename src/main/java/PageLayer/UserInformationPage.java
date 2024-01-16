package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class UserInformationPage extends BaseClass {

	@FindBy(name = "email")
	private WebElement emaIL;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(name = "confirmPassword")
	private WebElement conpass;

	@FindBy(name = "submit")
	private WebElement submitButton;

	public UserInformationPage() {

		PageFactory.initElements(driver, this);

	}

	public void userInfoFunctionality(String emailID, String Password, String ConfirmPassword) {
		Wait.sendKeys(emaIL, emailID);
		Wait.sendKeys(pass, Password);
		Wait.sendKeys(conpass, ConfirmPassword);
		Wait.click(submitButton);

	}

}
