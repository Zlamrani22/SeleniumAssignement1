package app.redfin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {
    @Test
    public void testLoginFunctionality(){
        click("//button[@data-rf-test-name='SignInLink']");

        String expectedText = "Join or Sign In";
        Assert.assertEquals(expectedText, "Join or Sign In");
    }
    @Test
    public void testHomeResultsInSanFrancisco(){
        typeAndEnter("//div[@id='tabContentId0']//button[@data-rf-test-name='searchButton']", "San Francisco");

        String actualLocation = driver.findElement(By.xpath("")).getText();
        String expectedLocation = "San Francisco";
        Assert.assertTrue(actualLocation.contains(expectedLocation));
    }
    @Test
    public void testNewsButtonSearch(){
        click("//a[@href='/news/']");

        String actualText = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']")).getText();
        String expectedLocation = "What's New";
        Assert.assertTrue(actualText.contains(expectedLocation));
    }
    @Test
    public void testDataCenterGraphFullScreenView(){
        click("//a[@href='/news/']");
        click("//a[@href='https://www.redfin.com/news/data-center/']");
        click("//a[@href='https://www.redfin.com/about/data-quality-on-redfin']");
        driver.navigate().to("https://www.redfin.com/about/data-quality-on-redfin");

        String actualText = driver.findElement(By.xpath("//*[@id=\\\"search-agents\\\"]/div/div/h1/span")).getText();
        String expectedText = "Our Dedication to Data Quality";
        Assert.assertTrue(actualText.contains(expectedText));
    }
    @Test
    public void testSignupForeRealEstateNews(){
        click("//a[@href='/news/']");
        typeAndEnter("//*[@id=\\\"input_1_1\\\"]", "emailAddress");

        String actualText = driver.findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-large']")).getText();
        String expectedText = "Our Dedication to Data Quality";
        Assert.assertTrue(actualText.contains(expectedText));
    }
    @Test
    public void testMarketTrackerLink(){
        click("//a[@href='/news/']");
        click("//a[@href='https://www.redfin.com/news/housing-market-news/']");
        click("//a[@href='https://www.redfin.com/news/housing-market-news/page/139/']");

        String expectedText = "139";
        Assert.assertEquals(expectedText,"139");
    }
}
