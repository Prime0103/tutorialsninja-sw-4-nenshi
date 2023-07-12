package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest
{
    HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        String menuName = "Show AllDesktops";
        homepage.mouseHoverAndClickOnDesktop();
        homepage.selectMenu(menuName);
        String expectedMessage = "Desktops";
        String actualMessage = homepage.getDesktopText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllLaptops & Notebooks";
        homepage.mouseHoverAndClickOnLaptopAndNoteBooks();
        homepage.selectMenu(menuName);
        String expectedText = "Laptops & Notebooks";
        String actualText = homepage.getLaptopsAndNotebooksText();
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {
        String menuName = "Show AllComponents";
        homepage.mouseHoverAndClickOnComponent();
        homepage.selectMenu(menuName);
        String expectedMessage = "Components";
        String actualMessage = homepage.getComponentText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
