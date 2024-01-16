package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginSuccessPage;
import io.cucumber.java.en.When;

public class LoginSuccessPageSteps extends BaseClass {

	public static LoginSuccessPage loginSuccessPage;

	@When("user validate login success page text and url")
	public void user_validate_login_success_page_text_and_url() {

		loginSuccessPage = new LoginSuccessPage();
		String actualText = loginSuccessPage.getLoginSuccessText();
		Assert.assertEquals(actualText, "Login Successfully");

		String actualUrl = loginSuccessPage.getLoginSuccessPageUrl();
		boolean c = actualUrl.contains("login_sucess");
		Assert.assertEquals(c, true);
	}

}
