import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Activity7 {
    public static void main (String[] arg) throws InterruptedException {
        String JobTitle="TestingABC";
        String expTitle;
        String Company="MyIBMABC";
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        driver.findElement(By.id("job_title")).sendKeys(JobTitle);
        driver.findElement(By.id("job_location")).sendKeys("India");
        driver.findElement(By.xpath("//select[@id='job_type']/option[contains(text(),'Full Time')]")).click();
        driver.findElement(By.xpath("//div[@id='mceu_16']/iframe")).click();
        driver.findElement(By.xpath("//div[@id='mceu_16']/iframe")).sendKeys("Testing Job");
        driver.findElement(By.id("company_name")).clear();

        driver.findElement(By.id("company_name")).sendKeys(Company);
        driver.findElement(By.xpath("//input[@name='submit_job']")).click();
        driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
        driver.findElement(By.xpath("//li[@id='menu-item-24']/a")).click();
        driver.findElement(By.id("search_keywords")).sendKeys(JobTitle);
        driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
        driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]")).click();
        expTitle=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        if (JobTitle.equals(expTitle))
        {
            System.out.println("Activity7 Passed");
        }
        else
        {
            System.out.println("Activity7 Failed");
        }
        driver.quit();
        /*driver.findElement(By.id("company_website")).sendKeys("ABC@testing.com");
        driver.findElement(By.id("company_tagline")).sendKeys("Testing");*/




    }
}
