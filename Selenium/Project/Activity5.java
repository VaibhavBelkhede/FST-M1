import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Activity5 {
    public static void main (String[] arg)
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        String ExpTitle="Jobs – Alchemy Jobs";

        if (driver.getTitle().equals(ExpTitle))
        {
            System.out.println("Activity5 Passed");
        }
        else
        {
            System.out.println("Activity5 Failed");
        }
        driver.quit();
    }
}
