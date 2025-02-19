package finalProject.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "finalProject.steps",
        dryRun = true,
        tags = "",
        plugin = {
                "pretty",
                "html:target/html_report/index.html",
                "json:target/jsonReports/cucumber.json",
        }

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
