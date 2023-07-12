package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LapTopAndNoteBooksTest extends BaseTest
{
    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        String exceptedMessage = laptopsAndNotebooksPage.beforeSortPriceHighToLow().toString();
        String actualMessage = laptopsAndNotebooksPage.afterSortPriceHighToLow().toString();
        Assert.assertEquals(exceptedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homePage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homePage.selectMenu(menuName);
        laptopsAndNotebooksPage.shotByFilter("Price (High > Low)");
        laptopsAndNotebooksPage.selectProduct("MacBook");

        //String expectedMessage = "MacBook";
        //String actualMessage = laptopsAndNotebooksPage.getMacBookText();
        Assert.assertEquals(laptopsAndNotebooksPage.getMacBookText(), "MacBook");

        laptopsAndNotebooksPage.clickOnAddToCart();
        String expectedMessage = "Success: You have added MacBook to your shopping cart!\n";
        String actualMessage = laptopsAndNotebooksPage.getSuccessText();
        String[] actualmsg = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualmsg[0]);

        laptopsAndNotebooksPage.clickOnShoppingCartLink();

        Assert.assertEquals(shoppingCartPage.getShoppingCartText(),"Shopping Cart  (0.00kg)");

        Assert.assertEquals(shoppingCartPage.getMacBookText(),"MacBook");

        laptopsAndNotebooksPage.changeQuantity();
        laptopsAndNotebooksPage.updateButton();

        String expectedText = "Success: You have modified your shopping cart!\n";
        String actualText = shoppingCartPage.getSuccessText();
        String[] actualmsg1 = actualText.split("×");
        Assert.assertEquals(expectedText, actualmsg1[0]);

        //expectedMessage = "$1,204.00";
        //actualMessage = shoppingCartPage.getMackBookPriceText();
        Assert.assertEquals(shoppingCartPage.getMackBookPriceText(), "$1,204.00");

        shoppingCartPage.clickOnCheckOutButton();

        //expectedMessage = "Checkout";
        //actualMessage = checkOutPage.getCheckOutText();
        Assert.assertEquals(checkOutPage.getCheckOutText(), "Checkout");

        //expectedMessage = "New Customer";
        //actualMessage = checkOutPage.getNewCustomerText();
        Assert.assertEquals(checkOutPage.getNewCustomerText(), "New Customer");

        checkOutPage.clickOnGuestCheckOut();

        checkOutPage.clickOnContinueButton();

        checkOutPage.checkOutField(); //fill all mandatory field

        checkOutPage.clickOnGuestContinue();

        checkOutPage.enterComments("My macBook");

        checkOutPage.clickOnAgree();

        Assert.assertEquals(checkOutPage.getPaymentWarningText(), "Warning: No Payment options are available. Please contact us for assistance!");
    }


}
