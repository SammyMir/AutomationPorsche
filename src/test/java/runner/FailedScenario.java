package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/rerun.txt",
        glue="step_def",
        dryRun=false,
        monochrome=true,
        //tags="@data",
        plugin = { "pretty", "json:target/cucumber-reports/CucumberReport.json",
                "junit:target/cucumber-reports/CucumberReport.xml",
                "html:target/cucumber-reports/CucumberReport.html",
                "rerun:target"}
)


public class FailedScenario {
}
