package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility
{
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productText = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By deliveryDateText = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");
    By modelText = By.xpath("//td[normalize-space()='Product 21']");
    By priceText = By.xpath("(//td[@class='text-right'][normalize-space()='$122.00'])[4]");
    By successText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By macBookText = By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By macBookPriceText = By.xpath("(//td[@class='text-right'][normalize-space()='$1,204.00'])[3]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");

    /**
     * get Shopping Cart Text
     */
    public String getShoppingCartText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get Product Text
     */
    public String getProductText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(productText);
    }

    /**
     * get ModelText
     */
    public String getModelText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(modelText);
    }

    /**
     * get Delivery Date Text
     */
    public String getDeliveryDateText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(deliveryDateText);
    }

    /**
     * get Price Text
     */
    public String getPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    /**
     * get Success Text
     */
    public String getSuccessText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successText);
    }

    /**
     * get MackBook Text
     */
    public String getMacBookText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(macBookText);
    }

    /**
     * get MackBook PriceText
     */
    public String getMackBookPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(macBookPriceText);
    }

    /**
     * click OnCheck OutButton
     */
    public void clickOnCheckOutButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }

}
