package config;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverFactory {

//    private static AndroidDriver driver;
//    private static String baseURL = "http://127.0.0.1:4723/wd/hub";
//
//    private static DesiredCapabilities getCapabilities() {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        // capabilities.setCapability("automationName", "uiautomator2");
//
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "9");
//        //capabilities.setCapability("deviceName", "emulator-5554");
//        capabilities.setCapability("deviceName", "5981eeff0504");
//        //  capabilities.setCapability("autoGrantPermissions", "true");
//        // capabilities.setCapability("noReset", "true");
//        capabilities.setCapability("app", "C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-release-2.8.0-beta1.apk");

        private static AndroidDriver driver;


    public static final String USERNAME = "mrnzts";
    public static final String ACCESS_KEY = "cb29ee30b24c6988aa0c3487b8041aac";
    public static final String KEY = USERNAME + ":" + ACCESS_KEY;
    public static final String URL = "http://hub.testinium.io/wd/hub";

    private static   DesiredCapabilities getCapabilities() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("key", KEY);

        capabilities.setCapability(CapabilityType.PLATFORM, "ANDROID");
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "PIXEL_2");
        capabilities.setCapability(CapabilityType.VERSION, "8.1.0");
        //capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
        capabilities.setCapability("deviceName", "PIXEL 2");
        capabilities.setCapability("app", "http://testinium-hub.s3.amazonaws.com/2461/automated-upload/miejski-bike-release-2.8.0-beta1-71f1872f.apk");

       // WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);


        return capabilities;
    }

    private AndroidDriverFactory() {}

    public static AndroidDriver getDriver() throws MalformedURLException {

        if (driver == null) {
            driver = new AndroidDriver(new URL(URL), getCapabilities());
        }
        return driver;
    }
}
