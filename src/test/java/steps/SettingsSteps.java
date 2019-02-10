package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.SettingsView;

public class SettingsSteps {

    @When("^User goes to ‘Settings’")
    public void goingToSettings() throws Throwable{
        new MapView()
                .clickingMenuDrawer();
        new MenuView()
                .clickingSettings();
    }
    @Then("^All the elements are displayed")
    public void allElementsInSettingsAreDisplayed() throws Throwable{
        new SettingsView()
                .checkingIfDisableApplicationsColorsIsDisplayed()
                .checkingIfAutoChangeColorsIsDisplayed()
                .checkingIfKeppMapScreenOnIsDisplayed()
                .checkingIfPoiSpotsIsDisplayed()
                .checkingIfApplicationVersionIsDisplayed();
    }
    @Then("^Keep map on toggle is turned off")
    public void disableTrackingCheckboxIsSelected() throws Throwable{
        new SettingsView()
                .checkingIfKeepMapScreenOnIsTurnedOff();
    }
}
