package Steps;

import BaseLayer.BaseClass;
import PageLayer.SignInPage;
import io.cucumber.java.en.When;

public class SignInPageSteps extends BaseClass {

	  public static SignInPage signInPage;
	@When("user click on Signin link")
	public void user_click_on_signin_link() {
	    
		 signInPage=new SignInPage();
		 signInPage.clickOnSigninLink();
	}
}
