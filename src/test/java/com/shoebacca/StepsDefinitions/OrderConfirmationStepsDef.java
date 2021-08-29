package com.shoebacca.StepsDefinitions;

import PageObjectFactory.OrderConfirmationPageFactory;
import io.cucumber.java.en.Then;

public class OrderConfirmationStepsDef extends HarnessVariables {

    OrderConfirmationPageFactory orderConfirmationPageFactory;


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
        orderConfirmationPageFactory.reEnterPasswordOnOrderConfirmation(INVALID_PASSWORD);
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
        orderConfirmationPageFactory.enterConfirmPasswordOnOrderConfirmation(CONFIRM_PASSWORD);
    }

    @Then("User Validate Email Validation Text on Order Confirmation Page")
    public void userValidateEmailValidationTextOnOrderConfirmationPage() throws Exception {
        orderConfirmationPageFactory.validateSameEmailExistErrorMsg(SAME_EMAIL_ERROR);
    }
}
