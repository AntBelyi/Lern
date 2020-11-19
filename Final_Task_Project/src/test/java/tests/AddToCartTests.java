package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTests extends BaseTests {

    private static final String SEARCH_KEYWORD_FOR_BOOTS = "boots";
    private static final int AMOUNT_SECONDS_FOR_WAIT = 30;
    private static final String EXPECTED_AMOUNT_OF_ELEMENTS_IN_CART = "1";
    private static final String EXPECTED_TEXT_IN_EMPTY_CART = "Your bag is empty";
    private static final String EXPECTED_TEXT_FROM_FIELD_WITH_WARN = "Please select from the available colour and size options";

    @Test(priority = 2)
    public void addElementToCartAndCheckThatElementWasAdded() {
        getHomePage().enterWordIntoSearchInputField(SEARCH_KEYWORD_FOR_BOOTS);
        getBasePage().implicitlyWaiter(AMOUNT_SECONDS_FOR_WAIT);
        getSearchResultPage().clickOnTheElementOfBoots();
        getSearchResultPage().clickOnSelectSizeButton();
        getSearchResultPage().clickOnSizeButton();
        getSearchResultPage().clickOnAddToCartButton();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().getCartField());
        Assert.assertEquals(getSearchResultPage().getTextFromCartField(), EXPECTED_AMOUNT_OF_ELEMENTS_IN_CART);
    }

    @Test(priority = 1)
    public void checkThatCartCanBeCleaned() {
        getHomePage().clickOnTheMenField();
        getBasePage().waitForPageReadyState(AMOUNT_SECONDS_FOR_WAIT);
        getMenPage().clickOnFeatureFieldWithProduct();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getMenPage().waitVisibilityProductFieldToСheckout());
        getMenPage().clickOnProductFieldToСheckout();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getMenPage().getFieldToChooseSize());
        getMenPage().clickOnFieldToChooseSize();
        getMenPage().clickOnSizeOfProduct();
        getMenPage().clickOnAddToCartField();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().waitVisibilityClickOnCartField());
        getHomePage().clickOnCartField();
        getHomePage().clickOnViewBagButtonInCart();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().getDeleteButtonInCart());
        getHomePage().clickOnDeleteButtonInCart();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getHomePage().waitForTextInEmptyCart());
        Assert.assertEquals(getHomePage().getTextInEmptyCart(), EXPECTED_TEXT_IN_EMPTY_CART);
    }

    @Test(priority = 3)
    public void checkThatCanNotAddElementToCartWithoutChooseSize() {
        getHomePage().clickOnWomenField();
        getBasePage().implicitlyWaiter(AMOUNT_SECONDS_FOR_WAIT);
        getWomenPage().clickOnClothingField();
        getWomenPage().clickOnClothingJeansField();
        getWomenPage().clickOnFieldWithProduct();
        getBasePage().waitForElementVisibility(AMOUNT_SECONDS_FOR_WAIT, getWomenPage().waitForAddToCartVisibility());
        getWomenPage().clickOnAddToCartButton();
        Assert.assertTrue(getWomenPage().getTextFromFieldWithWarn().contains(EXPECTED_TEXT_FROM_FIELD_WITH_WARN));
    }

}
