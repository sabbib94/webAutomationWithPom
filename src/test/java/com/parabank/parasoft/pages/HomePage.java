package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver){
        super(driver);
    }

    public OpenNewAccountPage clickOpenAccountLink() {
        getWebElement(By.linkText("Open New Account")).click();
        return getInstance(OpenNewAccountPage.class);
    }
    public  boolean hasLogoutLink(){
        return getWebElements(By.linkText("Log Out")).size()>0;
    }
}
