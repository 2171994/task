package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By heroHoodie = By.xpath("//a[contains(text(),'Hero Hoodie')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHeroHoodie() {
        driver.findElement(heroHoodie).click();
    }
}
