package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"classpath:feature/Googleexample.feature"},
		 glue= {"stepdefinition"}
		
		)

public class Testrun {

}
