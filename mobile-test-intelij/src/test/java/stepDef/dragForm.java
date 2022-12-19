package stepDef;

import io.cucumber.java.en.And;
import objectRepository.pageDrag;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import objectRepository.pageLogin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class dragForm extends hooks{
    pageDrag pageDrag = new pageDrag();
    TouchAction touch = new TouchAction(driver);

    @And("user access drag page")
    public void user_access_drag_page() throws InterruptedException
    {
        WebElement bawah1 = driver.findElement(pageDrag.getRobot_atas1());
        WebElement atas1 = driver.findElement(pageDrag.getRobot_bawah1());
        touch.longPress(longPressOptions().withElement(element(bawah1)).withDuration(ofSeconds(10))).moveTo(element(atas1)).release().perform();

        WebElement bawah2 = driver.findElement(pageDrag.getRobot_atas2());
        WebElement atas2 = driver.findElement(pageDrag.getRobot_bawah2());
        touch.longPress(longPressOptions().withElement(element(bawah2)).withDuration(ofSeconds(10))).moveTo(element(atas2)).release().perform();

        WebElement bawah3 = driver.findElement(pageDrag.getRobot_atas3());
        WebElement atas3 = driver.findElement(pageDrag.getRobot_bawah3());
        touch.longPress(longPressOptions().withElement(element(bawah3)).withDuration(ofSeconds(10))).moveTo(element(atas3)).release().perform();

        WebElement bawah4 = driver.findElement(pageDrag.getRobot_atas4());
        WebElement atas4 = driver.findElement(pageDrag.getRobot_bawah4());
        touch.longPress(longPressOptions().withElement(element(bawah4)).withDuration(ofSeconds(10))).moveTo(element(atas4)).release().perform();

        WebElement bawah5 = driver.findElement(pageDrag.getRobot_atas5());
        WebElement atas5 = driver.findElement(pageDrag.getRobot_bawah5());
        touch.longPress(longPressOptions().withElement(element(bawah5)).withDuration(ofSeconds(10))).moveTo(element(atas5)).release().perform();

        WebElement bawah6 = driver.findElement(pageDrag.getRobot_atas6());
        WebElement atas6 = driver.findElement(pageDrag.getRobot_bawah6());
        touch.longPress(longPressOptions().withElement(element(bawah6)).withDuration(ofSeconds(10))).moveTo(element(atas6)).release().perform();

        WebElement bawah7 = driver.findElement(pageDrag.getRobot_atas7());
        WebElement atas7 = driver.findElement(pageDrag.getRobot_bawah7());
        touch.longPress(longPressOptions().withElement(element(bawah7)).withDuration(ofSeconds(10))).moveTo(element(atas7)).release().perform();

        WebElement bawah8 = driver.findElement(pageDrag.getRobot_atas8());
        WebElement atas8 = driver.findElement(pageDrag.getRobot_bawah8());
        touch.longPress(longPressOptions().withElement(element(bawah8)).withDuration(ofSeconds(10))).moveTo(element(atas8)).release().perform();

        WebElement bawah9 = driver.findElement(pageDrag.getRobot_atas9());
        WebElement atas9 = driver.findElement(pageDrag.getRobot_bawah9());
        touch.longPress(longPressOptions().withElement(element(bawah9)).withDuration(ofSeconds(10))).moveTo(element(atas9)).release().perform();

        Thread.sleep(30);
        driver.findElement(pageDrag.getGetCongrat()).isDisplayed();
        driver.findElement(pageDrag.getBtn_retry()).click();
    }

    @And("user drag and drop")
    public void user_drag_and_drop()
        {

        }


}

