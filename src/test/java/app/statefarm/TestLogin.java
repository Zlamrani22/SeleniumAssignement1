package app.statefarm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testHomepage extends CommonAPI {
    @Test
    public void login1() {
        click("//*[text()='Log in']");
        String expectedText = "Log in to view and manage your account.";
        String text = getElementText("//div[text()='Log in to view and manage your account.']");
        Assert.assertEquals(expectedText, text);
        type("//input[@autocomplete='username']", "Aksel1506");
        type("//input[@id='util-login-password']", "TestCase@java2");
        click("//button[text()='Log in']");
        String expectedText1 = "VERIFICATION";
        String text1 = getElementText("//div[@id='page-header']");
        Assert.assertEquals(expectedText1,text1);

    }

    @Test
    public void login2() {
        click("//*[text()='Log in']");
        String expectedText = "Log in to view and manage your account.";
        String text = getElementText("//div[text()='Log in to view and manage your account.']");
        Assert.assertEquals(expectedText, text);
        type("//input[@autocomplete='username']", "Aksel0615");
        type("//input[@id='util-login-password']", "TestCase@java2");
        click("//button[text()='Log in']");
        String expectedText1 = "";
        String text1 = getElementText("#troubleLoggingIn");
        Assert.assertEquals("","");

    }
}

