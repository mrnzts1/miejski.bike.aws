package steps;

import config.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.RecordedTraces;

import java.net.MalformedURLException;

@CucumberOptions(strict = true,
        monochrome = true,
        features = "classpath:RecordedTracesTest",
        plugin = {"pretty"})

public class RecordedTracesSteps extends TestBase {

    @When("User goes to Recorded Traces")
    public void goingToRecordedTraces() throws MalformedURLException {
        new MapView()
                .clickingMenuDrawer();

        new MenuView()
                .clickingRecordedTraces();
    }
    @Then("^User can see information that there are no recorded traces")
    public void checkingThereAreNoRecordedTraces() throws MalformedURLException{
        new RecordedTraces()
                .checkingEmptyDescriptionIsDisplayed();
    }
}
