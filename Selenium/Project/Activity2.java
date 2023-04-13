import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main (String[] arg)
    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");
        String ActualValue=driver.findElement(By.className("entry-title")).getText();
        String ExpectedValue="Welcome to Alchemy Jobs";
        if (ActualValue.equals(ExpectedValue))
        {
            System.out.println("Test Case Passed");
        }
        else
        {
            System.out.println("Test Case Failed");
        }
        driver.quit();
    }
}
