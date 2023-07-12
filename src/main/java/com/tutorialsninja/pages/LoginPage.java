package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By returningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By emailId = By.xpath("//input[@id='input-email']");
    By password = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");

    /**
     * get Returning Customer Text
     */
    public String getReturningCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(returningCustomer);
    }

    /**
     * enter EmailId
     */
    public void enterEmailId(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(emailId, value);
    }

    /**
     * enter Password
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(password, value);
    }

    /**
     * click On Login
     */
    public void clickOnLogin() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(loginButton);
    }

}
