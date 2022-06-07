package app.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartOnEbay extends CommonAPI {


    @Test
    public void AddToCartOnEbay() {
        click("<use xlink:href=\"#icon-cart-new\"></use>");
        Thread.sleep(3000);
        String expectAddToCartOnEbay = "ebay.com :AddToCartOnEbay";
        Assert. assertEquals(expectedAddToCartOnEbay, actualAddToCartOnEbay());
    }
}
