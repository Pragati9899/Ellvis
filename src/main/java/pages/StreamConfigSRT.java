package pages;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StreamConfigSRT extends BaseClass {

    public StreamConfigSRT(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[1]")
    WebElement inprotocol;
    @FindBy(xpath = "(//div[@class='col-md-7'])[1]//ul//li")
    List<WebElement> inputProtocol;

    @FindBy(xpath = "(//button[@id='dropdown-basic'])[5]")
    WebElement opProtocol;
    @FindBy(xpath = "(//div[@class='col-md-7'])[13]//ul//li")
    List<WebElement>  outputProtocol;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[3]")
    WebElement inInterface;

    @FindBy(xpath = "(//div[@class='col-md-7'])[3]//ul//li")
    List<WebElement>  inputInterface;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[7]")
    WebElement opInterface;
    @FindBy(xpath = "(//div[@class='col-md-7'])[15]//ul//li")
    List<WebElement>  outputInterface;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[2]")
    WebElement inSRTmode;
    @FindBy(xpath = "(//div[@class='col-md-7'])[2]//ul//li")
    List<WebElement> inputSRTmode;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[6]")
    WebElement opSRTmode;
    @FindBy(xpath = "(//div[@class='col-md-7'])[14]//ul//li")
    List<WebElement> outputSRTmode;
    @FindBy(xpath = "//input[@statekey='sourceIP']")
    WebElement inputIP;
    @FindBy(xpath = "//input[@statekey='destIP']")
    WebElement outputIP;
    @FindBy(xpath = "//input[@placeholder='Enter Port']")
    WebElement inputPort;
    @FindBy(xpath = "//input[@placeholder='Port']")
    WebElement outputPort;
    @FindBy(xpath = "//input[@statekey='sourceLatency']")
    WebElement inputLatency;
    @FindBy(xpath = "//input[@statekey='destLatency']")
    WebElement outputLatency;

    @FindBy(xpath = "//input[@statekey='sourceTtl']")
    WebElement inputTTl;

    @FindBy(xpath = "//input[@statekey='destTtl']")
    WebElement outputTTl;

    @FindBy(xpath = "//input[@id='cb1']")
    WebElement inputDropPacketsCheckbox;

    @FindBy(xpath = "//input[@id='1']")
    WebElement outputDropPacketsCheckbox;

    @FindBy(xpath = "//input[@statekey=\"sourceTimeout\"]")
    WebElement inputTimeout;

    @FindBy(xpath = "//input[@statekey='destTimeout']")
    WebElement outputTimeout;

    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[4]")
    WebElement  inEncryption;
    @FindBy(xpath = "(//div[@class='col-md-7'])[11]//ul//li")
    List<WebElement> inputEncryption;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[12]")
    WebElement  opEncryption;
    @FindBy(xpath = "(//div[@class='col-md-7'])[28]//ul//li")
    List<WebElement>  outputEncryption;

    @FindBy(xpath = "//input[@statekey='sourceEncryptionKey']")
    WebElement passphraseEncryption;

    @FindBy(xpath = "//input[@statekey='destEncryptionKey']")
    WebElement encryptionKey;

    @FindBy(xpath = "//input[@placeholder='Interval']")
    WebElement updateInterval;

    @FindBy(xpath = "//input[@placeholder='Comment']")
    WebElement comment;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveBtn;


    public void clickInProtocol(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",inprotocol);
    }

    public void selectINProtocol(){

        for(int i=0;i<inputProtocol.size();i++){
            String text = (inputProtocol.get(i).getText());
            if(text.equals("SRT")){
                inputProtocol.get(i).click();
            }

        }
    }
    public void clickInSRTmode(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",inSRTmode);
    }

    public void selectInSRTmode(){

        for(int i=0;i<inputSRTmode.size();i++){
            String text = (inputSRTmode.get(i).getText());
            if(text.equals("Listener")){
                inputSRTmode.get(i).click();
            }

        }
    }

    public void clickInInterface(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",inInterface);
    }
    public void selectINInterface(){

        for(int i=0;i<inputInterface.size();i++){
            String text = (inputInterface.get(i).getText());
            if(text.equals("enp0s31f6")){
                inputInterface.get(i).click();
            }

        }
    }

    public void setInputIP(){
        inputIP.sendKeys("");
    }

    public void setInputPort(String inPort){
        inputPort.sendKeys(inPort);
    }
    public void setInputLatency(String InLatency){
        inputLatency.sendKeys(InLatency);
    }
    public void setInputTTl(){
        inputTTl.sendKeys("");
    }

    public void setInDropPacketCheckbox(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",inputDropPacketsCheckbox);
    }
    public void setInputTimeout(String inTimeout){
        inputTimeout.sendKeys(inTimeout);
    }

    public void clickInputEncryption(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",inEncryption);
    }

    public void selectInEncryption(){

        for(int i=0;i<inputEncryption.size();i++){
            String text = (inputEncryption.get(i).getText());
            if(text.equals("disabled")){
                inputEncryption.get(i).click();
            }

        }
    }
    public void setinputPassphrase(String passphrase)
    {
        passphraseEncryption.sendKeys(passphrase);
    }

    public void clickOpProtocol(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",opProtocol);
    }

    public void selectOPProtocol(){
        for(int i=0;i<outputProtocol.size();i++){
            String text = (outputProtocol.get(i).getText());
            if(text.equals("SRT")){
                outputProtocol.get(i).click();
            }

        }
    }
    public void clickOpSRTmode(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",opSRTmode);
    }

    public void selectOpSRTmode(){

        for(int i=0;i<outputSRTmode.size();i++){
            String text = (outputSRTmode.get(i).getText());
            if(text.equals("Caller")){
                outputSRTmode.get(i).click();
            }
        }
    }

    public void clickOpInterface(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",opInterface);
    }

    public void selectOPInterface(){

        for(int i=0;i<outputInterface.size();i++){
            String text = (outputInterface.get(i).getText());
            if(text.equals("enp0s31f6")){
                outputInterface.get(i).click();
            }

        }
    }

    public void setOutputIP(String opIP){
        outputIP.sendKeys(opIP);
    }

    public void setOutputPort(String opPort){
        outputPort.sendKeys(opPort);
    }

    public void setOutputLatency(String opLatency){
        outputLatency.sendKeys(opLatency);
    }

    public void setOutputTTl(String TTL){
        outputTTl.click();
        outputTTl.clear();
        outputTTl.sendKeys(TTL);
    }

    public void setOutputTimeout(String opTimeout){
        outputTimeout.sendKeys(opTimeout);
    }

    public void clickOutputEncryption(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",opEncryption);
    }

    public void selectOpEncryption(){

        for(int i=0;i<outputEncryption.size();i++){
            String text = (outputEncryption.get(i).getText());
            if(text.equals("Disabled")){
                outputEncryption.get(i).click();
            }
        }
    }
    public void setOutputEncryptionKey(String encryKey){
        encryptionKey.sendKeys(encryKey);
    }

    public void setUpdateInterval(String upInterval){
        updateInterval.sendKeys(upInterval);
    }
    public void setComment (String stComment){
        comment.sendKeys(stComment);
    }

    public void clicSaveBtn(){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",saveBtn);
    }
}
