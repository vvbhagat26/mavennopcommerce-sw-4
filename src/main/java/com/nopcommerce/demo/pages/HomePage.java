package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {
    public By topMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li");
    public By computerLink = By.linkText("Computers");

    //Click method
    public void click(By by) {
        clickOnElement(by);
    }

    //Select Menu method
    public void selectMenu(String menu) {
        List<WebElement> topMenuElement = getMultipleElements(topMenu);
        //Store elements is webelement list
        //Click on element according to parameter
        for (WebElement e : topMenuElement) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    //Get text from all menu tab method
    public List<String> getTextFromAllMenu() {
        List<WebElement> topMenuElement = getMultipleElements(topMenu);

        List<String> printAllMenuNames = new ArrayList<>();
        for (WebElement e : topMenuElement) {
            printAllMenuNames.add(e.getText());
        }
        List<String> pageHeadingList = new ArrayList<>();
        //Navigating to each element one by one
        for (int i = 0; i < printAllMenuNames.size(); i++) {
            selectMenu(printAllMenuNames.get(i));
            pageHeadingList.add(getTextFromElement(By.xpath("//h1[contains(text(),'" + printAllMenuNames.get(i) + "')]")));
        }
        return pageHeadingList;
    }
}
