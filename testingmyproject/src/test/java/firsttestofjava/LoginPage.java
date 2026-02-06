package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By emailField = By.xpath("//input[@data-qa='login-email']");
    private By passwordField = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");

    // Actions
    public void enterEmail(String email) {
        sendKeys(emailField, email);
    }

    public void enterPassword(String password) {
        sendKeys(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
