package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class MyProject1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        // Initialize the page classes
        URLDetailsPage urlPage = new URLDetailsPage(driver);
        WebElementsPage elementsPage = new WebElementsPage(driver);

        // Open the home page
        urlPage.openHomePage();

        // Navigate to login page and login
        urlPage.navigateToLoginPage();
        elementsPage.login("hdh@gmail.com", "143dillu");

        // Navigate to product page, add product to cart and proceed to checkout
        urlPage.navigateToProductPage();
        elementsPage.addProductToCart();
        urlPage.navigateToCartPage();
        elementsPage.proceedToCheckout();

        // Enter payment details
        elementsPage.enterPaymentDetails("YSR JAGAN", "9455 8386 4068", "970", "12", "2029");

        // Continue after payment and log out
        driver.findElement(By.cssSelector("a[data-qa='continue-button']")).click();
        elementsPage.logout();

        // Quit the driver
        driver.quit();
    }
}
