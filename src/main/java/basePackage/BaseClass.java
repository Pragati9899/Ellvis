package basePackage;

import enums.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;

public class BaseClass {
 /*   public static void clickElement(By by, String elementName) {
        try {
            ExplicitWaitFactory.waitForVisibility(by).click();
        } catch (TimeoutException e) {
            e.printStackTrace();
            throw new TimeoutException(elementName+" is not displayed");
        }
    }


    protected void clickElement(WebElement element, String elementName) {
        try {
            ExplicitWaitFactory.waitToClick(element).click();
            ExtentLogger.pass(elementName+" is clicked successfully");
        } catch (TimeoutException e) {
            e.printStackTrace();
            throw new TimeoutException(elementName+" is not displayed");
        }
    }


    public static void sendKeys(By by, String value,String elementName)
    {
        try {

            ExplicitWaitFactory.waitToBePresent(by).sendKeys(value);
            ExtentLogger.pass(elementName+" is entered successfully");
        } catch (TimeoutException e) {
            e.printStackTrace();
            throw new TimeoutException(elementName+" is not displayed");
        }
    }


    public void sendKeys(WebElement element, String value, String elementName) {

        try {
            ExplicitWaitFactory.waitToBePresent(element).sendKeys(value);
            element.sendKeys(value);
            ExtentLogger.pass(elementName+" is entered successfully");
        } catch (TimeoutException e) {
            e.printStackTrace();
            throw new TimeoutException(elementName+" is not displayed");
        }
    }*/

}
