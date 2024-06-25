package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"StepDef"},
				plugin = {
				        "pretty", 
				        "html:target/HtmlReports.html",
				        "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
				    },
		tags="@smoketest"

)




public class MyRunner  {

	
}
