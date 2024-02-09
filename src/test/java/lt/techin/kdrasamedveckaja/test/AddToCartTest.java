package lt.techin.kdrasamedveckaja.test;

import lt.techin.kdrasamedveckaja.AddToCartPage;
import lt.techin.kdrasamedveckaja.HomePage;
import lt.techin.kdrasamedveckaja.OpenProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddToCartTest extends BaseTest{
    HomePage homePage;
    OpenProductPage openProductPage;
    AddToCartPage addToCartPage;

    @Test
    void testAddToCartAndMessage() {
        homePage = new HomePage(driver);
        openProductPage = new OpenProductPage(driver);
        addToCartPage = new AddToCartPage(driver);
        homePage.clickQA();
        homePage.clickItemsListButton();
        openProductPage.openProduct();
        openProductPage.clearQuantity();
        openProductPage.setQuantity(9);
        addToCartPage.addProductToCart();
        Assertions.assertEquals("Success: You have added Code Confusion Raccoon to your shopping cart!", addToCartPage.viewMessage());
        System.out.println("Message: " + addToCartPage.viewMessage());
    }

    @Test
    void testAddItemToCart() {
        homePage = new HomePage(driver);
        openProductPage = new OpenProductPage(driver);
        addToCartPage = new AddToCartPage(driver);
        homePage.clickQA();
        homePage.clickItemsListButton();
        openProductPage.openProduct();
        openProductPage.clearQuantity();
        openProductPage.setQuantity(9);
        addToCartPage.addProductToCart();
        addToCartPage.clickClose();
        addToCartPage.checkQuantityNamePrice();
    }
}
