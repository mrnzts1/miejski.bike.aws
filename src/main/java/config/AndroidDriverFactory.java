package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverFactory {

    private static AndroidDriver driver;
    private static String baseURL = "http://127.0.0.1:4723/wd/hub";

    private static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // capabilities.setCapability("automationName", "uiautomator2");

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        //capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("deviceName", "5981eeff0504");
        //  capabilities.setCapability("autoGrantPermissions", "true");
        // capabilities.setCapability("noReset", "true");
        capabilities.setCapability("app", "C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk");

        return capabilities;
    }

    private AndroidDriverFactory() {}

    public static AndroidDriver getDriver() throws MalformedURLException {

        if (driver == null) {
            driver = new AndroidDriver(new URL(baseURL), getCapabilities());
        }
        return driver;
    }
}
