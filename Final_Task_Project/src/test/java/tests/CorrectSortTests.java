package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CorrectSortTests extends BaseTests {

    private static final int AMOUNT_SECONDS_FOR_WAIT = 30;
    private static final double EXPECTED_COUNT_ITERATIONS_DURING_SORT = 71.0;

    @Test(priority = 4)
    public void checkOfCorrectSortHighToLow() {
        getHomePage().clickOnWomenField();
        getBasePage().implicitlyWaiter(AMOUNT_SECONDS_FOR_WAIT);
        getWomenPage().clickOnNewInInField();
        getWomenPage().clickOnShoesButtonInNewInField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getWomenPage().waitVisibilityOfSortField());
        getWomenPage().clickOnSortField();
        getWomenPage().clickOnKindOfSortINSortField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getWomenPage().waitVisibilityOfElementOfBoots());
        Assert.assertEquals(getWomenPage().checkCorrectOfSortHighToLow(), EXPECTED_COUNT_ITERATIONS_DURING_SORT);
    }

    @Test(priority = 5)
    public void checkOfCorrectSortLowToHigh() {
        getHomePage().clickOnWomenField();
        getBasePage().implicitlyWaiter(AMOUNT_SECONDS_FOR_WAIT);
        getWomenPage().clickOnNewInInField();
        getWomenPage().clickOnFaceBodyButtonInNewInField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getWomenPage().waitVisibilityOfSortField());
        getWomenPage().clickOnSortField();
        getWomenPage().clickOnKindOfSortINSortFieldLowToHigh();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getWomenPage().waitVisibilityOfElementInFaceBody());
        Assert.assertEquals(getWomenPage().checkCorrectOfSortLowToHigh(), EXPECTED_COUNT_ITERATIONS_DURING_SORT);
    }

}
