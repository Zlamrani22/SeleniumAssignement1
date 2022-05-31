package app.aliexpress;

import base.CommonAPI;
import org.testng.annotations.Test;

public class testHomepage extends CommonAPI {
    @Test
    public void login(){
      click("//span[text()='Sign in']");
      type("//input[@id='fm-login-id']", "larimus1987@outlook.com");
      type("//input[@id='fm-login-password']", "13Mai2014$");
      click("//button[@type='submit']");



    }
}
