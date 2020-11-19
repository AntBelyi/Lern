package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.*;

public class BaseTests {

    WebDriver driver;

    private static final String ASOS_URL = "https://www.asos.com/women/";

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @BeforeTest
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ASOS_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public BasePage getBasePage() {
        return new BasePage(getDriver());
    }

    public MenPage getMenPage() {
        return new MenPage(getDriver());
    }

    public WomenPage getWomenPage() {
        return new WomenPage(getDriver());
    }

    public LoginPage getLoginPage() {
        return new LoginPage(getDriver());
    }

    public FavoritesPage getFavoritesPage() {
        return new FavoritesPage(getDriver());
    }

    public NikePage getNikePage() {
        return new NikePage(getDriver());
    }

}
