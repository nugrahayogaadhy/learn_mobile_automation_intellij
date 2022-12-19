package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {
    By txt_inputEmail = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By txt_inputPass = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By btn_login = By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']");
    By login_page = By.xpath("//android.widget.ScrollView[@content-desc='Login-screen']/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]");
    By successlogin = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    By successsign = By.id("android:id/button1");
    By succlogin = By.id("android:id/parentPanel");

    By signup_page = By.xpath("//android.view.ViewGroup[@content-desc='button-sign-up-container']/android.view.ViewGroup");
    By txt_signEmail = By.xpath("//android.widget.EditText[@content-desc='input-email']");
    By txt_signPass = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    By txt_signConfirm = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    By btn_signup = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']");

    public By getSucclogin() {return succlogin;}

    public By getTxt_inputEmail() {return txt_inputEmail;}
    public By getTxt_inputPass() {return txt_inputPass;}
    public By getLogin_page() {return login_page;}
    public By getBtn_login() {return btn_login;}
    public By getSuccesslogin() {return successlogin;}

    public By getSignup_page() {return signup_page;}
    public By getTxt_signEmail() {return txt_signEmail;}
    public By getTxt_signPass() {return txt_signPass;}
    public By getTxt_signConfirm() {return txt_signConfirm;}
    public By getBtn_signup() {return btn_signup;}
}
