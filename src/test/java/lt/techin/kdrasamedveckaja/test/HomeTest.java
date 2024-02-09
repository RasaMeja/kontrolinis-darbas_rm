package lt.techin.kdrasamedveckaja.test;

import lt.techin.kdrasamedveckaja.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest{

    @Test
    void testClickQA() {
        HomePage homePage = new HomePage(driver);
        homePage.clickQA();
    }

    @Test
    void testClickItemsListButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickQA();
        homePage.clickItemsListButton();
        Assertions.assertEquals("Code Confusion Raccoon", homePage.viewItemNameRaccoon());
        System.out.println("Product name is: " + homePage.viewItemNameRaccoon());
        Assertions.assertEquals("Debug Duck", homePage.viewItemNameDebugDuck());
        System.out.println("Product name is: " + homePage.viewItemNameDebugDuck());
        Assertions.assertEquals("Java Genius Duck", homePage.viewItemNameGeniusDuck());
        System.out.println("Product name is: " + homePage.viewItemNameGeniusDuck());
        Assertions.assertEquals("Code Calm pills", homePage.viewItemNameCalmPills());
        System.out.println("Product name is: " + homePage.viewItemNameCalmPills());
    }
}
