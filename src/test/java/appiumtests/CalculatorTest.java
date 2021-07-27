package  appiumtests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class CalculatorTest {

    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {

        try {
            openCalculator();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();

        }

    }


    public static void openCalculator() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Omoghomion's Galaxy S10");
        cap.setCapability("udid", "RF8N72VBQ6P");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");


        cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application Started....");
    }
}