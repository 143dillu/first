package firsttestofjava;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyProject {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
      

        // Create instances of page objects
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        
        // Execute steps using page object methods
        homePage.clickLoginButton();
       
        loginPage.enterEmail("hdh@gmail.com");
       
        loginPage.enterPassword("143dillu");
     
        loginPage.clickLoginButton();
      
        

        productPage.clickCategoryButton();
     
        productPage.clickProductButton();
      
        productPage.clickProductItem();
       

        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
       
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[3]/button")).click();
      
        driver.findElement(By.xpath("//*[@id='cartModal']/div/div/div[3]")).click();
        

        // Add items to the cart and proceed to checkout
       driver.navigate().to("https://automationexercise.com/view_cart");
       
        cartPage.clickProceedToCheckout();
      

        checkoutPage.enterOrderMessage("I want my order  on time");
       
        checkoutPage.clickPlaceOrderButton();
       

        paymentPage.enterNameOnCard("YSR JAGAN");
      
        paymentPage.enterCardNumber("9455 8386 4068");
       
        paymentPage.enterCvc("970");
        
        paymentPage.enterExpiryMonth("12");
       
        paymentPage.enterExpiryYear("2029");
       
        paymentPage.clickPayButton();
     
        paymentPage.clickContinueButton();
      

        // Log out and quit
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}

