package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTests extends BaseTests {

    private static final int AMOUNT_SECONDS_FOR_WAIT = 30;
    private static final String ENTERING_EMAIL_INTO_EMAIL_FIELD = "antbeliy9@gmail.com";
    private static final String EXPECTED_TEXT_FROM_FIELD_WITH_WARN_IN_LOGIN_PAGE = "Hey, we need a password here";
    private static final int EXPECTED_AMOUNT_OF_FIELDS_WHICH_MUST_BE_FILLED_IN_JOIN_PAGE = 7;

    @Test(priority = 6)
    public void checkThatCanNotSignInWithoutPassword() {
        getHomePage().clickOnMyAccountField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().getSignInInMyAccountField());
        getHomePage().clickOnSignInInMyAccountField();
        getBasePage().waitForPageReadyState(AMOUNT_SECONDS_FOR_WAIT);
        getLoginPage().enterEmailIntoEmailField(ENTERING_EMAIL_INTO_EMAIL_FIELD);
        getBasePage().implicitlyWaiter(AMOUNT_SECONDS_FOR_WAIT);
        Assert.assertEquals(getLoginPage().getTextFromWarnFieldInLoginPage(), EXPECTED_TEXT_FROM_FIELD_WITH_WARN_IN_LOGIN_PAGE);
    }

    @Test(priority = 7)
    public void checkThatCanNotSignUpWithoutFilledFields() {
        getHomePage().clickOnMyAccountField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().getSignInInMyAccountField());
        getHomePage().clickOnJoinInMyAccountField();
        getBasePage().waitForElementToBeClickable(AMOUNT_SECONDS_FOR_WAIT, getLoginPage().waitVisibilityJoinAsosButtonInJoinPage());
        getLoginPage().clickOnJoinAsosButtonInJoinPage();
        Assert.assertEquals(getLoginPage().getAmountOfWarnFieldsInJoinPage(), EXPECTED_AMOUNT_OF_FIELDS_WHICH_MUST_BE_FILLED_IN_JOIN_PAGE);
    }
}
