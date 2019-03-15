package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClient {

    public WebDriver driver = null;


    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/jewal/IntelliJ/farpractice10/Base/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.ulta.com/");
    }
    @AfterMethod
    public void ceanUp(){
        driver.close();
    }
}
