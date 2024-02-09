package lt.techin.kdrasamedveckaja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BasePage{

    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement buttonAddProduct;

    @FindBy(xpath = "//*[@id=\"alert\"]/div")
    WebElement message;

    @FindBy(xpath = "//div[@id='alert']//button[@type='button']")
    WebElement clickInputClose;


    @FindBy(xpath = "//div[@id='header-cart']//button[@type='button']")
    WebElement inputItem;

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart() {
        buttonAddProduct.click();
    }

    public String viewMessage() {
        return message.getText();
    }

    public void clickClose() {
        clickInputClose.click();
    }

    public void checkQuantityNamePrice() {
        inputItem.click();
    }
}
