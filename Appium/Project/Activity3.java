package ProjectActivities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @Test
    public void maintest() {
        driver.get("https://www.training-support.net/selenium");
        driver.findElement(AppiumBy.id("com.android.chrome:id/signin_fre_dismiss_button")).click();

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"To-Do List \uF0AE Elements get added at run time\"]/android.view.View/android.widget.TextView[1]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Clear List')]")).click();
        driver.findElement(AppiumBy.xpath("//android.view.View[1]/android.widget.EditText")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Testing");

        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")).click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[contains(@test='Testing')]")));

        driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Appium");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[contains(@text,'Add Task')]")).click();

        List<WebElement> listdp = driver.findElements(AppiumBy.xpath("//android.view.View[2]/android.view.View/android.widget.TextView"));
        Assert.assertEquals(2,listdp.size());
        for (WebElement items : listdp) {
           items.click();
        }
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Clear List')]")).click();
    }
}
