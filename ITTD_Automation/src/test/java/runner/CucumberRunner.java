package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Create_Account.feature"
				,glue="steps")
public class CucumberRunner extends AbstractTestNGCucumberTests {

	
	
}
