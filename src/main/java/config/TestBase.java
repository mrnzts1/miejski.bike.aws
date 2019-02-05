package config;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import static config.AndroidDriverFactory.getDriver;

public class TestBase extends AppConfig{

    @Before
    public void setUp() throws MalformedURLException {
        openApp();
    }

    @After
    public void quit (Scenario scenario) throws MalformedURLException {


        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(scrFile, new File("C:\\Users\\mrn\\Desktop\\miejskibike\\TestScreenshot/Error.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // driver.rotate(ScreenOrientation.PORTRAIT);
        getDriver().resetApp();
        //getDriver().pressKeyCode(AndroidKeyCode.BACK);
        //getDriver().startActivity(new Activity("pl.wtopolski.android.warsawbikepath", "bike.miejski.map.view.MapActivity"));

    }
}
