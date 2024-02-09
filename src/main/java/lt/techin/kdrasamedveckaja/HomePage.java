package lt.techin.kdrasamedveckaja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = "div#narbar-menu > ul > li:nth-of-type(1) > .nav-link")
    WebElement pressButtonQA;

    @FindBy(id = "button-list")
    WebElement clickButtonList;

    @FindBy(xpath = "//div[@id='product-list']/div[1]//h4/a")
    WebElement itemNameRaccoon;

    @FindBy(xpath = "//div[@id='product-list']/div[2]//h4/a")
    WebElement itemNameDebugDuck;

    @FindBy(xpath = "//div[@id='product-list']/div[3]//h4/a")
    WebElement itemNameGeniusDuck;

    @FindBy(xpath = "//div[@id='product-list']/div[4]//h4/a")
    WebElement itemNameCalmPills;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickQA() {
        pressButtonQA.click();
    }

    public void clickItemsListButton() {
        clickButtonList.click();
    }

    public String viewItemNameRaccoon() {
        return itemNameRaccoon.getText();
    }

    public String viewItemNameDebugDuck() {
        return itemNameDebugDuck.getText();
    }

    public String viewItemNameGeniusDuck() {
        return itemNameGeniusDuck.getText();
    }

    public String viewItemNameCalmPills() {
        return itemNameCalmPills.getText();
    }
}
