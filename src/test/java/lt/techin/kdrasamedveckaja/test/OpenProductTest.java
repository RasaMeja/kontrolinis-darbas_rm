package lt.techin.kdrasamedveckaja.test;

import lt.techin.kdrasamedveckaja.HomePage;
import lt.techin.kdrasamedveckaja.OpenProductPage;
import org.junit.jupiter.api.Test;

public class OpenProductTest extends BaseTest{

    HomePage homePage;
    OpenProductPage openProductPage;

    @Test
    void testOpenProduct() {
        homePage = new HomePage(driver);
        openProductPage = new OpenProductPage(driver);
        homePage.clickQA();
        homePage.clickItemsListButton();
        openProductPage.openProduct();
    }

    @Test
    void testChangeQuantity() {
        homePage = new HomePage(driver);
        openProductPage = new OpenProductPage(driver);
        homePage.clickQA();
        homePage.clickItemsListButton();
        openProductPage.openProduct();
        openProductPage.clearQuantity();
        openProductPage.setQuantity(9);
    }
}
