package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class MailingPageInformation extends BaseClass {

	@FindBy(name = "address1")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "postalCode")
	private WebElement pcode;

	@FindBy(name = "country")
	private WebElement country;

	public MailingPageInformation() {
		PageFactory.initElements(driver, this);

	}

	public void infoAddCityStateFunctionality(String Address,String City,String State, String PostalCode,
			String Country )
	{
	Wait.sendKeys(address, Address);
	Wait.sendKeys(city, City);
	Wait.sendKeys(state, State);Wait.sendKeys(pcode, PostalCode);
	
	Select sel=new Select(country);
	sel.selectByVisibleText(Country);
	
	
}

}
