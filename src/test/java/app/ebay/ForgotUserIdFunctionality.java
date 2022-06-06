package app.ebay;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;
import static java.awt.SystemColor.text;

public class ForgotUserIdFunctionality extends CommonAPI {

    @Test
    public void test1() {
        click("<input id=\"userid\" class=\"textbox__control textbox__control--fluid\" type=\"text\" value=\"\" name=\"userid\" maxlength=\"64\" autocomplete=\"username\">");
        type("text", "name=\"userid\"");
        String expectedForgotUserId = "ebay.com :ForgotUserId";
        Assert.assertEquals(expectedForgotUserId, getPageTitle());
    }

    @Test
    public void test2() {
        click("<a href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&amp;ru=https%3A%2F%2Fwww.ebay.com%2F\" _sp=\"m570.l1524\">Sign in</a>");
        Assert.assertEquals("invalid signin", text);
        String expectedInvalidSignin = "ebay.com :InvalidSignin";
        Assert.assertEquals(expectedInvalidSignin, getPageTitle());
    }

    @Test
    public void test3() {
        click("<input id=\"password\" class=\"textbox__control textbox__control--fluid\" type=\"text\" value=\"\" name=\"password\" maxlength=\"64\" autocomplete=\"username\">");
        type("text", "name=\"password\"");
        String expectedForgotPassword = "ebay.com :ForgotPassword";
        Assert.assertEquals(expectedForgotPassword, getPageTitle());
    }

    @Test
    public void test4() {
        click("<input id=\"userid\" class=\"textbox__control textbox__control--fluid\" type=\"text\" value=\"\" name=\"userid\" maxlength=\"64\" autocomplete=\"username\">");
        waitFor(3000);
        String expectedVaildEmail = "ebay.com :ValidEmail";
        Assert.assertEquals(expectedVaildEmail, text);

    }

    @Test
    public void test5() throws InterruptedException {
        click("<a href=\"https://reg.ebay.com/reg/PartialReg?ru=http%3A%2F%2Fstores.shop.ebay.com%2F_sl.html%3F_fe%3D1\" _sp=\"m570.l2621\">register</a>");
        String expectedRegister = " ebay.com: Register";
        Thread.sleep(2000);
        Assert.assertEquals(expectedRegister, getClass());
    }

    @Test
    public void test6() {
        click("<a href=\"\" class=\"accordion-head--label\" aria-expanded=\"false\">Selling</a>");
        selectFromDropdown("#searchDropdownBox", "smart watches");
        String expectedSellingPageTitleFunctionalty = "ebay.com : sellingPageTitlefunctionality";
        Assert.assertEquals(expectedSellingPageTitleFunctionalty, getPageTitle());

    }

    @Test
    public void test7() {
        click("<a href=\"https://ocsnext.ebay.com/ocs/home\" _sp=\"m570.l1545\" data-sp=\"m570.l1545\" class=\"gh-p\"> Help &amp; Contact</a>");
        waitFor(5);
        String expectedHelpAndContactFunctionalty = "ebay.com:helpandcontactfunctionality";
        Assert.assertEquals(expectedHelpAndContactFunctionalty, getClass());

    }

    @Test
    public void test8() {
        click("<button id=\"gh-shop-a\" aria-expanded=\"false\" class=\"gh-control\" aria-controls=\"gh-sbc-o\">Shop by category<i id=\"gh-shop-ei\" class=\"gh-sprRetina\"></i></button>");
        type("#aria-expanded", "Electronic,vedio games");
        click("id=\"gh-shop-a\"");
        waitFor(5);
        String expectedShopByCategory = "ebay.com : shopbycategory";
        Assert.assertEquals(expectedShopByCategory, getClass());
    }

    @Test
    public void test9() {
        click("<a href=\"https://accountsettings.ebay.com/profile\" referrerpolicy=\"no-referrer-when-downgrade\">Personal information</a>");
        String expectedSigninAndSecurity = "ebay.com :Sign in and security";
        Assert.assertEquals(expectedSigninAndSecurity, getClass());
    }

    @Test
    public void test10() {
        click("a[href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']");
        String expectedText = "Sign in and security";
        String title = getElementText("Account Settings");
        String expectedHomePage = "sign in and security";
        Assert.assertEquals(expectedText, text);
    }
    private void type(String s, SystemColor text) {
    }

    @Test
    public void test11() {
        click("<use xlink:href=\"#icon-cart-new\"></use>");
        waitFor(3000);
        String expectAddToCartOnEbay = "ebay.com :AddToCartOnEbay";
        Assert.assertEquals(expectAddToCartOnEbay, (getPageTitle()));
    }
    @Test
    public void test12() {

        click("<a href=\"https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&amp;lgout=1\" _sp=\"m570.l2622\">Sign out</a>");
       String expectedLogoutFunctionality="ebay.com: LogoutFunctionality";
       waitFor(2000);
       Assert.assertEquals(expectedLogoutFunctionality, getPageTitle());
    }
    @Test
    public void test13() {

        click("<a href=\"https://ppcapp.ebay.com/myppc/wallet/welcome\" referrerpolicy=\"no-referrer-when-downgrade\">Payments</a>");
        selectFromDropdown("#searchDropdownBox", "PayPal");
        String expectedPaymentFunctionality="ebay.com: PaymentFunctionality";
        waitFor(1000);
        Assert.assertEquals(expectedPaymentFunctionality, getElementText(getPageTitle()));
    }
    @Test
    public void test14() {
        click("<a href=\"https://www.ebay.com/deals\" _sp=\"m570.l3188\" data-sp=\"m570.l3188\" class=\"gh-p\"> Daily Deals</a>");
        String expectedDailyDealsFunctionality="ebay.com: DailyDealsFunctionality";
        waitFor(4000);
        Assert.assertEquals(expectedDailyDealsFunctionality, getElementText(getPageTitle()));
    }
    @Test
    public void test15() {
        click("<a href=\"https://www.ebay.com/b/Brand-Outlet/bn_7115532402\" _sp=\"m570.l47233\" data-sp=\"m570.l47233\" class=\"gh-p\"> Brand Outlet</a>");
        selectFromDropdown("#searchDropdownBox", "Apple up to 60%");
        String expectedBrandOutletFunctionality="ebay.com: BrandOutletFunctionality";
        waitFor(2000);
        Assert.assertEquals(expectedBrandOutletFunctionality, getPageTitle());
    }
    @Test
    public void test16() {
      click("<a href=\"https://www.ebay.com/help/account/changing-account-settings/closing-account?id=4199\" referrerpolicy=\"no-referrer-when-downgrade\">Close account</a>");
        String expectedText = "Sign in";
        waitFor(5000);
        String expecteCloseAcountFunctionality="ebay.com: CloseAcountFunctionality";
        Assert.assertEquals(expecteCloseAcountFunctionality, getPageTitle());
    }
    @Test
    public void test17() {
        click("<a href=\"https://mesg.ebay.com/mesgweb/ViewMessages/0?_trksid=p2060353.m2295.l3928\">Messages</a>");
        String expectedText = "Sign in";
        waitFor(3000);
        String expectedInBoxMessageFunctionalityTitle="ebay.com: InBoxMessageFunctionality";
        Assert.assertEquals(expectedInBoxMessageFunctionalityTitle, getPageTitle());
    }
    @Test
    public void test18() {
        click("<a title=\"Advanced Search\" href=\"https://www.ebay.com/sch/ebayadvsearch\" aria-label=\"Advanced Search\" _sp=\"m570.l2614\" id=\"gh-as-a\">Advanced</a>");
        selectFromDropdown("#AdvancedSearchDropdownBox", "On ebay Motors");
        waitFor(1000);
        String expectedAdvancedSearchTitle="ebay.com: AdvancedSearchTitle";
        Assert.assertEquals(expectedAdvancedSearchTitle, getPageTitle());
    }
    @Test
    public void test19() {
        click("<a href=\"https://www.ebay.com/mys/home?source=GBH\" _sp=\"m570.l2919\" title=\"My eBay\" class=\"gh-eb-li-a gh-rvi-menu\">My eBay<i class=\"gh-sprRetina gh-eb-arw gh-rvi-chevron\" data-sp=\"m570.l2919\"></i></a>");
        String expectedMyEbayTitle="ebay.com: MyEbayTitle";
        Assert.assertEquals(expectedMyEbayTitle, getPageTitle());
    }
    @Test
    public void test20() {
        click("<a href=\"https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497\" _sp=\"p2481888.m1384.l3250\">Toys</a>");
        String expectedHomePage = "sign in";
        selectFromDropdown("ToyDropdownBox", "Building Toys");
        waitFor(3000);
        String expectedToysTitle="ebay.com :ToysTitle";
        Assert.assertEquals(expectedToysTitle, getPageTitle());
    }

    }















