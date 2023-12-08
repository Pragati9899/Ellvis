package pages;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//input[@name='password']")
    WebElement Password;

    @FindBy(xpath = "(//button[text()='Login'])[3]")
    WebElement LoginBtn;

    @FindBy(xpath = "//h4[text()='Login']")
    WebElement LoginHeading;

    public void inputPassword(String password){

        Password.sendKeys(password);
    }

    public void clearPassword(){
        Password.clear();
    }

    public void clickLoginBtn(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",LoginBtn);
    }
    public Boolean validateLoginHeading(){
        return LoginHeading.isDisplayed();
    }

}
