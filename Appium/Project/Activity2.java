package ProjectActivities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity2 {
    AndroidDriver driver;
@BeforeClass
    public void Setup() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
@Test
    public void Gkeep()
    {
        String Title="Testing";
        String Subtitle="GoogleKeep";
        String combo=Title+"."+Subtitle+".";
    driver.findElement(AppiumBy.accessibilityId("New text note")).click();
    driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys(Title);
    driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys(Subtitle);
    driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
    String Text=driver.findElement(AppiumBy.xpath("//androidx.cardview.widget.CardView[1]")).getAttribute("content-desc");


        Assert.assertEquals(Text,Title+". "+Subtitle+". ");
    }
    @AfterClass
    public void teardown()
    {

        driver.quit();
    }
}
