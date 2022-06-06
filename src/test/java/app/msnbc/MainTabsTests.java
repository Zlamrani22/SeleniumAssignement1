package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTabsTests extends CommonAPI {

        @Test
        public void homepageTabTest11(){
            click("div[class='shortcuts h-h'] li:nth-child(2)");
            String text= getElementText("h4[class='styles_title__Ge8pR']");
            Assert.assertEquals("MSNBC Daily Columnists",text);
            click("//a[text()='Rachel Maddow']");
            Assert.assertEquals("Rachel Maddow Show on MSNBC | Watch Rachel Maddow Live",getPageTitle());
            click("//a[text()='Morning Joe']");
            Assert.assertEquals("Morning Joe | MSNBC Morning Joe Live with Joe Scarborough",getPageTitle());
            click("//a[text()='Deadline: WH']");
            Assert.assertEquals("Deadline: White House on MSNBC with Nicolle Wallace",getPageTitle());
            click("//a[text()='The Beat']");
            Assert.assertEquals("The Beat With Ari Melber on MSNBC",getPageTitle());
            click("//a[text()='The ReidOut']");
            Assert.assertEquals("The ReidOut with Joy Reid on MSNBC | The Joy Reid Show",getPageTitle());

        }




}
