import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main (String[] arg)
    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs");
        String ActualValue=driver.findElement(By.xpath("//h2")).getText();
        String ExpectedValue="Quia quis non";
        if (ActualValue.equals(ExpectedValue))
        {
            System.out.println("Activity4 Passed");
        }
        else
        {
            System.out.println("Activity4 Failed");
        }
        driver.quit();
    }

}
