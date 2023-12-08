package pages;

import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import actiondriver.ActionDriver;
public class Encoder extends BaseClass {
    public Encoder(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href=\"#tab5\"]")
    WebElement SystemSettingBtn;
    public void clickSystemSettingBtn() {
        ActionDriver.JSClick(driver,SystemSettingBtn);
    }
    @FindBy(xpath = "//select[@id=\"IdOutIf\"]")
    WebElement EnOutputMode;

    public void selectEnOutputMode(){
        ActionDriver.selectByValue(EnOutputMode,"UDP");
    }
    @FindBy(xpath ="//select[@id=\"IdTS1Delivery\"]" )
    WebElement EnProtocol;

    public void selectEnProtocol(String enProtocol){
        ActionDriver.selectByValue(EnProtocol,enProtocol);
    }
    @FindBy(xpath = "//input[@id=\"IdTS1IP\"]")
     WebElement EnDestIP;
    public void setEnDestIP(String enDestIP){
        ActionDriver.type(EnDestIP,enDestIP);
    }


    @FindBy(xpath = "//input[@id=\"IdTS1Port\"]")
    WebElement EnDestPort;
    public void setEnDestPort(String enDestPort){
        ActionDriver.type(EnDestPort,enDestPort);
    }
    @FindBy(xpath = "//select[@id=\"IdTS1SRTMode\"]")
    WebElement EnSRTmode;

    public void selectEnSRTmode(String enSRTmode){
        ActionDriver.selectByValue(EnSRTmode,enSRTmode);
    }

    @FindBy(xpath = "//select[@id=\"IdTS1Encryption\"]")
    WebElement EnEncryption;

    public void selectEnEncryption(String enEncryption)
    {
        ActionDriver.selectByValue(EnEncryption,enEncryption);
    }

    @FindBy(xpath = "//input[@id=\"IdTS1Passphrase\"]")
    WebElement EnPassphrase;

    public void setEnPassphrase(String enPassphrase) {
        ActionDriver.type(EnPassphrase, enPassphrase);
    }
        @FindBy(xpath = "//input[@name=\"stop_btn\"]")
                WebElement EnStopBtn;
         public void clickEnStopBtn()  {
             ActionDriver.JSClick(driver,EnStopBtn);

         }

         @FindBy(xpath = "//input[@name=\"save_btn\"]")
         WebElement EnSaveBtn;

         public void clickEnSaveBtn()  {
             ActionDriver.JSClick(driver,EnStopBtn);

         }
    @FindBy(xpath = "//input[@name=\"start_btn\"]")
    WebElement EnStartBtn;

    public void clickEnStartBtn() {
        ActionDriver.JSClick(driver,EnStartBtn);

    }

    @FindBy(xpath = "//a[@href=\"#tab3\"]")
    WebElement TSsettingsBtn;

    public void clickTSsettingsBtn() {
        ActionDriver.JSClick(driver,TSsettingsBtn);
    }

    @FindBy(xpath = "//span[@id=\"IdState\"]")
    WebElement StateofEncoder;
    public String CheckStateofEncoder(){
        String stateofEncoder=StateofEncoder.getText();
           return stateofEncoder;
    }
}

