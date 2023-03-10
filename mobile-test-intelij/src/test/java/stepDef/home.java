package stepDef;

import config.env;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepository.pageHome;
import java.net.MalformedURLException;
import java.net.URL;


public class home extends hooks{
    pageHome pageHome = new pageHome();

    @Given("user is on app home")
    public void user_is_on_app_home() throws MalformedURLException {
        before();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageHome.getPage_home())
        );
    }
    @When("user access form page")
    public void user_access_form_page() {
        driver.findElement(pageHome.getBtn_form()).click();
    }

    @When("user access swipe page")
    public void user_access_swipe_page() {
        driver.findElement(pageHome.getBtn_swipe()).click();
    }

    @When("user access form login")
    public void user_access_form_login() {
        driver.findElement(pageHome.getBtn_login()).click();
    }

}