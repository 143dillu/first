package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementsPage {

    WebDriver driver;

    public WebElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Login functionality
    public void login(String email, String password) {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    // Add product to the cart
    public void addProductToCart() {
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
    }

    // Proceed to checkout
    public void proceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
    }

    // Enter payment details and complete the checkout
    public void enterPaymentDetails(String name, String cardNumber, String cvc, String expiryMonth, String expiryYear) {
        driver.findElement(By.name("name_on_card")).sendKeys(name);
        driver.findElement(By.name("card_number")).sendKeys(cardNumber);
        driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys(cvc);
        driver.findElement(By.name("expiry_month")).sendKeys(expiryMonth);
        driver.findElement(By.name("expiry_year")).sendKeys(expiryYear);
        driver.findElement(By.cssSelector("button[data-qa='pay-button']")).click();
    }

    // Logout
    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    // Adding a product review
    public void addProductReview(String name, String email, String review) {
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(name);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys(review);
        driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
    }
}
