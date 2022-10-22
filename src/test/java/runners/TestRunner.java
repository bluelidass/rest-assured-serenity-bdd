package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", 
    plugin = { "pretty","html:target/cucumber-reports/cucumber-pretty.html" }, 
    tags = "not @ignored",
    glue = { "steps" })
    
public class TestRunner {
}