package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void addHeroHoodieToCartTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.clickHeroHoodie();

        ProductPage product = new ProductPage(driver);
        product.selectSize();
        product.selectColor();
        product.clickAddToCart();

        Thread.sleep(2000); // wait for message
        Assert.assertTrue(product.verifyAddToCartMessage(), "Add to cart message not displayed");
    }
}
