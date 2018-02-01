import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.DataTest;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class ConfigFrontend {

    public WebDriver driver;
    public String baseUrl;

    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        baseUrl = DataTest.baseUrl;
//        if(driver == null){
            driver = new ChromeDriver(chromeOptions);
//            driver = new FirefoxDriver();
//        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        String verificationErrorString = verificationErrors.toString();
        if(!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        driver.quit();
        }
        driver.close();
//        driver = null;
    }





}
