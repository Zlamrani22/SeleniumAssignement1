package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FollowPageTest extends CommonAPI {

    @Test
    public void deadlineTwitterPageTest(){
        click("//a[text()='Deadline: WH']");
        click("//a[text()='TWITTER']");
        click("div[class='css-1dbjc4n']");
        Assert.assertEquals("Deadline White House (@DeadlineWH) / Twitter",getPageTitle());
    }

    @Test
    public void morningJoeInstagramPageTest(){
        click("//a[text()='Morning Joe']");
        click("//a[@class=\"animated-ghost-button animated-ghost-button--small styles_promo3PanelButton__X0MV7\"][text()='FULL BIO'][1]");
        click("//a[text()='@JoeScarborough']");
        waitFor(1);
        Assert.assertEquals("Joe Scarborough (@joescarborough) • Instagram photos and videos",getPageTitle());
    }

}
