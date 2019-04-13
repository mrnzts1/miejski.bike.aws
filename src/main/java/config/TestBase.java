package config;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;


public abstract class TestBase extends AbstractTestNGCucumberTests {

    private static AndroidDriver driver;
    private static String baseURL = "http://127.0.0.1:4723/wd/hub";


    @BeforeSuite
    private static DesiredCapabilities getCapabilities()  {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("deviceName", "5981eeff0504");
        capabilities.setCapability("app", "C:\\Users\\mrn\\Desktop\\bike apk\\miejski-bike-debug-2.8.1-beta1.apk");

        return capabilities;
    }

    public TestBase() {}

    public static AndroidDriver getDriver() throws MalformedURLException {

        if (driver == null) {
            driver = new AndroidDriver(new URL(baseURL), getCapabilities());
        }
        return driver;
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeClass
    public void setUp() throws MalformedURLException {
        this.driver = getDriver();
    }

    @AfterMethod
    public void restartApp (Method method) throws MalformedURLException {
        getDriver().resetApp();
    }
}