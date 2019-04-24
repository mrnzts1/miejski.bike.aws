package steps;

import config.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;

import java.net.MalformedURLException;

@CucumberOptions(strict = true,
                monochrome = true,
                features = "classpath:MapTest",
                plugin = {"pretty"})

public class MapSteps extends TestBase {


    @Given("^User accepts app conditions and allows access to location$")
    public void acceptingAppConditionsAndAllowingAccessToLocation() throws MalformedURLException {
        new MapView()
                .acceptingAppConditionsIfAppears()
                .acceptingAccessToLocation();
    }
    @Given("^User accepts app conditions and denies access to location$")
    public void acceptingAppConditionsAndDenyingAccessToLocation() throws MalformedURLException {
        new MapView()
                .acceptingAppConditionsIfAppears()
                .denyingAccessToLocation();
    }

    @Given("^User accepts app conditions and allows access to location - landscape")
    public void acceptingAppConditionsInLandscapePosition() throws MalformedURLException {
        new MapView()
                .rotatingDeviceToLandscape()
                .acceptingAppConditionsIfAppears()
                .acceptingAccessToLocation();
    }
    @Given("^User is located in Warsaw center")
    public void usersLocationIssettingInWarsawCenter() throws MalformedURLException{
        new MapView()
                .setLocationInWarsawCenter();
    }
    @Given("^User is located out of Warsaw")
    public void usersLocationIssettingOutOfWarsaw() throws MalformedURLException{
        new MapView()
                .setLocationOutOfWarsaw();
    }

    @Then("^Map and all elements on the map are displayed$")
    public void checkingAllTheElementsAreDisplayed() throws MalformedURLException{
        new MapView()
                .checkingMenuDrawerIsDisplayed()
                .checkingStartRecordingButtonIsDisplayed()
                .checkingLegendButtonIsDisplayed()
                .checkingTrackingButtonIsDisplayed()
                .checkingInformationIconIsDisplayed();

    }
    @When("^User located out of Warsaw")
    public void swipingMapWherePOIWillNotBeAvailable() throws MalformedURLException{
        new MapView()
                .setLocationOutOfWarsaw();
    }

    @When("^User clicks legend button")
    public void clickingLegendButton() throws MalformedURLException{
        new MapView()
                .clickingLegendButton();

    }

    @Given("^User does not accept app conditions$")
    public void userDoesNotAcceptAppConditions() throws MalformedURLException {
        new MapView()
                .notAcceptingAppConditionsIfAppears();
    }

    @Then("^All positions in legend are displayed")
    public void checkingIfAllElementsInLegendAreDisplayed() throws MalformedURLException{
        new MapView()
                .checkingIfAllElementsInLegendAreDisplayed();
    }

    @When("^User clicks start recording button")
    public void clickingStartRecordingButton() throws InterruptedException, MalformedURLException{
        new MapView()
                .recordingTrace();
    }
}
