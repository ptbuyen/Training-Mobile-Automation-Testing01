package Day01;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LaunchApp {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = null;
        Exception exception = null;

        try {
            // Desired Capabilities
            DesiredCapabilities desiredCaps = new DesiredCapabilities();
            desiredCaps.setCapability("platformName", "Android");
            desiredCaps.setCapability("automationName", "uiautomator2");
            desiredCaps.setCapability("udid", "emulator-5554");
//            desiredCaps.setCapability("udid", "8UEDU17C08002008");
//            desiredCaps.setCapability("appPackage", "com.hahalolo.android.halome");
//            desiredCaps.setCapability("appActivity", "com.halo.presentation.startapp.start.StartAct");
            desiredCaps.setCapability("appPackage", "com.wdiodemoapp");
            desiredCaps.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

            // Init appium session
            URL appiumServer = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AndroidDriver<MobileElement>(appiumServer, desiredCaps);

            // Click on Login button
            MobileElement loginBtnElem = appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
            loginBtnElem.click();

            Thread.sleep(3000);

            // Input email
            MobileElement emailInputElem = appiumDriver.findElement(MobileBy.AccessibilityId("input-email"));
            emailInputElem.sendKeys("uyen@yahoo.com");

            // Input password
            MobileElement pwdInputElem = appiumDriver.findElement(MobileBy.AccessibilityId("input-password"));
            pwdInputElem.sendKeys("12345678");
            Thread.sleep(3000);

            MobileElement loginSubmitBtnElem = appiumDriver.findElement(MobileBy.AccessibilityId("button-LOGIN"));
            loginSubmitBtnElem.click();


        } catch (Exception e) {
            exception = e;
        }

        if (appiumDriver == null) {
            throw new RuntimeException(exception.getMessage());
        }

    }
}
