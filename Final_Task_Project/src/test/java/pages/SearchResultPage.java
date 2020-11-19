package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//article[@id='product-12647633']")
    private WebElement getElementOfBoots;

    @FindBy(xpath = "//div[@class='aside-action']//span[text()='Add to bag']")
    private WebElement addToBagButton;

    @FindBy(xpath = "//div[@id='product-size']")
    private WebElement getSizeButtonField;

    @FindBy(xpath = "//option[text()='EU 37']")
    private WebElement selectSizeButton;

    @FindBy(xpath = "//a[@icon='_33Vi078']")
    private WebElement elementForGetTextAfterAddItToCart;

    @FindBy(xpath = "//article[@id='product-13914698']//span[@class='_30BqGyh']")
    private WebElement addToFavoritesButtonOfTheProduct;

    @FindBy(xpath = "//article[@id='product-13914698']//p[contains(text(), 'adidas Originals reversible')]")
    private WebElement textOfHatInSearchResultPage;

    @FindBy(xpath = "//a[@icontype='heartUnfilled']")
    private WebElement favoritesButton;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheElementOfBoots() {
        getElementOfBoots.click();
    }


    public void clickOnSelectSizeButton() {
        getSizeButtonField.click();
    }

    public void clickOnSizeButton() {
        selectSizeButton.click();
    }

    public void clickOnAddToCartButton() {
        addToBagButton.click();
    }

    public String getTextFromCartField() {
        return elementForGetTextAfterAddItToCart.getText();
    }

    public void clickOnAddToFavoritesButton() {
        addToFavoritesButtonOfTheProduct.click();
    }

    public String getTextOfHatInSearchResultPage() {
        return textOfHatInSearchResultPage.getText();
    }

    public void clickOnFavoritesButton() {
        favoritesButton.click();
    }


}
