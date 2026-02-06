package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    // Constructor
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By orderMessageField = By.xpath("//*[@id='ordermsg']/textarea");
    private By placeOrderButton = By.xpath("//*[@id='cart_items']/div/div[7]/a");

    // Actions
    public void enterOrderMessage(String message) {
        sendKeys(orderMessageField, message);
    }

    public void clickPlaceOrderButton() {
        click(placeOrderButton);
    }
}
