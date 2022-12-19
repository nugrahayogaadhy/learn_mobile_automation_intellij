package objectRepository;

import org.openqa.selenium.By;

public class pageForm {
    By txt_input = By.xpath("//android.widget.EditText[@content-desc='text-input']");
    By txt_inputResult = By.xpath("//android.widget.TextView[@content-desc='input-text-result']");
    By btn_switch = By.xpath("//android.widget.Switch[@content-desc='switch']");

    By btn_dropdown = By.xpath("//android.view.ViewGroup[@content-desc='Dropdown']");

    By btn_dropdownOptions = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']");

    By btn_active = By.xpath("//android.view.ViewGroup[@content-desc='button-Active']");

    By btn_okOnModal = By.id("android:id/button1");

    By btn_ok = By.xpath("//android.widget.Button[3]");
//     resource-id ="android:id/button1"
    By Btn_askMe = By.id("android:id/button3");

    public By getTxt_input() {
        return txt_input;
    }

    public By getTxt_inputResult() {
        return txt_inputResult;
    }

    public By getBtn_switch() {
        return btn_switch;
    }

    public By getBtn_dropdown() {
        return btn_dropdown;
    }

    public By getBtn_dropdownOptions() {
        return btn_dropdownOptions;
    }

    public By getBtn_active() {
        return btn_active;
    }

    public By getBtn_okOnModal() {
        return btn_okOnModal;
    }

    public By getBtn_askMe() {
        return Btn_askMe;
    }

    public By getBtn_ok() {
        return btn_ok;
    }
}
