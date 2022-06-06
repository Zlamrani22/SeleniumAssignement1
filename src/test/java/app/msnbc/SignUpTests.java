package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTests extends CommonAPI {

    @Test
    public void invalidEmail(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='MSNBC Newsletters']");
        click("//li[@class='waffleCard styles_waffleCard__TcO9m'][2]");
        typeAndEnter("input[id='email']","abcd@123");
        Assert.assertEquals("Sign up for the Morning Joe newsletter | NBC News",getPageTitle());
    }

    @Test
    public void validEmail(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='MSNBC Newsletters']");
        click("//li[@class='waffleCard styles_waffleCard__TcO9m'][2]");
        typeAndEnter("input[id='email']","sadaf492@hotmail.com");
        waitFor(2);
        String text= getElementText("h3[class='headline']");
        Assert.assertEquals("You have successfully signed up for the Morning Joe newsletter.",text);
    }

}
