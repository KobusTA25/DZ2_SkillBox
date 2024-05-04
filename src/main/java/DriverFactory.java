
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;

public class DriverFactory {

    private AndroidDriver driver;
    private DesiredCapabilities capabilities;

    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(APP_PACKAGE, "com.android.settings");
        desiredCapabilities.setCapability(APP_ACTIVITY, "com.android.settings.Settings");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        return new AndroidDriver(remoteUrl, capabilities);
    }

}


