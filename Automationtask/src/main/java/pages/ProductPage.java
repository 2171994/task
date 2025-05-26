package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By sizeM = By.id("option-label-size-143-item-168");
    By colorBlack = By.id("option-label-color-93-item-49");
    By addToCart = By.id("product-addtocart-button");
    By confirmation = By.cssSelector(".message-success");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSize() {
        driver.findElement(sizeM).click();
    }

    public void selectColor() {
        driver.findElement(colorBlack).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public boolean verifyAddToCartMessage() {
        return driver.findElement(confirmation).isDisplayed();
    }
}
