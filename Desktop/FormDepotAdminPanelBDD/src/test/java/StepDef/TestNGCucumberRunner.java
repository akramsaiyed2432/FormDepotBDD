package StepDef;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

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









//public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
//	  @Override
//	  @DataProvider(parallel = true)
//	  public Object[][] scenarios() {
//	    return super.scenarios();
//	  }
//	
//}

public class TestNGCucumberRunner {
	
}

