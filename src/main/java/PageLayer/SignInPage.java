package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class SignInPage extends BaseClass {

	@FindBy(xpath = "//a[text()=' sign-in ']")
	private WebElement signinlink;

	public SignInPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickOnSigninLink() {

		Wait.click(signinlink);

	}
}
