package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests extends CommonAPI {

    @Test
    public void addItemsToCart(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()=\"MSNBC Store\"]");
        click("div[class='grid-product__color-image grid-product__color-image--39517818290330 small--hide']");
        click("button[class='btn btn--full add-to-cart']");
        waitFor(1);
        click("button[class='btn btn--full cart__checkout']");
        waitFor(1);
        Assert.assertEquals("Information - NBC Store - Checkout",getPageTitle());
        //ask nacer about the wait times and why the page title shows different if no wait time. what can be done?
    }
}
