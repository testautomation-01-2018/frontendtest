package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPersonalPage extends HelperPage {

    public MainPersonalPage(WebDriver driver){
        super(driver);
    }

    public WebElement avatar = driver.findElement(By.cssSelector(".masterbar__item.masterbar__item-me"));
}
