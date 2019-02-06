import cucumber.api.CucumberOptions;

@CucumberOptions( monochrome = true,
        features = "src/test/java/features/",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "steps" )


public class TestRunner {
}
