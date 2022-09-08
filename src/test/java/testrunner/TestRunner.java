package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/orangehrmlogin.feature",
glue="stepdefinition", dryRun=false, monochrome=true, 
plugin= {"pretty","html:target/output.html" , "junit:target/output.xml", 
		"json:target/output.json"})

		

public class TestRunner {
	
	
	

}
