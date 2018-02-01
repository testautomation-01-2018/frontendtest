package jsystems.cucumberTest.pages;

import gherkin.lexer.He;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationPage extends HelperPage{

    public NotificationPage(WebDriver driver){
        super(driver);
    }

    public WebElement firstCheckbox =
            driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[3]/div/div[1]/div[2]/div[2]/ul/li[1]/input"));

}
