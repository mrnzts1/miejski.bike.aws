package config;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;


public class AppConfig {

    public AndroidDriver driver;

    public void openApp() throws MalformedURLException {
        this.driver = getDriver();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
