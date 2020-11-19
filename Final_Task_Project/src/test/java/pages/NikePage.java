package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NikePage extends BasePage{

    @FindBy(xpath = "//a[text()='Load more']")
    private WebElement loadMoreField;

    @FindBy(xpath = "//a[@class='_3TqU78D']")
    private List<WebElement> elementsAfterClickLoadMoreButton;

    @FindBy(xpath = "//article[@id='product-21391752']")
    private WebElement visibilityOfProduct;

    public NikePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoadMoreField() {
        loadMoreField.click();
    }

    public int getAmountOfElementsAfterClickLoadMoreButton() {
        return elementsAfterClickLoadMoreButton.size();
    }

    public WebElement waitForVisibilityElementAfterClickLoadMoreButton() {
        return visibilityOfProduct;
    }
}
