package Day02;

import driver.DriverFactory;
import driver.Platforms;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHHLLApp {

    public static void main(String[] args) {
        AppiumDriver<MobileElement> appiumDriver = DriverFactory.getDriver(Platforms.android);
        System.out.println(appiumDriver.getSessionId());

        try {
            By loginBtnAnonymouslySel = MobileBy.id("com.hahalolo.android.halome:id/incognito_bt");
//            By loginBtnAnonymouslySel = MobileBy.xpath("//*[@text=\"Log in Anonymously\"]");
            MobileElement loginBtnAnonymouslyElem = appiumDriver.findElement(loginBtnAnonymouslySel);
            System.out.println(loginBtnAnonymouslyElem.getText());
            loginBtnAnonymouslyElem.click();

//            Actions action = new Actions(appiumDriver);
//            action.moveToElement(loginBtnAnonymouslyElem);
//            action.doubleClick();
//            action.perform();



//            System.out.println(loginBtnAnonymouslyElem.getText());

//            if (appiumDriver == null) {
//                System.out.println("driver null");
//            } else {
//                System.out.println(appiumDriver.getSessionId());
//            }

//            WebDriverWait wait = new WebDriverWait(appiumDriver, 10L);
//            wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(loginBtnAnonymouslyElem)));
//            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loginBtnAnonymouslySel));
//            loginBtnAnonymouslyElem.click();
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            appiumDriver.quit();
        }
    }
}
