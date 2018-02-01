
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonFileIDE {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

//  @BeforeClass
//  public static void setupClass(){
//    WebDriverManager.chromedriver().setup();
//  }
//
//  @Before
//  public void setUp() throws Exception {
//    driver = new ChromeDriver();
//    baseUrl = "https://www.katalon.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://wordpress.com/");
    driver.findElement(By.id("navbar-login-link")).click();
    driver.findElement(By.id("usernameOrEmail")).clear();
    driver.findElement(By.id("usernameOrEmail")).sendKeys("automation012018@wp.pl");
    driver.findElement(By.cssSelector("button.button.form-button.is-primary")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Bimbajlo1@");
    driver.findElement(By.cssSelector("button.button.form-button.is-primary")).click();
    driver.findElement(By.cssSelector("img.gravatar")).click();
    driver.findElement(By.xpath("//div[@id='secondary']/ul/li/ul/li[5]/a/span")).click();
    driver.findElement(By.xpath("(//input[@value='on'])[8]")).click();
    driver.findElement(By.cssSelector("button.button.form-button.is-primary")).click();
    driver.findElement(By.cssSelector("span.notice__dismiss > svg.gridicon.gridicons-cross")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
