package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactInformationPage;
import io.cucumber.java.en.Given;

public class ContactPageInformationSteps extends BaseClass{
    public static ContactInformationPage contactInformationPage;
    
	@Given("user is on RegisterPage and validate the registerPage URL")
	public void user_is_on_register_page_and_validate_the_register_page_url() {
	    
		 contactInformationPage=new ContactInformationPage();
		String actualUrl= contactInformationPage.getRegisterPageUrl();
		boolean b=actualUrl.contains("register");
		Assert.assertEquals(b, true);
		
	}
	@Given("user enter valid Firstname, Lastname, Phonenumber and email")
	public void user_enter_valid_firstname_lastname_phonenumber_and_email() {
	    
		contactInformationPage.addContactInfoFunctionality("Sonali", "Khalate", "8080808080", "khalatesonali@gmail.com");
	}

}
