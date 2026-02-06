package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class URLDetailsPage {

    WebDriver driver;

    public URLDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to the homepage
    public void openHomePage() {
        driver.get("https://automationexercise.com");
    }

    // Navigate to the login page
    public void navigateToLoginPage() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    // Navigate to the product page
    public void navigateToProductPage() {
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
    }

    // Navigate to cart page
    public void navigateToCartPage() {
        driver.navigate().to("https://automationexercise.com/view_cart");
    }
}

