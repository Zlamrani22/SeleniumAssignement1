package app.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends CommonAPI {

    @Test
    public void testAuthenticateWithValidCredentials() {
//        click("a[title='Log in to your customer account']");
//        typeAndEnter("input[id='email']", "tadefi_01@yahoo.fr");
//        typeAndEnter("//input[@id='passwd']", "tadefi2022");
//        click("button[id='SubmitLogin']");

        String expectedAccountPageTitle = "MY ACCOUNT";
        Assert.assertEquals(expectedAccountPageTitle, getPageTitle());
    }
    @Test
    public void testAuthenticateWithInvalidPassword() {
//        click("a[title='Log in to your customer account']");
//        typeAndEnter("input[id='email']", "tadefi_01@yahoo.fr");
//        typeAndEnter("//input[@id='passwd']", "tadefi2022");
//        click("button[id='SubmitLogin']");

//        String actualMessage = driver.findElement(By.cssSelector("")).getText();
//        String expectedMessage = "";
//        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
/**
 * Resource Limit Is Reached
 * The website is temporarily unable to service your request
 * as it exceeded resource limit. Please try again later.
 */

