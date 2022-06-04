package app.statefarm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoPaperLess extends CommonAPI {
    @Test
    public void paperLess(){
        click("//ul[@class='-oneX-header-main-nav-menu']/li[2]");
        click("//div[@class='-oneX-col-12 -oneX-col-md-6 -oneX-bills-menu']/span/following-sibling::ul[1]/li[5]");
        String expectedText = "Sign up to go paperless!";
        String text = getElementText("#auth-header");
        Assert.assertEquals(expectedText, text);
        type("#phoneNumber-input","(347)549-5665");
        type("#dob-input","#dob-input");
    }

}//div[@class='-oneX-col-12 -oneX-col-md-4 -oneX-col-xl-2']/ul/li[3]
