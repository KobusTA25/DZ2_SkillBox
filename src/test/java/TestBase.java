import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class TestBase {

    public AndroidDriver driver;
    private DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setDriver() throws MalformedURLException {
        driverFactory = new DriverFactory();
        driver = driverFactory.setUp();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
