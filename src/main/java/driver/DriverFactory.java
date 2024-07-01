package driver;

import enums.ConfigProperties;
import enums.Browsers;
import frameworkConstants.FrameworkConstant;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.PropertyUtils;

import java.net.MalformedURLException;
import java.net.URL;

public final class DriverFactory {
    private DriverFactory() {
    }

    private static final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

    public static WebDriver invokeDriver(Browsers browser) throws MalformedURLException {
        WebDriver driver = null;

        if (PropertyUtils.getValue(ConfigProperties.ENVIRONMENT).equals("Local")) {

            if (browser.equals(Browsers.FIREFOX)) {
                System.setProperty("webdriver.gecko.driver", FrameworkConstant.GECKODRIVERPATH);
                driver = new FirefoxDriver();
            } else if (browser.equals(Browsers.CHROME)) {
                System.setProperty("webdriver.chrome.driver", FrameworkConstant.CHROMEDRIVERPATH);
                driver = new ChromeDriver();
            } else {
                System.out.println("Invalid browser");
            }
            return driver;

        } else if (PropertyUtils.getValue(ConfigProperties.ENVIRONMENT).equals("Remote")) {
            if (PropertyUtils.getValue(ConfigProperties.OS).equalsIgnoreCase("Windows")) {
                desiredCapabilities.setPlatform(Platform.WIN10);
            } else if (PropertyUtils.getValue(ConfigProperties.OS).equalsIgnoreCase("Mac")) {
                desiredCapabilities.setPlatform(Platform.MAC);
            } else {
                System.out.println("Invalid os");
            }


            switch (browser) {
                case CHROME -> driver = new ChromeDriver();
                case EDGE -> driver = new EdgeDriver();
                case FIREFOX -> driver = new FirefoxDriver();
                default -> {
                    System.out.println("Invalid browser name..");
                }
            }

            return new RemoteWebDriver(new URL("\"http://localhost:4444/\""), desiredCapabilities);

        }

        return driver;
    }

}