package StepDef;

import java.io.IOException;

import BaseClass.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Login extends BaseMethods {

	

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		setup();
		
		go("https://formdepot.dev.radixweb.net/admin/");


	}

	@When("^User enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException, IOException {
		
		type(xpath("Username"), username);
		//type("//*[@name='username']",username);
		type(xpath("Password"),password);
		
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException, IOException {
		click(xpath("Login"));
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws IOException, InterruptedException {

		verifyPageUrl(data("Dashboard"));
		sleep(2000);
		
	}


}
