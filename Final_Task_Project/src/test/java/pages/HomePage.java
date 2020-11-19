package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='chrome-search']")
    private WebElement searchInputField;

    @FindBy(xpath = "//span[@type='bagFilled']")
    private WebElement getCartField;

    @FindBy(xpath="//a[@data-testid='men-floor']")
    private WebElement getMenField;

    @FindBy(xpath = "//a[@icon='_33Vi078']")
    private WebElement cartField;

    @FindBy(xpath = "//a[@class='_1TlOB9h _2tvh469 _12h15d-']")
    private WebElement viewBagButtonInCart;

    @FindBy(xpath = "//button[@class='bag-item-remove']")
    private WebElement deleteButtonInCart;

    @FindBy(xpath = "//h2[text()='Your bag is empty']")
    private WebElement textInEmptyCart;

    @FindBy(xpath = "//a[@data-testid='women-floor']")
    private WebElement womenField;

    @FindBy(xpath = "//button[@aria-label='My Account']")
    private WebElement myAccountField;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    private WebElement signInButtonInMyAccountField;

    @FindBy(xpath = "//a[@data-testid='signup-link']")
    private WebElement joinButtonInMyAccountField;

    @FindBy(xpath = "//img[contains(@src, 'nike-hp-logos')]")
    private WebElement nikeFieldAtBottomOfPage;

    public void enterWordIntoSearchInputField(String keyWord) {
        searchInputField.sendKeys(keyWord, Keys.ENTER);
    }

    public WebElement getCartField() {
        return getCartField;
    }

    public void clickOnTheMenField() {
        getMenField.click();
    }

    public void clickOnCartField() {
        cartField.click();
    }

    public WebElement waitVisibilityClickOnCartField() {
        return cartField;
    }

    public void clickOnViewBagButtonInCart() {
        viewBagButtonInCart.click();
    }

    public void clickOnDeleteButtonInCart() {
        deleteButtonInCart.click();
    }

    public WebElement getDeleteButtonInCart() {
        return deleteButtonInCart;
    }

    public String getTextInEmptyCart() {
        return textInEmptyCart.getText();
    }

    public WebElement waitForTextInEmptyCart() {
        return textInEmptyCart;
    }

    public void clickOnWomenField() {
        womenField.click();
    }

    public void clickOnMyAccountField() {
        myAccountField.click();
    }

    public void clickOnSignInInMyAccountField() {
        signInButtonInMyAccountField.click();
    }

    public WebElement getSignInInMyAccountField() {
        return  signInButtonInMyAccountField;
    }

    public void clickOnJoinInMyAccountField() {
        joinButtonInMyAccountField.click();
    }

    public WebElement waitForVisibilityViewBagButtonInCart() {
        return viewBagButtonInCart;
    }

    public void clickOnNikeFieldAtBottomOfPage() {
        nikeFieldAtBottomOfPage.click();
    }

    public WebElement waitVisibilityOfNikeFieldAtBottomOfPage() {
        return nikeFieldAtBottomOfPage;
    }
}
