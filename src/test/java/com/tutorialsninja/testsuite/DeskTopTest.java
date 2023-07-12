package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeskTopTest extends BaseTest
{
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        String menuName = "Show AllDesktops";
        homePage.mouseHoverAndClickOnDesktop();
        homePage.selectMenu(menuName);
        String excepted = desktopPage.beforeSortDesktopByPositionZtoA().toString();
        String actual = desktopPage.afterSortDesktopByPositionZtoA().toString();
        Assert.assertTrue(excepted.contains(actual));

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{
        homePage.changeCurrency();

        String menuName = "Show AllDesktops";
        homePage.mouseHoverAndClickOnDesktop();

        homePage.selectMenu(menuName);
        desktopPage.selectShortByPositionDropdownValue("Name (A - Z)");
        desktopPage.selectProductFromList("HP LP3065");

        String expectedMessage = "HP LP3065";
        String actualMessage = desktopPage.getTextOfProduct();
        Assert.assertEquals(expectedMessage, actualMessage);
        desktopPage.selectDate("30", "November", "2022");
        desktopPage.clickOnAddToCart();

        String expectedSuccessText = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(desktopPage.getSuccessfullText(), expectedSuccessText, "Success message is not displayed");
        Thread.sleep(1000);


        desktopPage.clickOnShoppingCartLink();
        //String expectedtext = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(shoppingCartPage.getShoppingCartText(), "Shopping Cart  (1.00kg)");

        String expectedMessage1 = "HP LP3065";
        String actualMessage1 = shoppingCartPage.getProductText();
        Assert.assertEquals(shoppingCartPage.getProductText(), "HP LP3065");

        Assert.assertEquals(shoppingCartPage.getDeliveryDateText(),"Delivery Date:2022-11-30","Delivery date not displayed");

        //String expectedMessage2 = "Product 21";
        //String actualMessage2 = shoppingCartPage.getModelText();
        Assert.assertEquals(shoppingCartPage.getModelText(), "Product 21");

        //String expectedPrice = "$122.00";
        //String actualPrice = shoppingCartPage.getPriceText();
        Assert.assertEquals(shoppingCartPage.getPriceText(),"$122.00");

    }
}
