package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ContactInformationPage extends BaseClass {

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(name = "phone")
	private WebElement phno;

	@FindBy(name = "userName")
	private WebElement email;

	public ContactInformationPage() {

		PageFactory.initElements(driver, this);

	}

	public String getRegisterPageUrl() {
		return driver.getCurrentUrl();
	}

	public void addContactInfoFunctionality(String Fname, String Lname, String Phonenumb, String EmailId) {
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
		Wait.sendKeys(phno, Phonenumb);
		Wait.sendKeys(email, EmailId);

	}
}
