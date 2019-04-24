package page;

import config.Actions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.net.MalformedURLException;

import static org.testng.Assert.assertTrue;

public class RecordedTraces extends Page{

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Sorry, nothing to display']"))
    protected MobileElement EMPTY_DESCRIPTION;

    public RecordedTraces() throws MalformedURLException {
        super();
    }

    public RecordedTraces checkingEmptyDescriptionIsDisplayed () throws MalformedURLException{
        Actions.takeScreenshot("Recorded traces clicked...");
        assertTrue(EMPTY_DESCRIPTION.isDisplayed());
        return this;

    }
}
