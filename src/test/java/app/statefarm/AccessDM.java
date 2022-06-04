package app.statefarm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccessDM extends CommonAPI {
        @Test
        public void aDocument(){
            selectFromDropdown("//section[@class='-oneX-header-nav-apps-container']/div/div/button/img","Documents");
            click("//div[@class='-oneX-submenu-usermenu']/ul/li[2]");
            String expectedTestngPageTitle = "#DocumentCenterHeader";
            Assert.assertEquals(expectedTestngPageTitle, getPageTitle());

        }
    @Test(enabled = false)
        public void aMessages(){
           selectFromDropdown("//section[@class='-oneX-header-nav-apps-container']/div/div/button/img","Messages");
           click("");
           String expectedTestngPageTitle = "#header";
           Assert.assertEquals(expectedTestngPageTitle, getPageTitle());

    }
   }
