package Steps;

import BaseLayer.BaseClass;
import PageLayer.UserInformationPage;
import io.cucumber.java.en.When;

public class UserInformationPageSteps extends BaseClass {
     public static UserInformationPage userInformationPage;
	
	@When("user enters valid username, password, confirmpassword and click on submit button")
	public void user_enters_valid_username_password_confirmpassword_and_click_on_submit_button() {
	     
		 userInformationPage=new UserInformationPage();
		 userInformationPage.userInfoFunctionality("khalatesonali@gmail.com", "khalatesonali123", "khalatesonali123");
	}
}
