package Day02;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormInteraction {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);

        try {
            // TODO: Click Form button, input field, Switch, select Dropdown

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
