package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    // Constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By proceedToCheckoutButton = By.xpath("//*[@id='do_action']/div[1]/div/div/a");

    // Actions
    public void clickProceedToCheckout() {
        click(proceedToCheckoutButton);
    }
}
