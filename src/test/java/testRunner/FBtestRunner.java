package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"Features/"}, 
				glue = {"stepDefs"}
				
		)

public class FBtestRunner extends AbstractTestNGCucumberTests {

}
