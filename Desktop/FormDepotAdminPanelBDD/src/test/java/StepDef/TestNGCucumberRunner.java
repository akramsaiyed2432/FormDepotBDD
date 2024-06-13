package StepDef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"StepDef"},
		plugin = {"pretty","html:target/HtmlReports.html"}
		//tags="@smoketest"

)









public class TestNGCucumberRunner extends AbstractTestNGCucumberTests{
	
	
}
