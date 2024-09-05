package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/LoggedInUser.feature", // Path to feature files
        glue = {"utility","StepDefinition"},//step definitions are located
        plugin = {
                "pretty",
                "html:target/cucumber-html-report", // Correct syntax for HTML report
                "json:target/cucumber.json" // Correct syntax for JSON report
        }
)
public class TestRunner {
}
