package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\training_h1b.06.15\\eclipse-workspace\\cucumberProject\\src\\test\\java", glue= {"stepsdefs1"},
plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"})

public class DemoLoginTestRunner1 
{
	

}
