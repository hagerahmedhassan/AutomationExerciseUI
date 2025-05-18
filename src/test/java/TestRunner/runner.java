package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
        (
        features = "src/test/resources/Features",
        glue = {"StepDefinition","hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
        )
public class runner extends AbstractTestNGCucumberTests
{

}