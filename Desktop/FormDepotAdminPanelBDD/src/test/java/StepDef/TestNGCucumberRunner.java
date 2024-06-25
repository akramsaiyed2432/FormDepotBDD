package StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features", 
		glue= {"StepDef"},
		plugin = {"pretty","html:target/HtmlReports.html"},
		tags="@smoketest"

)









public class TestNGCucumberRunner extends AbstractTestNGCucumberTests{
	
	
}
