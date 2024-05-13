package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//this generates the run button- RunWith
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
        //plugin is for generating reports
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true)
public class TestRunner {


}
