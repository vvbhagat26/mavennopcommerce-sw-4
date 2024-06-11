package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    /*
    Write the following test
1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
1.1 Mouse Hover on “Electronics” Tab
1.2 Mouse Hover on “Cell phones” and click
1.3 Verify the text “Cell phones”
2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
2.1 Mouse Hover on “Electronics” Tab
2.2 Mouse Hover on “Cell phones” and click
2.3 Verify the text “Cell phones”
2.4 Click on List View Tab
2.5 Click on product name “Nokia Lumia 1020” link
2.6 Verify the text “Nokia Lumia 1020”
2.7 Verify the price “$349.00”
2.8 Change quantity to 2
2.9 Click on “ADD TO CART” tab
2.10 Verify the Message "The product has been added to your shopping cart" on Top
green Bar
After that close the bar clicking on the cross button.
2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
2.12 Verify the message "Shopping cart"
2.13 Verify the quantity is 2
2.14 Verify the Total $698.00
2.15 click on checkbox “I agree with the terms of service”
2.16 Click on “CHECKOUT”
2.17 Verify the Text “Welcome, Please Sign In!”
2.18 Click on “REGISTER” tab
2.19 Verify the text “Register”
2.20 Fill the mandatory fields
2.21 Click on “REGISTER” Button
2.22 Verify the message “Your registration completed”
2.23 Click on “CONTINUE” tab
2.24 Verify the text “Shopping card”
2.25 click on checkbox “I agree with the terms of service”
2.26 Click on “CHECKOUT”
2.27 Fill the Mandatory fields
2.28 Click on “CONTINUE”
2.29 Click on Radio Button “2nd Day Air ($0.00)”
2.30 Click on “CONTINUE”
2.31 Select Radio Button “Credit Card”
2.32 Select “Visa” From Select credit card dropdown
2.33 Fill all the details
2.34 Click on “CONTINUE”
2.35 Verify “Payment Method” is “Credit Card”
2.36 Verify “Shipping Method” is “2nd Day Air”
2.37 Verify Total is “$698.00”
2.38 Click on “CONFIRM”
2.39 Verify the Text “Thank You”
2.40 Verify the message “Your order has been successfully processed
2.41 Click on “CONTINUE”
2.42 Verify the text “Welcome to our store”
     */
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        electronicsPage.mouseHoverToElement(electronicsPage.electronicsLink);
        electronicsPage.mouseHoverToElementAndClick(electronicsPage.cellPhonesLink);
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getVerificationText(electronicsPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        electronicsPage.mouseHoverToElement(electronicsPage.electronicsLink);
        electronicsPage.mouseHoverToElementAndClick(electronicsPage.cellPhonesLink);
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getVerificationText(electronicsPage.cellPhoneText);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.listTab);
        Thread.sleep(2000);
        electronicsPage.clickOn(electronicsPage.nokiaLumia1020);
        expectedText = "Nokia Lumia 1020";
        actualText = electronicsPage.getVerificationText(electronicsPage.nokiaLumia1020Text);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "$349.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.price349);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clearAndSendText(electronicsPage.qtyBox, "2");
        electronicsPage.clickOn(electronicsPage.addToCartButton);
        expectedText = "The product has been added to your shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.confirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.closeButton);
        electronicsPage.mouseHoverOnElementAndClick(electronicsPage.shoppingCartTab);
        electronicsPage.clickOn(electronicsPage.goToCartButton);
        expectedText = "Shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "2";
        actualText = electronicsPage.getAttribute(electronicsPage.qty);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "$698.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.total698);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.agreeTermsCheckBox);
        electronicsPage.clickOn(electronicsPage.checkOutButton);
        expectedText = "Welcome, Please Sign In!";
        actualText = electronicsPage.getVerificationText(electronicsPage.welcomeMessage);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.registerTab);
        expectedText = "Register";
        actualText = electronicsPage.getVerificationText(electronicsPage.registerText);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.selectMaleGender);
        electronicsPage.sendText(electronicsPage.firstName, "Kia");
        electronicsPage.sendText(electronicsPage.lastName, "Shah");
        electronicsPage.sendText(electronicsPage.emailId, electronicsPage.generateEmailId());
        electronicsPage.select(electronicsPage.date, "1");
        electronicsPage.select(electronicsPage.month, "2");
        electronicsPage.select(electronicsPage.year, "1985");
        electronicsPage.sendText(electronicsPage.password, "kia123");
        electronicsPage.sendText(electronicsPage.confirmPassword, "kia123");
        electronicsPage.clickOn(electronicsPage.registerButton);
        expectedText = "Your registration completed";
        actualText = electronicsPage.getVerificationText(electronicsPage.completeRegistrationText);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.continueTab);
        expectedText = "Shopping cart";
        actualText = electronicsPage.getVerificationText(electronicsPage.shoppingCartText);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.agreeTermsCheckBox);
        electronicsPage.clickOn(electronicsPage.checkOutButton);
        electronicsPage.select(electronicsPage.selectCountry, "133");
        electronicsPage.sendText(electronicsPage.cityName, "Surat");
        electronicsPage.sendText(electronicsPage.address1, "A 3/4");
        electronicsPage.sendText(electronicsPage.postalCode, "395004");
        electronicsPage.sendText(electronicsPage.phoneNumber, "09828127782");
        electronicsPage.clickOn(electronicsPage.continueButton);
        electronicsPage.clickOn(electronicsPage.radioButton2dayAir);
        electronicsPage.clickOn(electronicsPage.continueShippingNext);
        electronicsPage.clickOn(electronicsPage.radioCreditCardButton);
        electronicsPage.clickOn(electronicsPage.continuePaymentNext);
        electronicsPage.select(electronicsPage.creditcardOption, "visa");
        electronicsPage.sendText(electronicsPage.cardHolderName, "Kia shah");
        electronicsPage.sendText(electronicsPage.creditCardNumber, "5413330089010640");
        electronicsPage.select(electronicsPage.expiryYear, "2026");
        electronicsPage.sendText(electronicsPage.cardCode, "123");
        electronicsPage.clickOn(electronicsPage.continueToDetailsButton);
        expectedText = "Credit Card";
        actualText = electronicsPage.getVerificationText(electronicsPage.paymentMethodText);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "2nd Day Air";
        actualText = electronicsPage.getVerificationText(electronicsPage.shippingMethod2Day);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "$698.00";
        actualText = electronicsPage.getVerificationText(electronicsPage.finalTotal698);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.confirmButton);
        expectedText = "Thank you";
        actualText = electronicsPage.getVerificationText(electronicsPage.thankYouText);
        Assert.assertEquals(actualText, expectedText);
        expectedText = "Your order has been successfully processed!";
        actualText = electronicsPage.getVerificationText(electronicsPage.orderConfirmationMessage);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.continueButtonAfterPayment);
        expectedText = "Welcome to our store";
        actualText = electronicsPage.getVerificationText(electronicsPage.welcomeToStoreMessage);
        Assert.assertEquals(actualText, expectedText);
        electronicsPage.clickOn(electronicsPage.logOut);
        expectedText = "https://demo.nopcommerce.com/";
        actualText = driver.getCurrentUrl();
        Assert.assertEquals(actualText, expectedText);
    }
}
