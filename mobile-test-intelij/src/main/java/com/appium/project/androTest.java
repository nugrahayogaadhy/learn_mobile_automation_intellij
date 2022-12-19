package com.appium.project;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class androTest {
    public static AppiumDriver driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "realme RMX3501");
        capabilities.setCapability("udid", "0962218S2210460E");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
//        capabilities.setCapability("app","/Users/azarine/Downloads/Android-NativeDemoApp-0.4.0.apk");
//       capabilities.setCapability("appPackage", "com.foody.vn.activity");
//       capabilities.setCapability("appActivity", "com.foody.vn.activity.MainActivity");
        capabilities.setCapability("appPackage", "com.wdiodemoapp");
        capabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);

    }
}
