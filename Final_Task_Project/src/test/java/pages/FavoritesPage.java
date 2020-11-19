package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavoritesPage extends BasePage{

    @FindBy(xpath = "//p[contains(text(), 'adidas Originals reversible')]")
    private WebElement textOfHatInFavoritesPage;

    @FindBy(xpath = "//button[text()='Move to bag']")
    private WebElement moveToBagButton;

    @FindBy(xpath = "//a[text()='adidas Originals reversible bucket hat with outline trefoil']")
    private WebElement textOFElementAfterAddItFromFavoritesToCart;

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfHatInFavoritesPage() {
        return textOfHatInFavoritesPage.getText();
    }

    public WebElement getWayToTextOfHatInFavoritesPage() {
        return textOfHatInFavoritesPage;
    }

    public void clickMoveToBagButton() {
        moveToBagButton.click();
    }

    public String gettextOFElementAfterAddItFromFavoritesToCart() {
        return textOFElementAfterAddItFromFavoritesToCart.getText();
    }

    public WebElement waitForTextOFElementAfterAddItFromFavoritesToCart() {
        return textOFElementAfterAddItFromFavoritesToCart;
    }
}
