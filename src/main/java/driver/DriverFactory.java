package driver;

import enums.DriverModes;
import frameworkConstants.FrameworkConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {
    private DriverFactory(){}

    public static WebDriver invokeDriver(DriverModes mode) {
         WebDriver driver = null;

        if(mode.equals(DriverModes.FIREFOX) ) {
            System.setProperty("webdriver.gecko.driver", FrameworkConstant.GECKODRIVERPATH);
            driver = new FirefoxDriver();
        }
        else if (mode.equals(DriverModes.CHROME)){
            System.setProperty("webdriver.chrome.driver", FrameworkConstant.CHROMEDRIVERPATH);
            driver = new ChromeDriver();
        }
        return driver;
    }
}
