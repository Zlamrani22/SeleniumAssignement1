package app.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct extends CommonAPI {

        @Test
        public void SearchProducr() {
            click("<input type=\"submit\" class=\"btn btn-prim gh-spr\" id=\"gh-btn\" value=\"Search\">");
            String expectSearchProduct = "ebay.com : SearchProduct";
            Assert.assertEquals("expectedSearchProduct", getClass());
        }

    }












