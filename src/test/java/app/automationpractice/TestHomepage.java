package app.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {
        public void main(String[] args) {
            System.out.println();
        }

        @Test
        public void testSearchFunctionality() {
            type("input[id='search_query_top']", "long dresses");
            click("button[name='submit_search']");

            String expectedSearchText = "LONG DRESSES";
            String actualSearchText = driver.findElement(By.cssSelector("span[class='lighter']")).getText();
            Assert.assertEquals(actualSearchText, expectedSearchText);
            //Assert.assertEquals("Printed Summer Dress", expectedSearchText);
        }
        @Test
        public void testSearchInvalidClothingItem() {
            type("input[id='search_query_top']", "Jeans");
            click("button[name='submit_search']");

            String actualMessage = driver.findElement(By.cssSelector("p[class='alert alert-warning']")).getText();
            String expectedMessage = "No results were found for your search \"Jeans\"";
            Assert.assertEquals(actualMessage, expectedMessage);
        }
        @Test
        public void testBestSellers() {
            click("a[class='blockbestsellers']");
            click("img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img4.jpg']");

            String actual = driver.getTitle();
            String expected = "Unlock the full potential of your ecommerce";
            Assert.assertEquals(actual, expected);
        }
        @Test
        public void testSummerCollection() {
            click("img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img7.jpg']");
            click("//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']");

            String actual = driver.getTitle();
            String expected = "Download PrestaShop";
            Assert.assertEquals(actual, expected);
        }


    }
