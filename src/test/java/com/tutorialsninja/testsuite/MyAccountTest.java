package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class MyAccountTest extends BaseTest
{
    String email;
    MyAccountPage myAccountPage = new MyAccountPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Register Account";
        String actualMessage = myAccountPage.getRegisterAccountText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        String expectedMessage = "Returning Customer";
        String actualMessage = loginPage.getReturningCustomerText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();

        String option = "Register";
        myAccountPage.selectMyAccountOptions(option);
        myAccountPage.fillAllMandatoryField();
        myAccountPage.selectSubscribeButton("Yes");

        myAccountPage.clickOnAgree();

        myAccountPage.clickOnContinue();

        String expectedText = "Your Account Has Been Created!";
        String actualText =myAccountPage.getAccountCreatedText();
        Assert.assertEquals(expectedText, actualText);
        option = "Logout";

        myAccountPage.selectMyAccountOptions(option);

        //expectedMessage = "Account Logout";
        //actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(homePage.getAccountLogoutText(), "Account Logout");

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        String option = "Login";
        myAccountPage.selectMyAccountOptions(option);
        loginPage.enterEmailId("npatel199101@gmail.com");
        loginPage.enterPassword("abc12345");
        loginPage.clickOnLogin();

        //String expectedMessage = "My Account";
        //String actualMessage = homePage.getMyAccountText();
        Assert.assertEquals(homePage.getMyAccountText(), "My Account");

        option = "Logout";
        myAccountPage.selectMyAccountOptions(option);

        //expectedMessage = "Account Logout";
        //actualMessage = homePage.getAccountLogoutText();
        Assert.assertEquals(homePage.getAccountLogoutText(), "Account Logout");
    }

}
