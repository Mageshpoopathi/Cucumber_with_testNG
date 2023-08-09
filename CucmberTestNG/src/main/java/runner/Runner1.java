package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner1 {
	@CucumberOptions(
			features = "C:\\Users\\swarn\\workspace4\\CucmberTestNG\\src\\test\\resources\\Features\\Features1.feature", 
			glue={ "stepDef"},
			plugin = { 
					"html:target/cucumber-reports/cucumberreport.html"}, 
						monochrome = true)
	public class RunCucumberTest extends AbstractTestNGCucumberTests {
		
	}
}
