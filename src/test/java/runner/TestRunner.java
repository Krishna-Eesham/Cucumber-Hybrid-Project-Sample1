package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/resources/features/login.feature",
        glue ={"stepdefinitions","hooks"},
        tags="@all",
        plugin= {"pretty",
        		"html:Reports/CucumberReports/CucumberFirstRunner.html",
        		"json:Reports/CucumberReports/CucumberFirstRunner.json",
        		  "junit:Reports/CucumberReports/CucumberXMLRunner.xml" }
                   )
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
}
