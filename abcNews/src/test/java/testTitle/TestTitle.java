package testTitle;

import baseClass.BaseClient;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestTitle  extends BaseClient {

    @Test
    public void test(){


    }
    @Test
    public void test1(){
        driver.findElement(By.xpath("//*[@id='canada']//a[contains(@href,'facebook')]")).click();
        //driver.findElement(By.xpath("//a[@class='fb-icon pop-over-social']//span[text()='Ulta Beauty on Facebook']")).click();

    }
    @Test
    public void faceBook(){
//        driver.findElement(By.id("#searchinput")).click();

    }
}
