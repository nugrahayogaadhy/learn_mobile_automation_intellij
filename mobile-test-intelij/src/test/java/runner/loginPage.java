package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/loginPage.feature",
        glue = "stepDef",
        plugin = {"html:target/HTML_reportlogin.html"}
)
public class loginPage {


}
