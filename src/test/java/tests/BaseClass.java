package tests;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    @BeforeTest
    public  void  setup() {

        DesiredCapabilities caps = new DesiredCapabilities();

        //caps.setCapability("platformName", "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.VERSION, "");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
        caps.setCapability(MobileCapabilityType.UDID, "");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
      //  caps.setCapability(MobileCapabilityType.APP, "");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

    }

    @AfterTest
    public void teardown() {


    }
}
