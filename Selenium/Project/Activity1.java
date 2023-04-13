import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1
{
     public static void main(String[] args)
     {
          WebDriverManager.firefoxdriver().setup();

          WebDriver driver = new FirefoxDriver();

          driver.get("https://alchemy.hguy.co/jobs");
          String ExpTitle="Alchemy Jobs – Job Board Application";

          if (driver.getTitle().equals(ExpTitle))
          {
              System.out.println("Activity1 Passed");
          }
            else
          {
              System.out.println("Activity41 Failed");
          }

          driver.quit();
     }

}