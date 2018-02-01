package frontendSelenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BasePage {

    WebDriver driver;

    public PasswordPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".button.form-button.is-primary")
    public WebElement buttonLogIn;


}
