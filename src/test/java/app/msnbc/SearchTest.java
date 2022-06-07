package app.msnbc;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void columnistZeeshanTest10(){
        waitFor(1);
        click("h2[class='styles_title__RQZ4f'] a");
        click("button[class='animated-ghost-button animated-ghost-button--normal styles_actionButton__CyZ6G']");
        waitFor(2);
        click("(//div[@class='styles_entity__qmo5G'])[1]");
        String expectedPageTitle= "MSNBC Author Zeeshan Aleem";
        Assert.assertEquals(expectedPageTitle,getPageTitle());

    }

    @Test
    public void careerSearchTest19(){
        click("//a[text()='Morning Joe']");
        click("//a[text()='Careers']");
        typeAndEnter("input[class='input-search']","IT");
        String pageTitle= "Find a Job | NBCUnicareers";
        Assert.assertEquals(pageTitle,getPageTitle());
    }
}
