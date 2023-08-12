package com.parabank.parasoft.testcase;

import com.parabank.parasoft.pages.OpenNewAccountPage;
import com.parabank.parasoft.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest{
    @Test
    public void openCheckingAccountShouldSucceed() {
        OpenNewAccountPage openNewAccountPage = page.getInstance(RegisterPage.class)
                .registerWithAllCredentialElement(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getSsn(),getPhone(),getUsername(),getPassword(),getConformPassword())
                .clickOpenAccountLink()
                .selectCheckingAccountType(0)
                .selectExistingAccountType(0)
                .clickOpenAccountBtn();
        Assert.assertTrue(openNewAccountPage.hasAccountId());
    }
    @Test
    public void openSavingAccountShouldSucceed() {
        OpenNewAccountPage openNewAccountPage = page.getInstance(RegisterPage.class)
                .registerWithAllCredentialElement(getFirstname(),getLastname(),getAddress(),getCity(),getState(),getZipcode(),getSsn(),getPhone(),getUsername(),getPassword(),getConformPassword())
                .clickOpenAccountLink()
                .selectSavingAccountType(1)
                .selectExistingAccountType(0)
                .clickOpenAccountBtn();
        Assert.assertTrue(openNewAccountPage.hasAccountId());
    }

}
