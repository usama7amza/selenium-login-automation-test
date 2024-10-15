package org.example;

import org.openqa.selenium.WebDriver;

public class HomeBase {
//    properties
    protected WebDriver driver ;

//    instructor
    public HomeBase (WebDriver driver){
        this.driver = driver ;
    }
    public void getUrl(String url){
        driver.get(url);
    }
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
