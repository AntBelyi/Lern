package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToFavoritesTests extends BaseTests {

    private static final int AMOUNT_SECONDS_FOR_WAIT = 30;
    private static final String SEARCH_KEYWORD_FOR_HAT = "hat";

    @Test(priority = 8)
    public void checkThatProductCanBeAddedToFavorites() {
        getHomePage().enterWordIntoSearchInputField(SEARCH_KEYWORD_FOR_HAT);
        getBasePage().waitForPageReadyState(AMOUNT_SECONDS_FOR_WAIT);
        String textOfHatInSearchResultPage = getSearchResultPage().getTextOfHatInSearchResultPage();
        getSearchResultPage().clickOnAddToFavoritesButton();
        getSearchResultPage().clickOnFavoritesButton();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getFavoritesPage().getWayToTextOfHatInFavoritesPage());
        Assert.assertEquals(textOfHatInSearchResultPage, getFavoritesPage().getTextOfHatInFavoritesPage());
    }

    @Test(priority = 9)
    public void checkThatProductCanBeAddToCartFromFavorites() {
        getHomePage().enterWordIntoSearchInputField(SEARCH_KEYWORD_FOR_HAT);
        getBasePage().waitForPageReadyState(AMOUNT_SECONDS_FOR_WAIT);
        getSearchResultPage().clickOnAddToFavoritesButton();
        getSearchResultPage().clickOnFavoritesButton();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getFavoritesPage().getWayToTextOfHatInFavoritesPage());
        String textOfHatInFavoritesPage = getFavoritesPage().getTextOfHatInFavoritesPage();
        getFavoritesPage().clickMoveToBagButton();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().getCartField());
        getHomePage().clickOnCartField();
        getBasePage().waitForElementToBeClickable(AMOUNT_SECONDS_FOR_WAIT, getHomePage().waitForVisibilityViewBagButtonInCart());
        getHomePage().clickOnViewBagButtonInCart();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getFavoritesPage().waitForTextOFElementAfterAddItFromFavoritesToCart());
        Assert.assertEquals(textOfHatInFavoritesPage, getFavoritesPage().gettextOFElementAfterAddItFromFavoritesToCart());
    }
}
