package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownMenuTests extends CommonAPI {

    @Test
    public void tvScheduleTest2(){
        waitFor(1);
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Monday']");
        click("//p[.='Tuesday']");
        click("//p[.='Wednesday']");
        click("//p[.='Thursday']");
        click("//p[.='Friday']");
        click("//p[.='Saturday']");
        click("//p[.='Sunday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleMondayTest3(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Monday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleTuesdayTest4(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Tuesday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleWednesdayTest5(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Wednesday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleThursdayTest6(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Thursday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleFridayTest7(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Friday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleSatrudayTest8(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Saturday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

    @Test
    public void tvScheduleSundayTest9(){
        click("button[class='hamburger js-menu-toggle']");
        waitFor(1);
        click("//span[text()='TV Schedule']");
        click("//p[.='Sunday']");
        Assert.assertEquals("MSNBC Schedule | See the MSNBC TV Schedule Today",getPageTitle());
    }

}
