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

public class Activity1 {
    AndroidDriver driver;
@BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Test
    public void GTask1() throws InterruptedException {
    String x = "Complete Activity with Google Tasks";
    driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
    driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys(x);
    driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
    String task1 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]")).getAttribute("content-desc");
    Assert.assertEquals(task1, x);
}
@Test
    public void GTask2() throws InterruptedException {
        String y = "Complete Activity with Google Keep";
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys(y);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        String task2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]")).getAttribute("content-desc");
        Assert.assertEquals(task2, y);
    }
    @Test
    public void GTask3() throws InterruptedException {
        String z = "Complete the second Activity Google Keep";
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys(z);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
    String task3= driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]")).getAttribute("content-desc");
    Assert.assertEquals(task3,z);

    }
    @AfterClass
    public void teardown()
    {

        driver.quit();
    }

}