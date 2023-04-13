import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main (String[] arg)
    {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://alchemy.hguy.co/jobs");
       String src = driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']/img")).getAttribute("src");
        System.out.println("The url of the header image is "+src);
        driver.quit();


    //div[@class='post-thumb-img-content post-thumb']/img
}   }
