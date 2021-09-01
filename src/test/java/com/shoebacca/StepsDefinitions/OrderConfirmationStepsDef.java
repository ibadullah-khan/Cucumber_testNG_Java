package com.shoebacca.StepsDefinitions;

import PageObjectFactory.OrderConfirmationPageFactory;
import UtilitiesFactory.PropertyLoaderFactory;
import io.cucumber.java.en.Then;

public class OrderConfirmationStepsDef extends HarnessVariables {

    OrderConfirmationPageFactory orderConfirmationPageFactory;
    protected String errorMsgPropFile = "errorMsg.properties";

    public OrderConfirmationStepsDef() throws Exception {
        orderConfirmationPageFactory = new OrderConfirmationPageFactory();
    }

    @Then("User Closes Feedback Window on Confirmation Page")
    public void userClosesFeedbackWindowOnConfirmationPage() throws Exception{
        orderConfirmationPageFactory.closeFeedbackWindow();
    }

    @Then("User Enters Password on Order Confirmation Page")
    public void userEntersPasswordOnOrderConfirmationPage() throws Exception{
        orderConfirmationPageFactory.enterPasswordOnOrderConfirmation(VALID_PASSWORD);
    }

    @Then("User Enters Mismatch Password on Order Confirmation Page")
    public void userEntersMismatchPasswordOnOrderConfirmationPage() throws Exception{
        orderConfirmationPageFactory.enterConfirmPasswordOnOrderConfirmation(INVALID_PASSWORD);
    }

    @Then("User Clicks on Create Account Button on Order Confirmation Page")
    public void userClicksOnCreateAccountButtonOnOrderConfirmationPage() throws Exception{
        orderConfirmationPageFactory.clickCreateAccount();
    }

    @Then("Verify Validation Text Appear on Order Confirmation Page")
    public void verifyValidationTextAppearOnOrderConfirmationPage() throws Exception{
        orderConfirmationPageFactory.validateMismatchPasswordErrorMsg(MISMATCH_PASSWORD_ERROR);
    }

    @Then("User Validates Print Slip Button on Confirmation Page {string}")
    public void userValidatesPrintButtonVisibilityOnPrintTab(String expectedCondition) {
        if(expectedCondition.equals("true")){
            orderConfirmationPageFactory.validatePrintButtonVisibility(true);
        }else {
            orderConfirmationPageFactory.validatePrintButtonVisibility(false);
        }
    }

    @Then("User Enters Confirm Password on Order Confirmation Page")
    public void userEntersConfirmPasswordOnOrderConfirmationPage() throws Exception {
        orderConfirmationPageFactory.enterConfirmPasswordOnOrderConfirmation(VALID_PASSWORD);
    }

    @Then("User Validates {string} Error Message on Order Confirmation Page")
    public void userValidatesErrorMessageOnOrderConfirmationPage(String errorMsg) throws Exception {
        String errorText = new PropertyLoaderFactory().getPropertyFile(errorMsgPropFile).getProperty(errorMsg);
        orderConfirmationPageFactory.validateAlreadyExistEmailErrorMsg(errorText);
    }

    @Then("User Validates Order Number Text Visibility {string} on Confirmation Page")
    public void userValidatesOrderNumberVisibilityOnConfirmationPage(String expectedCondition) {
        if (expectedCondition.equals("true")) {
            orderConfirmationPageFactory.ValidatesOrderNumberVisibility(true);
        } else {
            orderConfirmationPageFactory.ValidatesOrderNumberVisibility(false);
        }
    }

    @Then("User Validates Password Field Visibility {string} on Confirmation Page")
    public void validatePasswordFieldVisibility(String expectedCondition) {
        if(expectedCondition.equals("true")){
            orderConfirmationPageFactory.validatePasswordFieldVisibility(true);
        }else {
            orderConfirmationPageFactory.validatePasswordFieldVisibility(false);
        }
    }
}
