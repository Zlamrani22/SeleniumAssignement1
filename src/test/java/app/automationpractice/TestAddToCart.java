package app.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestAddToCart extends CommonAPI {

    @Test
    public void testAddItemsToCart() {
        hoverOver("//*[@id='block_top_menu']/ul/li[2]/a");
        click("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a");
        click("input[id='layered_id_attribute_group_1'");//checks the box for 'S' size
        click("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
        click("//span[text()='Add to cart']");

        String actualMessage = driver.findElement(By.xpath("//*[text()[contains(.,'Product successfully added to your shopping cart')]]")).getText();
        String expectedMessage = "Product successfully added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testAddToWishListWithoutLoggingIn() {
        click("//*[@id='htmlcontent_home']/ul/li[3]/a/img");
        click("//*[@id='homefeatured']/li[4]/div/div[1]/div/a[1]/img");//click 'printed dress'
        click("a[id='wishlist_button']");
        click("");

        String actualErrorMessage = driver.findElement(By.xpath("//p[@class='fancybox-error']")).getText();
        String expectedErrorMessage = "You must be logged in to manage your wishlist.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
