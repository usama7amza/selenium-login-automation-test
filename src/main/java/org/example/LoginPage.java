package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomeBase{
    public LoginPage (WebDriver driver){
        super(driver);
    }
//    find locator to  sign in button
    By signinFelid = By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[7]/button");
//    method to  click on sign in button
    public void clickOnSigninFelid (){
        driver.findElement(signinFelid).click();
    }
//    find locator to username filed
    By userNameFiled = By.xpath("//*[@id=\"fname\"]");
//    find locator to pass filed
    By passwordFiled = By.xpath("//*[@id=\"fname\"]");

//    method to inter username and password
    public void enterUserName(String username){
        driver.findElement(userNameFiled).sendKeys(username);
    }
    public void enterPassword (String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }

//    find locator to sign in button
    By signinButton = By.xpath("//*[@id=\"home\"]/form/div/div[4]/button");
    //    method to  click on sign in button to sign-into account
    public void ClickSingIntoAccount (){
        driver.findElement(signinButton).click();
    }

}
