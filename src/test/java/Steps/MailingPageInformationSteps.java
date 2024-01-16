package Steps;

import BaseLayer.BaseClass;
import PageLayer.MailingPageInformation;
import io.cucumber.java.en.Given;

public class MailingPageInformationSteps extends BaseClass {
    public static MailingPageInformation mailingPageInformation;
	
	@Given("user enters valid address, city , state,postal code and country")
	public void user_enters_valid_address_city_state_postal_code_and_country() {
		 mailingPageInformation=new MailingPageInformation();
		 mailingPageInformation.infoAddCityStateFunctionality("Pune", "Thane", "Maharashtra", "313131", "INDIA");
	}
	
	
}
