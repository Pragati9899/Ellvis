package pages;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BaseClass {
    public Dashboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@alt=\"logo_image\"]")
    WebElement Image;

    @FindBy(xpath = "//button[text()='Logout']")
    WebElement LogoutBtn;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement ContinueBtnPopup;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement CancelBtnPopup;

    @FindBy(xpath = "(//div[@class=\"rt-td\"])[3]")
    WebElement streamListComment;

    @FindBy(xpath = "//p[text()='Stream Configuration']")
    WebElement streamConfigBtn;
    public boolean ValidationImage() {
        return Image.isDisplayed();
    }


    public void setLogoutBtn() {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",LogoutBtn);
    }

    public void clickContinueBtn(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0]." +
                "click();",ContinueBtnPopup);
    }

    public void clickCancelBtn(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",CancelBtnPopup);
    }

    public String read1stStreamComment(){
        String commentText=streamListComment.getText();
        return commentText;
    }

    public void clickonStreamConfig(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",streamConfigBtn);
    }
}