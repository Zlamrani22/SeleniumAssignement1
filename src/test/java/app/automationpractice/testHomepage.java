package app.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testHomepage extends CommonAPI {

    @Test
    public void testSearchFunctionality(){
        type("input[id='search_query_top']", "Dresses");
        click("button[name='submit_search']");

    }
}
