package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WomenPage extends BasePage{

    public WomenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//span[text()='Clothing']")
    private WebElement clothingField;

    @FindBy(xpath = "//a[contains(@href, 'women/jeans')]")
    private WebElement jeansButtonInClothingField;

    @FindBy(xpath = "//nav[@class='_3EAPxMS']//span[text()='New in']")
    private WebElement newInField;

    @FindBy(xpath = "//a[contains(@href, '92&nlid=ww|new+in')]")
    private WebElement shoesButtonInNewInField;

    @FindBy(xpath = "//article[@id='product-20696147']")
    private WebElement getFieldWithProduct;

    @FindBy(xpath = "//div[@class='aside-action']//span[text()='Add to bag']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//span[contains(text(), 'colour and size')]")
    private WebElement fieldWithWarn;

    @FindBy(xpath = "//div[text()='Sort']")
    private WebElement sortField;

    @FindBy(xpath = "//label[text()='Price high to low']")
    private WebElement kindOfSortINSortFieldHighToLow;

    @FindBy(xpath = "//span[@class='_16nzq18']")
    private List<WebElement> pricesOfShoes;

    @FindBy(xpath = "//a[contains(@href, '2426&nlid=ww|new+in|')]")
    private WebElement faceBodyButtonInNewInField;

    @FindBy(xpath = "//label[text()='Price low to high']")
    private WebElement kindOfSortINSortFieldLowToHigh;

    @FindBy(xpath = "//a[contains(@href, 'vapormax-2020')]")
    private WebElement visibilityOfElementOfBoots;

    @FindBy(xpath = "//a[contains(@href, 'marvis-karakum')]")
    private WebElement visibilityOfElementInFaceBody;

    public void clickOnClothingField() {
        clothingField.click();
    }

    public void clickOnClothingJeansField() {
        jeansButtonInClothingField.click();
    }

    public void clickOnFieldWithProduct() {
        getFieldWithProduct.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public String getTextFromFieldWithWarn() {
        return fieldWithWarn.getText();
    }

    public WebElement waitForAddToCartVisibility() {
        return addToCartButton;
    }

    public void clickOnNewInInField() {
        newInField.click();
    }

    public void clickOnShoesButtonInNewInField() {
        shoesButtonInNewInField.click();
    }

    public void clickOnSortField() {
        sortField.click();
    }

    public void clickOnKindOfSortINSortField() {
        kindOfSortINSortFieldHighToLow.click();
    }

    public List<WebElement> getAmountOfPrices() {
        return pricesOfShoes;
    }

    public double checkCorrectOfSortHighToLow() {
        double result = 0;
        for (int i = 1;i < getAmountOfPrices().size();i++) {
            double firstPrice = Double.parseDouble(getAmountOfPrices().get(i - 1).getText().substring(1));
            double nextPrice = Double.parseDouble(getAmountOfPrices().get(i).getText().substring(1));
            if(firstPrice >= nextPrice) {
                result++;
            }
        }
        return result;
    }

    public void clickOnFaceBodyButtonInNewInField() {
        faceBodyButtonInNewInField.click();
    }

    public void clickOnKindOfSortINSortFieldLowToHigh() {
        kindOfSortINSortFieldLowToHigh.click();
    }

    public double checkCorrectOfSortLowToHigh() {
        double result = 0;
        for(int i = 1;i < getAmountOfPrices().size();i++) {
            double firstPrice = Double.parseDouble(getAmountOfPrices().get(i - 1).getText().substring(1));
            double nextPrice = Double.parseDouble(getAmountOfPrices().get(i).getText().substring(1));
            if(firstPrice <= nextPrice) {
                result++;
            }
        }
        return result;
    }

    public WebElement waitVisibilityOfElementOfBoots() {
        return visibilityOfElementOfBoots;
    }

    public WebElement waitVisibilityOfElementInFaceBody() {
        return visibilityOfElementInFaceBody;
    }

    public WebElement waitVisibilityOfSortField() {
        return sortField;
    }

}
