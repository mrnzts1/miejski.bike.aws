package page;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;

import static config.TestBase.getDriver;


public class Page {

    public Page() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);

    }

}