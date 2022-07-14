package Day03;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import java.util.List;

public class XPathLearning {

    public static void main(String[] args) {
        // Get appium driver
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);

        try {
            // Find and click on nav login button
            MobileElement navLoginBtnElem = appiumDriver.findElement(MobileBy.AccessibilityId("Login"));
            navLoginBtnElem.click();

            // Cach 1: Find all matching elements
            List<MobileElement> credInputFieldElems = appiumDriver.findElements(MobileBy.xpath("//android.widget.EditText"));

            final int USERNAME_INDEX = 0;
            final int PASSWORD_INDEX = 1;

            // magic number
//            credInputFieldElems.get(0).sendKeys("email@yahoo.com");

            credInputFieldElems.get(USERNAME_INDEX).sendKeys("teo@sth.com");
            credInputFieldElems.get(PASSWORD_INDEX).sendKeys("12345678");
//
//            // Cach 2: find by text
            MobileElement emailInputElem = appiumDriver.findElement(MobileBy.xpath("//*[@text=\"Email\"]"));
            emailInputElem.sendKeys("123456");

            Thread.sleep(5000);

            // Cach 3:
            MobileElement loginInstructionElem =
                    appiumDriver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"When the device\")"));

            System.out.println(loginInstructionElem.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
