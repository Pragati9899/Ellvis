package driver;

import enums.ConfigProperties;
import enums.Browsers;
import org.openqa.selenium.WebDriver;
import utilities.PropertyUtils;

import java.net.MalformedURLException;

import static driver.DriverManager.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class Driver {

    private Driver() {}

        public static void initDriver() throws MalformedURLException {
            if(isNull(getDriver())) {
                String modevalue = PropertyUtils.getValue(ConfigProperties.BROWSER);
                WebDriver webDriver = DriverFactory.invokeDriver(Browsers.valueOf(modevalue.toUpperCase()));
                 setDriver(webDriver);
            }
        }

       public static void quitDriver(){
            if(nonNull(getDriver())) {
                getDriver().quit();
                unload();
            }}


}
