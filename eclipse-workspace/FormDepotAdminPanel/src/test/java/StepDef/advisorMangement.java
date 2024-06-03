package StepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class advisorMangement extends BaseMethods {
	@Given("User is on Advisor Management screen.")
	public void user_is_on_advisor_management_screen() throws IOException {
		verifyPageUrl("https://formdepot.dev.radixweb.net/admin/dashboard/user");
	}


@Given("^User enter (.*)  in searchbar and click on search button")
public void user_enter_searchtext_in_searchbar_and_click_on_search_button(String searchtext) throws IOException, InterruptedException {
type(xpath("Searchbar"), searchtext);
click(xpath("Searchbutton"));
sleep(1000);
// Searchbar = xpath("Searchbar");
clear(driver.findElement(By.xpath(xpath("Searchbar"))));
sleep(1000);
}


	@Then("^Appropriate search result as per the (.*) should be displayed.")
	public void appropriate_search_result_should_be_displayed(String searchtext) throws IOException, InterruptedException {
//		String Firstrow = driver.findElement(By.xpath(xpath("Firstrow"))).getText();
//		print(Firstrow);
//		for(int i = 1; i<=5; i++) {
//		String xpath = "/tbody/tr["+i+"]//td[contains(text(),'"+searchtext+"')]";
//		comparetext(xpath, i);
			System.out.println("Will fix this later on.");
		}
		
	
}
