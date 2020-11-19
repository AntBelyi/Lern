package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath = "//span[@class='qa-password-validation field-validation-error']")
    private WebElement textFromWarnField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement joinAsosButtonInJoinPage;

    @FindBy(xpath = "//span[contains(@class, 'field-validation-error')]")
    private List<WebElement> amountWarnFieldsInJoinPage;

    public void enterEmailIntoEmailField(String email) {
        emailField.sendKeys(email, Keys.ENTER);
    }

    public String getTextFromWarnFieldInLoginPage() {
        return textFromWarnField.getText();
    }

    public WebElement waitVisibilityJoinAsosButtonInJoinPage() {
        return joinAsosButtonInJoinPage;
    }

    public void clickOnJoinAsosButtonInJoinPage() {
        joinAsosButtonInJoinPage.click();
    }

    public int getAmountOfWarnFieldsInJoinPage() {
        return amountWarnFieldsInJoinPage.size();
    }

}
