package stepDef;

import io.cucumber.java.en.And;
import objectRepository.pageForm;
import objectRepository.pageLogin;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class loginForm extends hooks{
    pageLogin pageLogin = new pageLogin();

    @And("user click on sign login")
    public void user_click_on_sign_login() {
        wait.until( ExpectedConditions.visibilityOfElementLocated(pageLogin.getLogin_page())
        );
    }
    @And("user fill input email login")
    public void user_fill_input_email_login() {
        wait.until( ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_inputEmail())
        );
        String inputEmail = "ituiniiniitu13@gmail.com";
        driver.findElement(pageLogin.getTxt_inputEmail()).sendKeys(inputEmail);
    }
    @And("user fill password login")
    public void user_fill_password_login() {
        driver.findElement(pageLogin.getTxt_inputEmail()).click();
        wait.until( ExpectedConditions.visibilityOfElementLocated(pageLogin.getTxt_inputPass())
        );
        String inputPass = "123456789";
        driver.findElement(pageLogin.getTxt_inputEmail()).sendKeys(inputPass);
    }
    @And("user click on login button")
    public void user_click_on_login_button() {
        wait.until( ExpectedConditions.visibilityOfElementLocated(pageLogin.getBtn_login())
        );
        driver.findElement(pageLogin.getBtn_login()).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(pageLogin.getSucclogin()));
        driver.findElement(pageLogin.getSuccesslogin()).click();
    }

}

