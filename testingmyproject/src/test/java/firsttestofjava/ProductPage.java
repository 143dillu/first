package firsttestofjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    // Constructor
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    private By categoryButton = By.xpath("//*[@id='accordian']/div[2]/div[1]/h4/a");
    private By productButton = By.xpath("//*[@id='Men']/div/ul/li[1]/a");
    private By productItem = By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a");

    // Actions
    public void clickCategoryButton() {
        click(categoryButton);
    }

    public void clickProductButton() {
        click(productButton);
    }

    public void clickProductItem() {
        click(productItem);
    }
}

