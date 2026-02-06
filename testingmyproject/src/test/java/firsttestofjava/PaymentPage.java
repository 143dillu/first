package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {

    // Constructor
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By nameOnCardField = By.name("name_on_card");
    private By cardNumberField = By.name("card_number");
    private By cvcField = By.xpath("//*[@id='payment-form']/div[3]/div[1]/input");
    private By expiryMonthField = By.name("expiry_month");
    private By expiryYearField = By.name("expiry_year");
    private By payButton = By.cssSelector("button[data-qa='pay-button']");
    private By continueButton = By.cssSelector("a[data-qa='continue-button']");

    // Actions
    public void enterNameOnCard(String name) {
        sendKeys(nameOnCardField, name);
    }

    public void enterCardNumber(String cardNumber) {
        sendKeys(cardNumberField, cardNumber);
    }

    public void enterCvc(String cvc) {
        sendKeys(cvcField, cvc);
    }

    public void enterExpiryMonth(String month) {
        sendKeys(expiryMonthField, month);
    }

    public void enterExpiryYear(String year) {
        sendKeys(expiryYearField, year);
    }

    public void clickPayButton() {
        click(payButton);
    }

    public void clickContinueButton() {
        click(continueButton);
    }
}

