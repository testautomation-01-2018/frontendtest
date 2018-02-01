package jsystems.cucumberTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "classpath:jsystems",
        plugin = {"html:target/cucumber-html-report"
                ,
                "rerun:target/rerun.txt"
        },
        tags = {
                "@Login"
//                "@Notification"
        }
)
public class RunTests {
}
