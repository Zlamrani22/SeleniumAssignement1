package app.statefarm;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestQuotePayBill extends CommonAPI {
    @Test
    public void Quote(){
        click("//li[@class='-oneX-header-main-nav-list'][4]");
        selectFromDropdown("#getaquote-select-product","Auto");
        type("#getaquote-zip","11219");
        click("#getaQuoteButton");
    }

    @Test
    public void PayBill(){
        click("//span[text()='Pay a Bill']");
        selectFromDropdown("//select[@name='billingMode']", "Phone Number");
        type("#pay-a-bill-phoneNo","3475495665");
        type("//input[@name='dob']","04061987");
    }
}
