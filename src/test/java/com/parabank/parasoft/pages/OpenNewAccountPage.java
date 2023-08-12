package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BasePage{
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectCheckingAccountType(int index) {
        General.waitForDomStable();
        new Select(getWebElement(By.id("type"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectSavingAccountType(int index) {
        General.waitForDomStable();
        new Select(getWebElement(By.id("type"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectExistingAccountType(int index) {
        General.waitForDomStable();
        new Select(getWebElement(By.id("fromAccountId"))).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage clickOpenAccountBtn() {
        getWebElement(By.cssSelector("input[type='submit']")).click();
        return this;
    }

    public OpenNewAccountPage clickOpenAccountBtnFail() {
        getWebElement(By.cssSelector("input[type='submit']")).click();
        return this;
    }

    public boolean hasAccountId() {
        return getWebElements(By.cssSelector("a[class='ng-binding']")).size() > 0;
    }
}
