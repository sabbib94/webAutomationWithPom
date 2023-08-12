package com.parabank.parasoft.testcase;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.RegisterPage;
import com.parabank.parasoft.util.ParaBankString;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test(enabled = false)
    public void registerWithoutCredentialShouldFail(){
        RegisterPage registerPage=page.getInstance(RegisterPage.class)
                .registerWithoutCredential();
        Assert.assertTrue(registerPage.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutFirstnameShouldFail(){
        RegisterPage registerPage=page.getInstance(RegisterPage.class)
                .registerWithoutFirstName(getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerPage.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutLastnameShouldFail(){
        RegisterPage registerPage=page.getInstance(RegisterPage.class)
                .registerWithoutLastName(getFirstname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerPage.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutAddressShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutAddress(getFirstname(),getLastname(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutCityShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutCity(getFirstname(),getLastname(),getAddress(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutStateShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutState(getFirstname(),getLastname(),getAddress(),getCity(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutZipcodeShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutZipCode(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutPhoneShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutPhone(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutSsnShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutSsn(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutUsernameShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutUsername(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getPassword(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutPasswordShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutPassword(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getConformPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test(enabled = false)
    public void registerWithoutConfirmPasswordShouldFail(){
        RegisterPage registerTest=page.getInstance(RegisterPage.class)
                .registerWithoutConfirmPassword(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword());
        Assert.assertTrue(registerTest.hasRegisterError());
    }

    @Test
    public void registerWithAllInfoShouldPass(){
        HomePage homePage=page.getInstance(RegisterPage.class)
                .registerWithAllCredentialElement(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getPhone(),getSsn(),getUsername(),getPassword(),getConformPassword());
        Assert.assertTrue(homePage.hasLogoutLink());
    }
}
