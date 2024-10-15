package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends HomeBase {
//    instructor
    public AccountPage(WebDriver driver){
        super(driver);
    }
    // Locators for the logout dropdown and button

    By userIcon = By.xpath("//*[@id=\"navbarDropdown\"]/div[1]/img");// Dropdown icon (user profile icon)
    By logoutButton = By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[7]/div/a[8]"); // Logout button
    // Method to log out of the account
    public void clickLogoutButton(){
        // Click on user icon (to open dropdown menu)
        driver.findElement(userIcon).click();
        // Click on the logout button
        driver.findElement(logoutButton).click();
    }
    
}

