package testrunner;       //after run the testrunner,in testoutput folder we can display index.html and can open and view the executed files
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
           (
        		   
        	features = ".//Features/login.feature",
        	glue = "stepdefinitions",
        	dryRun = true,
        	monochrome = true,
        	plugin = {"pretty",
        			"html:test-output"}
        	//tags ={"@sanity"}
        	
        		   
        		   
        		   
        		   
           )







public class testrunner {

	
	
	
	
	
	
	
	
	
	
	
}
