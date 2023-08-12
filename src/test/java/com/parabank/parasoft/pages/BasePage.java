package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page{

    public BasePage(WebDriver driver){
        super(driver);
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement=null;
        try{
            webElement= driver.findElement(locator);
        }catch(Exception exception){
            System.out.println("This WebElement issue "+locator.toString());
        }
        return webElement;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> webElements=null;
        try{
            webElements= driver.findElements(locator);
        }catch(Exception exception){
            System.out.println("This WebElement issue "+locator.toString());
        }
        return webElements;
    }

    @Override
    public void waitForTitle(String pageTitle) {
        try{
            wait.until(ExpectedConditions.titleContains(pageTitle));
        }catch(Exception exception){
            System.out.println("Wait Page Tittle Loading issue ");
        }
    }

    @Override
    public void waitForWebElement(By locator) {
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }catch(Exception exception){
            System.out.println("Wait Page Tittle Loading issue ");
        }
    }
}
