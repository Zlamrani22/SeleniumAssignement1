package app.ebay;

import base.CommonAPI;


public class testHomepage extends CommonAPI {
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.awt.SystemColor.text;

public class testHomepage extends CommonAPI {
    @Test
    public void testCheckSigninFunctionality() {
        click("a[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']");
        String expectedText = "Sign in and security";
        String title = getElementText("Account Settings");
        String expectedHomePage = "sign in and security";
        Assert.assertEquals(expectedText, text);



    }
}





