package com.parabank.parasoft.pages;

import com.parabank.parasoft.util.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

     public RegisterPage(WebDriver driver){ super(driver); }

    public RegisterPage fillFirstname(String firstname){
        General.waitForDomStable();
        getWebElement(By.id("customer.firstName")).sendKeys(firstname);
        return this;
    }

    public RegisterPage fillLastname(String lastname){
        General.waitForDomStable();
        getWebElement(By.id("customer.lastName")).sendKeys(lastname);
        return this;
    }

    public RegisterPage fillAddress(String address){
        General.waitForDomStable();
        getWebElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    public RegisterPage fillCity(String city){
        General.waitForDomStable();
        getWebElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    public RegisterPage fillState(String state){
        General.waitForDomStable();
        getWebElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    public RegisterPage fillZipCode(String zipCode){
        General.waitForDomStable();
        getWebElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillPhone(String phone){
        General.waitForDomStable();
        getWebElement(By.id("customer.phoneNumber")).sendKeys(phone);
        return this;
    }

    public RegisterPage fillSnn(String ssn){
        General.waitForDomStable();
        getWebElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    public RegisterPage fillUsername(String username) {
        General.waitForDomStable();
        getWebElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    public RegisterPage fillPassword(String password){
        General.waitForDomStable();
        getWebElement(By.id("customer.password")).sendKeys(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword){
        General.waitForDomStable();
        getWebElement(By.id("repeatedPassword")).sendKeys(confirmPassword);
        return this;
    }

    public HomePage clickRegisterBtn(){
        General.waitForDomStable();
        getWebElement(By.cssSelector("input[value='Register']")).click();
        return getInstance(HomePage.class);
    }

    public RegisterPage clickRegisterBtnFail(){
        General.waitForDomStable();
        getWebElement(By.cssSelector("input[value='Register']")).click();
        return this;
    }

    public RegisterPage registerWithoutCredential(){
        return clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutFirstName(String lastName,String address,String city,String state,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutLastName(String firstname,String address,String city,String state,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstname)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutAddress(String firstName,String lastName,String city,String state,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutCity(String firstName,String lastName,String address,String state,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutState(String firstName,String lastName,String address,String city,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillState(city)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutZipCode(String firstName,String lastName,String address,String city,String state,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutPhone(String firstName,String lastName,String address,String city,String state,String zipCode,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillPhone(zipCode)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutSsn(String firstName,String lastName,String address,String city,String state,String zipCode,String phone,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutUsername(String firstName,String lastName,String address,String city,String state,String zipCode,String phone,String ssn,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutPassword(String firstName,String lastName,String address,String city,String state,String zipCode,String phone,String ssn,String username,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillPassword(username)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtnFail();
    }

    public RegisterPage registerWithoutConfirmPassword(String firstName,String lastName,String address,String city,String state,String zipCode,String phone,String ssn,String username,String password){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .clickRegisterBtnFail();
    }

    public HomePage registerWithAllCredentialElement(String firstName,String lastName,String address,String city,String state,String zipCode,String phone,String ssn,String username,String password,String confirmPassword){
        return fillFirstname(firstName)
                .fillLastname(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .fillZipCode(zipCode)
                .fillPhone(phone)
                .fillSnn(ssn)
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirmPassword(confirmPassword)
                .clickRegisterBtn();
    }

    public boolean hasRegisterError(){
        return getWebElements(By.cssSelector("span[id*='error']")).size()>0;
    }
}
