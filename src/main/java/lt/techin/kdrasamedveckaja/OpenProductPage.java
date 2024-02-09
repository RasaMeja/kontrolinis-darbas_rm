package lt.techin.kdrasamedveckaja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenProductPage extends BasePage{

    @FindBy(xpath = "//div[@id='product-list']/div[1]//h4/a")
    WebElement itemNameRaccoon;

    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement numberQty;

    public OpenProductPage(WebDriver driver) {
        super(driver);
    }

    public void openProduct() {
        itemNameRaccoon.click();
    }

    public void clearQuantity() {
        numberQty.clear();
    }

    public void setQuantity(int number) {
        numberQty.sendKeys(number + "");
    }
}
