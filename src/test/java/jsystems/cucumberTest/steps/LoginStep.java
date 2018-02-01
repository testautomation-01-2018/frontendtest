package jsystems.cucumberTest.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frontendSelenium.pages.DataTest;
import frontendSelenium.pages.PasswordPage;
import jsystems.cucumberTest.ConfigSteps;
import jsystems.cucumberTest.pages.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginStep {
    WebDriver driver;

    MainPage mainPage;
    LoginPage loginPage;
    PasswordPage passwordPage;
    MainPersonalPage mainPersonalPage;
    PersonalPage personalPage;
    NotificationPage notificationPage;

    public LoginStep(ConfigSteps configSteps){
        try {
            driver = configSteps.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Given("^User jest na wordpress website \"(.*)\"$")
    public void userJestNaWordpressWebsite(String website){
        driver.get(website);
        mainPage = new MainPage(driver);
        assertTrue(mainPage.logIn.isDisplayed());
    }

    @When("^User clicks to login button$")
    public void userClicksToLoginButton() throws Throwable {
        mainPage.logIn.click();
    }

    @Then("^User is on first login page$")
    public void userIsOnFirstLoginPage() throws Throwable {
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.buttonContinue.isDisplayed());
    }

    @When("^User enter login and press <Continue>$")
    public void userEnterLoginAndPressContinue() throws Throwable {
        loginPage.usernameInput.sendKeys(DataTest.userLogin);
        loginPage.buttonContinue.click();
    }

    @Then("^User is on password page$")
    public void userIsOnPasswordPage() throws Throwable {
       passwordPage = new PasswordPage(driver);
       assertTrue(passwordPage.buttonLogIn.isDisplayed());
    }

    @When("^User enter password and press <LogIn>$")
    public void userEnterPasswordAndPressLogIn() throws Throwable {
       passwordPage.passwordInput.sendKeys(DataTest.userPassword);
       passwordPage.buttonLogIn.click();
    }

    @Then("^User is on main login page$")
    public void userIsOnMainLoginPage() throws Throwable {
        mainPersonalPage = new MainPersonalPage(driver);

    }

    @When("^User press avatar$")
    public void userPressAvatar() throws Throwable {
        mainPersonalPage.avatar.click();
    }

    @Then("^user is on personal page$")
    public void userIsOnPersonalPage() throws Throwable {
        personalPage = new PersonalPage(driver);
        assertTrue(personalPage.notification.isDisplayed());
        assertFalse(personalPage.saveProfileDetailsButton.isEnabled());
    }

    @When("^User clicks notification link$")
    public void userClicksNotificationLink() throws Throwable {
        personalPage.notification.click();
    }

    @Then("^User is on notification page$")
    public void userIsOnNotificationPage() throws Throwable {
        notificationPage = new NotificationPage(driver);
        assertTrue(notificationPage.firstCheckbox.isSelected());
    }

    @When("^User clicks checkbox$")
    public void userClicksCheckbox() throws Throwable {
        notificationPage.firstCheckbox.click();
    }

    @Then("^Checkbox is unselected$")
    public void checkboxIsUnselected() throws Throwable {
        assertFalse(notificationPage.firstCheckbox.isSelected());
        notificationPage.firstCheckbox.click();

    }
}
