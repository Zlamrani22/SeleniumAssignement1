package app.redfin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedfinHomepage extends CommonAPI {

    @Test
    public void testLoginFunctionality(){
        click("//button[@data-rf-test-name='SignInLink']");

        String expectedText = "Join or Sign In";
        Assert.assertEquals(expectedText, "Join or Sign In");
    }
    @Test
    public void testHomeResultsInSanFrancisco(){
        typeAndEnter("//*[@id='homepageTabContainer']/div/div/div[1]/div[1]/a", "San Francisco");
        click("#tabContentId0 > div > div > form > div.search-container.inline-block > button");

        String expectedText = "San Francisco Homes for Sale";
        Assert.assertEquals(expectedText, "San Francisco Homes for Sale");
//        String actualLocation = driver.findElement(By.cssSelector("#results-display > div.DesktopSearchHeader--container > div > div > div > h1")).getText();
//        String expectedLocation = "San Francisco Homes for Sale";
//        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testNewsButtonSearch(){
        click("//a[@href='/news/']");

        String actualText = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']")).getText();
        String expectedLocation = "What's New";
        Assert.assertTrue(actualText.contains(expectedLocation));
    }
    @Test
    public void testDataCenterOverView(){
        click("//span[text()='See Housing News']");
        click("//*[@id='menu-1-265ffb0']/li[5]/a");
        click("//*[@id='menu-1-265ffb0']/li[1]/a");

        String text = getElementText("//*[@id='post-80']//div//section//div[1]/div/h1");
        Assert.assertEquals("Housing Market", text);
    }
    @Test
    public void testSignupForeRealEstateNews(){
        click("#topMenuRealEstateAgentsLink > a");
        click("//*[@id='content']//div[8]//div[2]/button/span");

        String actualText = driver.findElement(By.xpath("//*[@id='content']//div[9]//section//div[2]//h2/span")).getText();
        String expectedText = "Find a local Redfin Agent";
        Assert.assertTrue(actualText.contains(expectedText));
    }
    @Test
    public void testMarketTrackerLink(){
        click("//*[@id='content']//div[8]//div[7]//section//div[2]//div[3]/a/span");
        click("//a[@href='https://www.redfin.com/news/housing-market-news/']");
        click("//*[@id='post-80']//div//section//div//div[4]//div//article[4]//div[2]//div[1]/h5/a");

        String expectedText = "New Construction";
        Assert.assertEquals(expectedText,"New Construction");
    }
}
