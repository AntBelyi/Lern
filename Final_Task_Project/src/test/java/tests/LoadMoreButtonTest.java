package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoadMoreButtonTest extends BaseTests{

    private static final int AMOUNT_SECONDS_FOR_WAIT = 30;
    private static final int EXPECTED_AMOUNT_OF_ELEMENTS_AFTER_CLICK_LOAD_MORE_BUTTON = 144;

    @Test(priority = 10)
    public void checkThatLoadMoreButtonCorrectWork() {
        getHomePage().clickOnTheMenField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().waitVisibilityOfNikeFieldAtBottomOfPage());
        getHomePage().clickOnNikeFieldAtBottomOfPage();
        getBasePage().waitForPageReadyState(AMOUNT_SECONDS_FOR_WAIT);
        getNikePage().clickOnLoadMoreField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getNikePage().waitForVisibilityElementAfterClickLoadMoreButton());
        Assert.assertEquals(getNikePage().getAmountOfElementsAfterClickLoadMoreButton(), EXPECTED_AMOUNT_OF_ELEMENTS_AFTER_CLICK_LOAD_MORE_BUTTON);
    }

}
