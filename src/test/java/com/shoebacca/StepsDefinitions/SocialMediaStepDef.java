package com.shoebacca.StepsDefinitions;

import PageObjectFactory.SocialMediaPageFactory;
import io.cucumber.java.en.Then;

public class SocialMediaStepDef extends HarnessVariables{

    SocialMediaPageFactory socialMediaPageFactory;

    public SocialMediaStepDef() throws Exception {
        socialMediaPageFactory = new SocialMediaPageFactory();
    }
    @Then("User Enters Id on Facebook Page")
    public void userEntersIdOnFacebookPage() throws Exception {
        socialMediaPageFactory.enterSocialMediaUserID(VALID_SOCIAL_MEDIA_USER_ID);
    }

    @Then("User Enters Password on Facebook Page")
    public void userEntersPasswordOnFacebookPage() throws Exception {
        socialMediaPageFactory.enterSocialMediaPassword(VALID_PASSWORD);
    }

    @Then("User Clicks on Login Button on Facebook Page")
    public void userClicksOnLoginButtonOnFacebookPage() {
        socialMediaPageFactory.clickOnLoginButton();
    }
}