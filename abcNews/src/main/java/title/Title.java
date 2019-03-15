package title;

import baseClass.BaseClient;

public class Title extends BaseClient {




    public void seeTitle(){
        System.out.println(driver.getTitle());
    }

    public void getUrl(){
        System.out.println(driver.getCurrentUrl());
    }
}
