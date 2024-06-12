package driver;

import enums.ConfigProperties;
import enums.DriverModes;
import org.openqa.selenium.WebDriver;
import utilities.PropertyUtils;
import static driver.DriverManager.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public final class Driver {

    private Driver() {}

        public static void initDriver() {
            if(isNull(getDriver())) {
                String modevalue = PropertyUtils.getValue(ConfigProperties.MODE);
                WebDriver webDriver = DriverFactory.invokeDriver(DriverModes.valueOf(modevalue.toUpperCase()));
                 setDriver(webDriver);
            }
        }

       public static void quitDriver(){
            if(nonNull(getDriver())) {
                getDriver().quit();
                unload();
            }}


}
