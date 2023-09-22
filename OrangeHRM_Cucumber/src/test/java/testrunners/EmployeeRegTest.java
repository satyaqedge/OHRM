package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/EmployeeReg.feature" , glue = "stepdefinations" , dryRun = false,
plugin = {"pretty","html:reports/empregreport.html"})
public class EmployeeRegTest extends AbstractTestNGCucumberTests
{

}
