package pages;

import actiondriver.ActionDriver;
import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BaseClass {

/*

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

    @FindBy(xpath = "//i[@class=\"fa fa-stop\"]")
    WebElement stopBtn;
    @FindBy(xpath = "//i[@class=\"fa fa-play\"]")
    WebElement startBtn;
    @FindBy(xpath = "//i[@class=\"fa fa-edit\"]")
    WebElement editBtn;
    @FindBy(xpath = "//i[@class=\"fa fa-times\"]")
    WebElement deleteBtn;
    @FindBy(xpath = "//i[@class=\"fa fa-video-camera\"]")
    WebElement previewBtn;
    @FindBy(xpath = "(//div[@class=\"rt-tr -odd\"])")
    WebElement firstStream;

    public String FetchStreamColor(){
       String colorOfStream= firstStream.getCssValue("color");
       return colorOfStream;
    }
    public boolean ValidationImage() {
        return Image.isDisplayed();
    }
    public void setLogoutBtn() {
        ActionDriver.JSClick(driver,LogoutBtn);
    }

    public void clickContinueBtn(){
        ActionDriver.JSClick(driver,ContinueBtnPopup);
    }
    public void checkFor2ndUserLogin(){
        if(ContinueBtnPopup.isDisplayed()){
            ActionDriver.JSClick(driver,ContinueBtnPopup);
        }
    }

    public void clickCancelBtn(){
        ActionDriver.JSClick(driver,CancelBtnPopup);
    }

    public String read1stStreamComment(){
        String commentText=streamListComment.getText();
        return commentText;
    }

    public void clickonStreamConfig(){
        ActionDriver.JSClick(driver,streamConfigBtn);
    }

    public void clickStopBtn(){
        ActionDriver.JSClick(driver,stopBtn);
    }
    public void clickStartBtn(){
        ActionDriver.JSClick(driver,startBtn);
    }
    public void clickEditBtn(){
        ActionDriver.JSClick(driver,editBtn);
    }

    public void clickDeleteBtn(){
        ActionDriver.JSClick(driver,deleteBtn);
    }
    public void clickPreviewBtn(){
        ActionDriver.JSClick(driver,previewBtn);
    }
    public boolean fetchCurrentUrl(){
        String DashboardURL=driver.getCurrentUrl();
        boolean URLflag=DashboardURL.contains("dashboard");
        return URLflag;
    }
*/

}