package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "input[id='search_query_top']")
    WebElement searchInputField;

    @FindBy(css = "button[name='submit_search']")
    WebElement searchButton;

    @FindBy(css = "a[class='blockbestsellers']")
    WebElement bestSellersButton;

    @FindBy(css = "img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img4.jpg']")
    WebElement sunglassesAndEyewear;

    @FindBy(css = "img[src='http://automationpractice.com/modules/themeconfigurator/img/banner-img7.jpg']")
    WebElement summerCollection;

    @FindBy(css = "//div[@class='popup-link prestashop-link primary-link secondary-os-font-bold']/a[@href='https://www.prestashop.com/en/download']")
    WebElement prestaShopDownloadButton;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void SearchElement(String inputValue){
        type(searchInputField, inputValue);
    }
    public void clickSearchButton(){
        click(searchButton);
    }
    public void clickBestSellers(){
        click(bestSellersButton);
    }
    public PrestaShopPage clickSunglassesAndEyewear(){
        click(sunglassesAndEyewear);
        return new PrestaShopPage();
    }

    public void summerCollection() {
        click(summerCollection);
    }
    public void prestaShopDownloadButton(){
        click(prestaShopDownloadButton);
    }
}
