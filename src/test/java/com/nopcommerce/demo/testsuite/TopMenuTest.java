package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    /*
    1.1 create method with name "selectMenu" it has one parameter name "menu" of type
string
1.2 This method should click on the menu whatever name is passed as parameter.
1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
select the Menu and click on it and verify the page navigation
     */

    @Test
    public void verifyPageNavigation() {
        //List of expected test
        List<String> expectedText = Arrays.asList(
                "Computers",
                "Electronics",
                "Apparel",
                "Digital downloads",
                "Books",
                "Jewelry",
                "Gift Cards"
        );
        //List of text from pages
        List<String> actualText = homePage.getTextFromAllMenu();
        //Compare both list
        Assert.assertEquals(actualText, expectedText, "Top menu is not displayed");
    }
}
