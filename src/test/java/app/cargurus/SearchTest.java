package app.aliexpress;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {
    @Test
    public void search(){
        typeAndEnter("#search-key","watches");
        String expectedPageTitle = "watches - Buy watches with free shipping on AliExpress";
        Assert.assertEquals(expectedPageTitle, getPageTitle());
        click("//h1[@class='_18_85']/../../../..");
        String expectedText = "VANA Trade";
        String text = getElementText("//a[text()='VANA Trade']/../../../../../../../../../../../..");
        Assert.assertEquals( expectedText, text);
        click("//button[@class='next-btn next-large next-btn-primary addcart']");
        String expectedText1 = "A new item has been added to your Shopping Cart. You now have 1 items in your Shopping Cart.";
        String text1 = getElementText("//div{@class='addcart-result-title']");
        Assert.assertEquals( expectedText1, text1);
    }
}
