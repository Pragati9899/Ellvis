package pages;

import actiondriver.ActionDriver;
import basePackage.BaseClass;
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

    @FindBy(xpath = "//label[@class=\"confirm-label\"]")
    WebElement ConfirmLoginMessage;

    @FindBy(xpath = "//b")
    WebElement User_IP;

    public String readUser_IP(){
        String user_ip=User_IP.getText();
        return user_ip;
    }
    public Boolean displayConfirmLoginMessage(){
        Boolean confirmLoginMessage= ActionDriver.IsDisplayed(driver,ConfirmLoginMessage);
        return confirmLoginMessage;
    }
    public void inputPassword(String password){
        ActionDriver.type(Password, password);
    }

    public void clearPassword(){
        Password.clear();
    }

    public void clickLoginBtn(){
        ActionDriver.JSClick(driver,LoginBtn);
    }
    public Boolean validateLoginHeading(){
        return LoginHeading.isDisplayed();
    }

}
