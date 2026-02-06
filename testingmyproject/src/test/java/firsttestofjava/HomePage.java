package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By loginButton = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a");

    // Actions
    public void clickLoginButton() {
        click(loginButton);
    }
}
