package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility
{
    By myAccount = By.xpath("//span[normalize-space()='My Account']");
    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By agree = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");


    /**
     * This method is used to click on any tab of my account dropdown
     */
    public void selectMyAccountOptions(String option) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(myAccount);
        clickOnElement(By.xpath("(//a[normalize-space()='" + option + "'])[1]"));
    }

    /**
     * get Register Account Text
     */
    public String getRegisterAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(registerAccount);
    }

    /**
     * fill all mandatoryFields
     */
    public void fillAllMandatoryField(){
        sendTextToElement(firstName,"Nenshi");
        sendTextToElement(lastName,"patel");
        sendTextToElement(email,"npatel199101.com");
        sendTextToElement(telephone,"07414888774");
        sendTextToElement(password,"abc12345");
        sendTextToElement(confirmPassword,"abc12345");

    }

    /**
     * select Subscribe Button
     */
    public void selectSubscribeButton(String vaule) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + vaule + "']"));
    }

    /**
     * click On Agree
     */
    public void clickOnAgree() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(agree);
    }

    /**
     * click On Continue
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * get Account CreatedText
     */
    public String getAccountCreatedText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountCreatedText);
    }
}
