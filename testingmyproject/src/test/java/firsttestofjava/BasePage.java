package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click on an element
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    // Method to send text to an element
    public void sendKeys(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // Method to find an element
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }
}
