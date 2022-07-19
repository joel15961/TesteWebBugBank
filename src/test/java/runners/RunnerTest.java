package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepsDefinitions",
        dryRun = false,
        tags = {""},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = false,
        plugin = {"pretty", "html:target/cucumber-report"}
)
public class RunnerTest {

}
