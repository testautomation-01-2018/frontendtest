package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalPage extends HelperPage {


    public PersonalPage(WebDriver driver){
        super(driver);
    }

    public WebElement saveProfileDetailsButton =
            driver.findElement(By.cssSelector(".button.form-button.is-primary"));

    public WebElement notification =
            driver.findElement(By.partialLinkText("Notification Settings"));

}
