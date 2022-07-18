package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "",
        monochrome = true,
        plugin = {"html:target/cucumber-report"}
)
public class RunnerTest {
}
