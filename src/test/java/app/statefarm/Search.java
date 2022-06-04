package app.statefarm;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends CommonAPI {
    @Test
    public void findAgent(){
        type("#callout-agent-zip-code-input1","11219");
        click("#quote-main-zip-code-button1");
        String expectedText1 = "Find a State Farm Agent Near You";
        String text1 = getElementText("//h1[@class='-oneX-heading--h1']");
        Assert.assertEquals(expectedText1,text1);

    }
}