package stepDef;

import config.env;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hooks extends env{
    public void before () throws MalformedURLException {
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

        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, duration);
    }

    @After
    public void after(){
        driver.quit();
    }

}
