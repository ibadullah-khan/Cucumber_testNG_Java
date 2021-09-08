package EnumFactory;

public enum SocialMediaPageEnum {

    XPATH_ID_INPUT_FIELD("//*[@id='email']"),
    XPATH_PASSWORD_INPUT_FIELD("//*[@id='pass']"),
    XPATH_LOGIN_BUTTON("//*[@name='login']");

    private String socialMediaPageVariables;

    private SocialMediaPageEnum(String socialMediaPageVariables) {
        this.socialMediaPageVariables = socialMediaPageVariables;
    }

    public String getValue() {
        return this.socialMediaPageVariables;
    }
}