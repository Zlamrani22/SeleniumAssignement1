package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideoTest extends CommonAPI {

    @Test
    public void liveTvTest1(){
        waitFor(1);
        click("div[class='mini-tease-local mini-tease-local--live']");
        click("button[class='tve__signin__action']");
        waitFor(1);
        click("button[value='Cablevision']");
        Assert.assertEquals("MSNBC Live: Stream the latest TV shows",getPageTitle());
    }

    @Test
    public void videoTests(){
        waitFor(1);
        click("//a[text()='Rachel Maddow']");
        click("//div[@class='lazyload-wrapper'][2]");
        click("//div[@class='lazyload-wrapper'][3]");
        click("//div[@class='lazyload-wrapper'][4]");
        String text= getElementText("h2[class=\"styles_titleText__7qLbv\"]");
        Assert.assertEquals("Latest Maddow Videos",text);
    }
}
