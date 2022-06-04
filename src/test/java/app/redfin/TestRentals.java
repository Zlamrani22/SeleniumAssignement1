package app.redfin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRentals extends CommonAPI {

    @Test
    public void testSearchForRentals(){
        click("//*[@id='homepageTabContainer']//div//div[1]//div[3]/a");

        String expectedText = "Local rentals\n" +
                "at your fingertips";
        Assert.assertEquals(expectedText, "Local rentals\n" +
                "at your fingertips");
    }
    @Test
    public void testContactCustomerService(){
        click("//*[@id='content']//div[8]//div[7]//section//div[2]//div//div[3]/a/span");
        click("//*[@id='menu-1-265ffb0']//li[8]//a");

            String actualText = driver.findElement(By.xpath("//*[@id='post-17']//div//section[1]//div//div[1]//div/h1")).getText();
            String expectedText = "Contact Us";
            Assert.assertEquals(actualText, expectedText);
    }

}
