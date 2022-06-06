package app.automationpractice;

import apps.automationpractice.HomePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {

        @Test
        public void testSearchFunctionality() {
            HomePage homePage = new HomePage(driver);
            homePage.searchInputField("long dresses");
            homePage.clickSearchButton();

            String expectedSearchText = "LONG DRESSES";
            String actualSearchText = driver.findElement(By.cssSelector("span[class='lighter']")).getText();
            Assert.assertEquals(actualSearchText, expectedSearchText);
            //Assert.assertEquals("Printed Summer Dress", expectedSearchText);
        }
        @Test
        public void testSearchInvalidClothingItem() {
            HomePage homePage = new HomePage(driver);
            homePage.searchInputField("Jeans");
            homePage.clickSearchButton();

            String actualMessage = driver.findElement(By.cssSelector("p[class='alert alert-warning']")).getText();
            String expectedMessage = "No results were found for your search \"Jeans\"";
            Assert.assertEquals(actualMessage, expectedMessage);
        }
        @Test
        public void testBestSellers() {
            HomePage homePage = new HomePage(driver);
            homePage.clickBestSellers();
            homePage.clickSearchButton();

            String actual = driver.getTitle();
            String expected = "Unlock the full potential of your ecommerce";
            Assert.assertEquals(actual, expected);
        }
        @Test
        public void testSummerCollection() {
            HomePage homePage = new HomePage(driver);
            homePage.summerCollection();
            homePage.prestaShopDownloadButton();

            String actual = driver.getTitle();
            String expected = "Download PrestaShop";
            Assert.assertEquals(actual, expected);
        }


    }
