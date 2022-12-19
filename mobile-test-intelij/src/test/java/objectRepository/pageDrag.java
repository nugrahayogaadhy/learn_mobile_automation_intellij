package objectRepository;

import org.openqa.selenium.By;

public class pageDrag {
    By robot_atas1 = By.xpath("//android.view.ViewGroup[@content-desc='drop-l1']/android.view.ViewGroup");
    By robot_atas2 = By.xpath("//android.view.ViewGroup[@content-desc='drop-c1']/android.view.ViewGroup");
    By robot_atas3 = By.xpath("//android.view.ViewGroup[@content-desc='drop-r1']/android.view.ViewGroup");
    By robot_atas4 = By.xpath("//android.view.ViewGroup[@content-desc='drop-l2']/android.view.ViewGroup");
    By robot_atas5 = By.xpath("//android.view.ViewGroup[@content-desc='drop-c2']/android.view.ViewGroup");
    By robot_atas6 = By.xpath("//android.view.ViewGroup[@content-desc='drop-r2']/android.view.ViewGroup");
    By robot_atas7 = By.xpath("//android.view.ViewGroup[@content-desc='drop-l3']/android.view.ViewGroup");
    By robot_atas8 = By.xpath("//android.view.ViewGroup[@content-desc='drop-c3']/android.view.ViewGroup");
    By robot_atas9 = By.xpath("//android.view.ViewGroup[@content-desc='drop-r3']/android.view.ViewGroup");

    By robot_bawah1 = By.xpath("//android.view.ViewGroup[@content-desc='drag-l1']/android.widget.ImageView");
    By robot_bawah2 = By.xpath("//android.view.ViewGroup[@content-desc='drag-c1']/android.widget.ImageView");
    By robot_bawah3 = By.xpath("//android.view.ViewGroup[@content-desc='drag-r1']/android.widget.ImageView");
    By robot_bawah4 = By.xpath("//android.view.ViewGroup[@content-desc='drag-l2']/android.widget.ImageView");
    By robot_bawah5 = By.xpath("//android.view.ViewGroup[@content-desc='drag-c2']/android.widget.ImageView");
    By robot_bawah6 = By.xpath("//android.view.ViewGroup[@content-desc='drag-r2']/android.widget.ImageView");
    By robot_bawah7 = By.xpath("//android.view.ViewGroup[@content-desc='drag-l3']/android.widget.ImageView");
    By robot_bawah8 = By.xpath("//android.view.ViewGroup[@content-desc='drag-c3']/android.widget.ImageView");
    By robot_bawah9 = By.xpath("//android.view.ViewGroup[@content-desc='drag-r4']/android.widget.ImageView");

    By getCongratulations = By.xpath("//android.view.ViewGroup[@content-desc='Drag-drop-screen']/android.widget.ImageView");
    By btn_retry = By.xpath("//android.view.ViewGroup[@content-desc='renew']");

    public By getBtn_retry() {
        return btn_retry;
    }

    public By getGetCongrat() {
        return getCongrat;
    }

    public void setBtn_retry(By btn_retry) {
        this.btn_retry = btn_retry;
    }

    public By getRobot_atas1() {return robot_atas1;}
    public By getRobot_atas2() {return robot_atas2;}
    public By getRobot_atas3() {return robot_atas3;}
    public By getRobot_atas4() {return robot_atas4;}
    public By getRobot_atas5() {return robot_atas5;}
    public By getRobot_atas6() {return robot_atas6;}
    public By getRobot_atas7() {return robot_atas7;}
    public By getRobot_atas8() {return robot_atas8;}
    public By getRobot_atas9() {return robot_atas9;}

    public By getRobot_bawah1() {return robot_bawah1;}
    public By getRobot_bawah2() {return robot_bawah2;}
    public By getRobot_bawah3() {return robot_bawah3;}
    public By getRobot_bawah4() {return robot_bawah4;}
    public By getRobot_bawah5() {return robot_bawah5;}
    public By getRobot_bawah6() {return robot_bawah6;}
    public By getRobot_bawah7() {return robot_bawah7;}
    public By getRobot_bawah8() {return robot_bawah8;}
    public By getRobot_bawah9() {return robot_bawah9;}

}
