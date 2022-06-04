package app.statefarm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAccount extends CommonAPI {
    @Test
    public void openAccountCd(){
        click("//span[text()='Banking']");
        click("//a[text()='Retirement CDs']");
        String expectedText1 = "Choose the CD that works for you";
        String text1 = getElementText("//h2[@class='-w_mt-md-20 -w_mt-xl-25 -w_ml-xl-65 -w_mb-xl-0']");
        Assert.assertEquals(expectedText1,text1);
    }

    @Test
    public void openCheckingA(){
        click("//span[text()='Banking']");
        click("//a[text()='Checking']");
        String expectedText1 = "Easy Checking";
        String text1 = getElementText("//h2[text()='Easy Checking']");
        Assert.assertEquals(expectedText1,text1);
    }
}
