package StepDef;
import BaseClass.*;

import java.io.IOException;

import org.openqa.selenium.By;

import BaseClass.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

//public class advisorMangement extends BaseMethods {
	public class advisorMangement  {

	@Given("User is on Advisor Management screen.")
	public void user_is_on_advisor_management_screen() throws IOException {
		BaseMethods.verifyPageUrl("https://formdepot.dev.radixweb.net/admin/dashboard/user");
	}


@Given("^User enter (.*)  in searchbar and click on search button")
public void user_enter_searchtext_in_searchbar_and_click_on_search_button(String searchtext) throws IOException, InterruptedException {
	BaseMethods.sleep(2000);
	BaseMethods.type(BaseMethods.xpath("Searchbar"), searchtext);
	BaseMethods.click(BaseMethods.xpath("Searchbutton"));
	BaseMethods.sleep(1000);
System.out.println("searchbutton clicked");
//type(xpath("Searchbar"), "");
BaseMethods.clear(BaseMethods.driver.findElement(By.xpath(BaseMethods.xpath("Searchbar"))));
System.out.println("searchbar cleared");
BaseMethods.sleep(1000);
}

@And("User click on Filter icon")
public void user_click_on_filter_icon() throws IOException {
	BaseMethods.click(BaseMethods.xpath("Filter"));
}


@And("User selects FilterOption1")
public void user_selects_filter_option1() throws IOException, InterruptedException {
	BaseMethods.click(BaseMethods.xpath("FilterOption1"));
	BaseMethods.sleep(1000);
}

@And("User selects FilterOption2")
public void user_selects_filter_option2() throws IOException, InterruptedException {
	BaseMethods.click(BaseMethods.xpath("FilterOption2"));
	BaseMethods.sleep(1000);


}

@And("User selects FilterOption3")
public void user_selects_filter_option3() throws IOException, InterruptedException {
	BaseMethods.click(BaseMethods.xpath("FilterOption3"));
	BaseMethods.sleep(1000);

}


@Then("Appropriate records should be displayed.")
public void appropriate_records_should_be_displayed() {
			System.out.println("TBI");
}

	@Then("^Appropriate search result as per the (.*) should be displayed.")
	public void appropriate_search_result_should_be_displayed(String searchtext) throws IOException, InterruptedException {
//		String Firstrow = driver.findElement(By.xpath(xpath("Firstrow"))).getText();
//		print(Firstrow);
//		for(int i = 1; i<=5; i++) {
//		String xpath = "/tbody/tr["+i+"]//td[contains(text(),'"+searchtext+"')]";
//		comparetext(xpath, i);
		BaseMethods.click(BaseMethods.xpath("Searchbutton"));
		BaseMethods.refresh();
			System.out.println("Will fix this later on.");
		}
		
	
}
