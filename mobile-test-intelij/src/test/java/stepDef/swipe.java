package stepDef;
import config.env;
import io.cucumber.java.en.And;
import objectRepository.pageSwipe;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class swipe extends hooks {
    pageSwipe pageSwipe = new pageSwipe();

    @And("user click on Js foundation menu")
    public void user_click_on_js_foundation_menu() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageSwipe.getPage_swipe())
        );
        driver.findElement(pageSwipe.getScroll_toJsFoundation()).click();
    }

    @And("user found robot")
    public void user_found_robot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(pageSwipe.getPage_swipe())
        );
        driver.findElement(pageSwipe.getScroll_toRobot());
        driver.findElement(pageSwipe.getIcon_robot()).isDisplayed();
    }
}
