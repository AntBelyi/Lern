package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage{

    public MenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//article[@class='feature']//a[contains(@href, 'peaksummer')]")
    private WebElement getFeatureFieldWithProduct;

    @FindBy(xpath = "//article[@id='product-14548647']")
    private WebElement getProductFieldToСheckout;

    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    private WebElement fieldToChooseSize;

    @FindBy(xpath = "//option[text()='S']")
    private WebElement getSizeOfProduct;

    @FindBy(xpath = "//a[@class='add-button']")
    private WebElement addToCartFieldButton;

    @FindBy(xpath = "//a[@data-testid='asoslogo']")
    private WebElement asosField;

    public void clickOnFeatureFieldWithProduct() {
        getFeatureFieldWithProduct.click();
    }

    public void clickOnProductFieldToСheckout() {
        getProductFieldToСheckout.click();
    }

    public void clickOnFieldToChooseSize() {
        fieldToChooseSize.click();
    }

    public void clickOnSizeOfProduct() {
        getSizeOfProduct.click();
    }

    public void clickOnAddToCartField() {
        addToCartFieldButton.click();
    }

    public WebElement getFieldToChooseSize() {
        return fieldToChooseSize;
    }

    public WebElement waitVisibilityProductFieldToСheckout() {
        return getProductFieldToСheckout;
    }
}
