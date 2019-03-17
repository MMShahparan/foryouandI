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
        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/UltaBeauty/']")).click();
        //driver.findElement(By.xpath("//a[@class='fb-icon pop-over-social']//span[text()='Ulta Beauty on Facebook']")).click();

    }
    @Test
    public void faceBook(){
//        driver.findElement(By.id("#searchinput")).click();
        //testing

    }

    @Test
    public void test3(){
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Test
    public void statement(){
        System.out.println("Hey its sylvana in testui");
    }

    //trying to add something to master
//llalaaaa

    //heloo oonljijiojoijilkjlojlojlojkiojerihehrhiehrhjufrhjireihjlijhiru
    //adding blah blah blah
    //please merge to juwel's

    //Shahparan making comment

    //Shahparan making comment in shahparan branch
}
