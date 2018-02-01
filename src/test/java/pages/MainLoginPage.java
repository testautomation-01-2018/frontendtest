package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainLoginPage extends BasePage {

    WebDriver driver;

    public MainLoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy()
//    public WebElement


    public boolean isContentPage(){

        return true;
    }


}
