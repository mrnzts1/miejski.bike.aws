package page;

import config.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class SettingsView extends Page{

    public SettingsView() throws MalformedURLException {
        super();
    }
    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Application colors']"))
    protected MobileElement APPLICATIONS_COLORS;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Keep map screen on']"))
    protected MobileElement KEEP_MAP_SCREEN_ON;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='POI spots']"))
    protected MobileElement POI_SPOTS;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Application version']"))
    protected MobileElement APPLICATION_VERSION;

    @AndroidFindBy (xpath = ("//android.widget.TextView[@text='Auto change colors']"))
    protected MobileElement AUTO_CHANGE_COLORS;

    @AndroidFindBy(id = "switch_widget")
    protected MobileElement SWITCH_TOGGLE;

    public SettingsView checkingIfDisableApplicationsColorsIsDisplayed()throws MalformedURLException {
        Actions.takeScreenshot("Settings opened...");
        assertTrue(APPLICATIONS_COLORS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfKeppMapScreenOnIsDisplayed() {
        assertTrue(KEEP_MAP_SCREEN_ON.isDisplayed());
        return this;
    }
    public SettingsView checkingIfPoiSpotsIsDisplayed() {
        assertTrue(POI_SPOTS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfApplicationVersionIsDisplayed() {
        assertTrue(APPLICATION_VERSION.isDisplayed());
        return this;
    }

    public SettingsView checkingIfAutoChangeColorsIsDisplayed() {
        assertTrue(AUTO_CHANGE_COLORS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfKeepMapScreenOnIsTurnedOff() {
        Assert.assertEquals("false", SWITCH_TOGGLE.getAttribute("checked"));
        return this;
    }
}
