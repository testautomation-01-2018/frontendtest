package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends HelperPage {
//    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public WebElement usernameInput = driver.findElement(By.id("usernameOrEmail"));

    public WebElement buttonContinue = driver.findElement(By.cssSelector(".button.form-button.is-primary"));


}
