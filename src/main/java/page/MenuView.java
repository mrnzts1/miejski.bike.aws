package page;

import config.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;


public class MenuView extends Page {

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Map']"))
    protected MobileElement MAP;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Nearby POI']"))
    protected MobileElement NEARBY_POI;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Recorded traces']"))
    protected MobileElement RECORDED_TRACES;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Settings']"))
    protected MobileElement SETTINGS;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Rate us']"))
    protected MobileElement RATE_US;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Send feedback']"))
    protected MobileElement SEND_FEEDBACK;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='About us']"))
    protected MobileElement ABOUT_US;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Partners']"))
    protected MobileElement PARTNERS;


    public MenuView() throws MalformedURLException {
        super();
    }
    public MenuView clickingMap() {
        MAP.click();
        return this;
    }
    public MenuView clickingNearbyPOI()throws MalformedURLException {
        NEARBY_POI.click();
        Actions.takeScreenshot("Nearby POI opened...");
        return this;
    }
    public MenuView clickingRecordedTraces()throws MalformedURLException {
        RECORDED_TRACES.click();
        Actions.takeScreenshot("Recorded traces clicked...");
        return this;
    }
    public MenuView clickingSettings()throws MalformedURLException {
        SETTINGS.click();
        Actions.takeScreenshot("Settings clicked...");
        return this;
    }
    public MenuView clickingRateUs() {
        RATE_US.click();
        return this;
    }
    public MenuView clickingSendFeedback() {
        SEND_FEEDBACK.click();
        return this;
    }

    public MenuView clickingAboutUS()throws MalformedURLException {
        ABOUT_US.click();
        Actions.takeScreenshot("About us clicked...");
        return this;
    }

    public MenuView clickingPartners() {
        PARTNERS.click();
        return this;
    }
}
