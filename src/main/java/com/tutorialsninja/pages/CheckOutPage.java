package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility
{
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@name='agree']");
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");
    By guestContinueButton = By.xpath("//input[@id='button-guest']");

    /**
     * This method is used to get Check Out Text
     */
    public String getCheckOutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(checkOutText);
    }

    /**
     * This method is used to get New Customer Text
     */
    public String getNewCustomerText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(newCustomerText);
    }

    /**
     * This method is used click on Guest Checkout Button
     */
    public void clickOnGuestCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestCheckOut);
    }

    /**
     * This method is used click on  Checkout Button
     */
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * fill all mandatoryFields
     */
    public void checkOutField(){
        sendTextToElement(firstName,"khushi");
        sendTextToElement(lastName,"patel");
        sendTextToElement(email,"abc123@gmail.com");
        sendTextToElement(telephone,"07866445533");
        sendTextToElement(address1,"london Road");
        sendTextToElement(city,"London");
        sendTextToElement(postcode,"sw2 4rt");
        selectByVisibleTextFromDropDown(country,"Australia");
        selectByVisibleTextFromDropDown(region,"Queensland");
    }

    /**
     * click on Guest Continue
     */
    public void clickOnGuestContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(guestContinueButton);
    }

    /**
     * Enter Comment
     */
    public void enterComments(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(comments, value);
    }

    /**
     * This method is used to click agree
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }

    /**
     * This method is used to get payment warring message
     */
    public String getPaymentWarningText() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(warningText);
    }
}
