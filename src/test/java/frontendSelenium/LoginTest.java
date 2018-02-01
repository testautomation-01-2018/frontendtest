package frontendSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import frontendSelenium.pages.*;

import static org.junit.Assert.assertTrue;

public class LoginTest extends ConfigFrontend {
    MainPage mainPage;
    LoginPage loginPage;
    PasswordPage passwordPage;
//    MainLoginPage mainLoginPage;

    @Test
    public void firstFrontendTest() {
        driver.get(baseUrl);
        WebElement title = driver.findElement(By.cssSelector("div.hp-hero__wrapper h1 span.no-widows"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));
        WebElement logo = driver.findElement(By.id("wpcom-logo"));
        WebElement getStartedTopBar = driver.findElement(By.className("menu-signup"));
        WebElement getStartedMain = driver.findElement(By.cssSelector("div.hp-hero__wrapper"))
                .findElement(By.className("is-cta"));
//        driver.findElement(By.cssSelector("div.hp-hero__wrapper a[title=\"Get Started\"]"));

        assertTrue(title.isDisplayed());
        assertTrue(loginButton.isDisplayed());
        assertTrue(logo.isDisplayed());
        assertTrue(getStartedTopBar.isDisplayed());
        assertTrue(getStartedMain.isDisplayed());
    }

    @Test
    public void testMainPage() {
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
        mainPage.isContentPage();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
        mainPage.loginButton.click();
        loginPage = new LoginPage(driver);
        loginPage.usernameInput.sendKeys(DataTest.userLogin);
        loginPage.buttonContinue.click();
        passwordPage = new PasswordPage(driver);
        passwordPage.passwordInput.sendKeys(DataTest.userPassword);
        passwordPage.buttonLogIn.click();
        Thread.sleep(3000);
        passwordPage.webWait(passwordPage.passwordInput, 15);
//        passwordPage.webWait(passwordPage.passwordInput);
//        mainLoginPage = new MainLoginPage(driver);
//        mainLoginPage.isContentPage();
    }
}
