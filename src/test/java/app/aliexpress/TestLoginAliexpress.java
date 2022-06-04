package app.aliexpress;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginAliexpress extends CommonAPI {
    @Test
    public void login1(){
      click("//span[@class='_34l2i']");
      type("//input[@id='fm-login-id']", "larimus1987@outlook.com");
      type("//input[@id='fm-login-password']", "13Mai2014$");
      click("//button[@class='cosmos-btn cosmos-btn-primary cosmos-btn-large cosmos-btn-block login-submit']");
      String expectedText = "Hi, Mustapha";
      String text = getElementText("//div[@class='_1_3UD']");
      Assert.assertEquals( expectedText, text);



    }
    @Test
    public void login2(){
        click("//span[@class='_34l2i']");
        type("//input[@id='fm-login-id']", "larimus1987@outlook.com");
        type("//input[@id='fm-login-password']", "13Mai20");
        click("//button[@class='cosmos-btn cosmos-btn-primary cosmos-btn-large cosmos-btn-block login-submit']");
        String expectedText = "Your account name or password is incorrect.";
        String text = getElementText("//div[@class='cosmos-alert-message']");
        Assert.assertEquals( expectedText, text);




    }



}
