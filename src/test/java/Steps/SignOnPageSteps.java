package Steps;

import BaseLayer.BaseClass;
import PageLayer.SignOnPage;
import io.cucumber.java.en.When;

public class SignOnPageSteps extends BaseClass {
      public static SignOnPage SignOnPage;
	
	@When("user enters valid username, password and click on submit button")
	public void user_enters_valid_username_password_and_click_on_submit_button() {
	   
		 SignOnPage=new SignOnPage();
		 SignOnPage.signOnInformation("khalatesonali@gmail.com", "khalatesonali123");
	}
}
