package apps.automationpractice;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopPage extends CommonAPI {

    public PrestaShopPage(){
        PageFactory.initElements(driver, this);
    }
}
