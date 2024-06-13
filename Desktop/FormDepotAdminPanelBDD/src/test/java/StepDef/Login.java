package StepDef;
import BaseClass.*;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



//public class Login extends BaseMethods {
	public class Login implements BaseTest{
		
		protected WebDriver driver = BaseMethods.setup2();
		
		
		
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		//BaseMethods.setup();
		
		BaseMethods.go("https://formdepot.dev.radixweb.net/admin/");


	}

	@When("^User enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException, IOException {
		
		BaseMethods.type(BaseMethods.xpath("Username"), username);
		//type("//*[@name='username']",username);
		BaseMethods.type(BaseMethods.xpath("Password"),password);
		
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException, IOException {
		BaseMethods.click(	BaseMethods.xpath("Login"));
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws IOException, InterruptedException {

		BaseMethods.verifyPageUrl(BaseMethods.data("Dashboard"));
		BaseMethods.sleep(2000);
		
	}


}
