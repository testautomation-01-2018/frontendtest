package frontendSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class MainPage extends BasePage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.hp-hero__wrapper h1 span.no-widows")
    public WebElement titleMainPage;
    //    WebElement title = driver.findElement(By.cssSelector("div.hp-hero__wrapper h1 span.no-widows"));

    @FindBy(xpath = "//*[@id=\"navbar-login-link\"]")
    public WebElement loginButton;
//    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));

    @FindBy(id = "wpcom-logo")
    public WebElement logo;
//    WebElement logo = driver.findElement(By.id("wpcom-logo"));

    @FindBy(className = "menu-signup")
    public WebElement getStartedTopBar;
//    WebElement getStartedTopBar = driver.findElement(By.className("menu-signup"));

    @FindBy(css = "div.hp-hero__wrapper .is-cta")
    public WebElement getStartedMain;
//    WebElement getStartedMain = driver.findElement(By.cssSelector("div.hp-hero__wrapper"))
//            .findElement(By.className("is-cta"));


    public boolean isContentPage() {
        assertTrue(driver.getTitle().equals(DataTest.wordpressTitle));
        assertTrue(titleMainPage.isDisplayed());
        assertTrue(titleMainPage.getText().equals(DataTest.titleMainPage));
        assertTrue(loginButton.isDisplayed());
        return true;
    }
}
