import io.appium.java_client.MobileElement;
import org.junit.Test;

public class SampleTests extends TestBase {

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.dialer:id/contacts_tab");
        el1.click();
        MobileElement emptyListViewMessage =  (MobileElement) driver.findElementById("com.android.dialer:id/empty_list_view_message");
        emptyListViewMessage.isDisplayed();


    }

}