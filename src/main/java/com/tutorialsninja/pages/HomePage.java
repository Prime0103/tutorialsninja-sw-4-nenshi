package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility
{
    By currency = By.xpath("//span[contains(text(),'Currency')]");

    By desktop = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Desktops']");
    By desktopText = By.xpath("//h2[normalize-space()='Desktops']");
    By allLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By component = By.xpath("//a[normalize-space()='Components']");
    By componentText = By.xpath("//h2[normalize-space()='Components']");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");

    /**
     * change the currency
     */
    public void changeCurrency(){
        clickOnElement(currency);
    }

    /**
     * This method is used to select menu
     */
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//nav[@id='menu']//a[normalize-space()='" + menu + "']"));
    }

    /**
     * This method is used to mouse Hover And Click On Desktop
     */
    public void mouseHoverAndClickOnDesktop() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(desktop);

    }
    /**
     * This method is used to get Desktop Text
     */
    public String getDesktopText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(desktopText);
    }

    /**
     * This method is used to mouse Hover Click On Laptop And NoteBooks
     */
    public void mouseHoverAndClickOnLaptopAndNoteBooks() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(allLaptopsAndNotebooks);
    }
    /**
     * get Laptops And Notebooks Text
     */
    public String getLaptopsAndNotebooksText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(allLaptopsAndNotebooks);
    }



    /**
     * mouseHover And Click On Component
     */
    public void mouseHoverAndClickOnComponent() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(component);
    }

    /**
     * This method is used to get component text
     */
    public String getComponentText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(componentText);
    }

    /**
     * get Account Logout Text
     */
    public String getAccountLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(accountLogout);
    }

    /**
     * get My Account Text
     */
    public String getMyAccountText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(myAccount);
    }
}
