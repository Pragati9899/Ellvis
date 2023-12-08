package pages;

import actiondriver.ActionDriver;
import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StreamConfig extends BaseClass {
    public StreamConfig(WebDriver driver) {
        super(driver);
    }

    /*---- General Parameters--------*/
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[1]")
    WebElement inprotocol;
    @FindBy(xpath = "(//div[@class='col-md-7'])[1]//ul//li")
    List<WebElement> inputProtocol;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[3]")
    WebElement inInterface;
    @FindBy(xpath = "(//div[@class='col-md-7'])[3]//ul//li")
    List<WebElement>  inputInterface;
    @FindBy(xpath = "(//button[@id='dropdown-basic'])[5]")
    WebElement opProtocol;
    @FindBy(xpath = "(//div[@class='col-md-7'])[13]//ul//li")
    List<WebElement> outputProtocol;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[7]")
    WebElement opInterface;
    @FindBy(xpath = "(//div[@class='col-md-7'])[15]//ul//li")
    List<WebElement> outputInterface;
    @FindBy(xpath = "//input[@statekey='sourceIP']")
    WebElement inputIP;
    @FindBy(xpath = "//input[@statekey='destIP']")
    WebElement outputIP;
    @FindBy(xpath = "//input[@placeholder='Enter Port']")
    WebElement inputPort;
    @FindBy(xpath = "//input[@placeholder='Port']")
    WebElement outputPort;
    @FindBy(xpath = "//input[@statekey='sourceTtl']")
    WebElement inputTTl;
    @FindBy(xpath = "//input[@statekey='destTtl']")
    WebElement outputTTl;
    @FindBy(xpath = "//label[@for='cb6']")
    WebElement httpsLocationCheckbox;
    @FindBy(xpath = "//input[@statekey=\"destHttpLocation\"]")
    WebElement destHttpsLocation;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[12]")
    WebElement SegmentTemplateDrp;
    @FindBy(xpath = "(//div[@class='col-md-7'])[29]//ul//li")
    List<WebElement> segmentTemplate;
    @FindBy(xpath = "//input[@statekey='destSegmentDuration']")
    WebElement segmentDuration;
    @FindBy(xpath = "//input[@statekey='destFragmentDuration']")
    WebElement fragmentDuration;
    @FindBy(xpath = "//input[@statekey='destTimeShiftBufferDepth']")
    WebElement timeShiftBufferDepth;
    @FindBy(xpath = "//input[@placeholder='number of segments']")
    WebElement preservedSegment;
    @FindBy(xpath = "//input[@placeholder='Interval']")
    WebElement updateInterval;

    @FindBy(xpath = "//input[@placeholder='Comment']")
    WebElement comment;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveBtn;
    @FindBy(xpath = "//div[contains(@class,'notification-message')]")
    WebElement errorMessage;

    /*---------SRT Parameters--------------------*/
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[2]")
    WebElement inSRTmode;
    @FindBy(xpath = "(//div[@class='col-md-7'])[2]//ul//li")
    List<WebElement> inputSRTmode;
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[6]")
    WebElement opSRTmode;
    @FindBy(xpath = "(//div[@class='col-md-7'])[14]//ul//li")
    List<WebElement> outputSRTmode;
    @FindBy(xpath = "//input[@statekey='sourceLatency']")
    WebElement inputLatency;
    @FindBy(xpath = "//input[@statekey='destLatency']")
    WebElement outputLatency;
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

    /*----------UDP Parameters--------------*/
    @FindBy(xpath = "//input[@statekey=\"sourceSSMIP\"]")
    WebElement SSMip;

    /* ------DASH Parameters_______________*/
    @FindBy(xpath = "//label[@for='cb5']")
    WebElement lowLatencyCheckbox;

    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[13]")
    WebElement utcTimingSchemeDrp;
    @FindBy(xpath = "(//div[@class='col-md-7'])[30]//ul//li")
    List<WebElement> utcTimingScheme;

    @FindBy(xpath = "//input[@statekey='destUtcTimingsValue']")
    WebElement utcTimingValue;

    @FindBy(xpath = "//input[@statekey='destMinUpdatePeriod']")
    WebElement minUpadatePeriod;

    @FindBy(xpath = "//input[@statekey='destMinBufferTime']")
    WebElement minBufferTime;

    @FindBy(xpath = "//input[@statekey='destSuggestedPresentationDelay']")
    WebElement presentationDelay;

    @FindBy(xpath = "//label[@for='cb3']")
    WebElement segmentTemplateChekbox;

    /*---------------HLS parameters-------------*/
    @FindBy(xpath = "(//button[@id=\"dropdown-basic\"])[8]")
    WebElement HLSformatDrp;
    @FindBy(xpath = "(//div[@class='col-md-7'])[20]//ul//li")
    List<WebElement> HLSformat;
    @FindBy(xpath = "(//input[@statekey=\"destEnableIframe\"])")
    WebElement iFrameCheckbox;



    // --------------General Functions----------------------------------------------------

    public void selectINProtocol(String inproto){
        ActionDriver.JSClick(driver,inprotocol);
       if(inproto.equals("SRT") || inproto.equals("UDP")) {
           ActionDriver.selectDropdownByForLoop(driver, inputProtocol, inproto);
       }
    }

    public void selectOPProtocol(String opproto){
        ActionDriver.JSClick(driver,opProtocol);
        if(opproto.equals("SRT") || opproto.equals("UDP") || opproto.equals("DASH") ||opproto.equals("HLS") ) {
            ActionDriver.selectDropdownByForLoop(driver,outputProtocol,opproto);
        }
    }

    public void selectINInterface(String interfaces){
        ActionDriver.JSClick(driver,inInterface);
        ActionDriver.selectDropdownByForLoop(driver,inputInterface,interfaces);

    }
        public void selectOPInterface(String interfaces){
        ActionDriver.JSClick(driver,opInterface);
        ActionDriver.selectDropdownByForLoop(driver,outputInterface,interfaces);
    }

    public void setInputIP(String enDestIP){
        ActionDriver.type(inputIP, enDestIP);
    }
    public void setOutputIP(String enDestPort){
        ActionDriver.type(outputIP,enDestPort );
    }
    public void setInputPort(String inPort){
        ActionDriver.type(inputPort,inPort );
    }
    public void setOutputPort(String opPort){
        ActionDriver.type(outputPort,opPort );
    }

    public void setInputTTl(){
        ActionDriver.type(inputTTl,"" );
    }

    public void setOutputTTl(String TTL){
        outputTTl.click();
        outputTTl.clear();
        ActionDriver.type(outputTTl,TTL );
    }
    public void ClickHttpsLocationCheckbox(){
        ActionDriver.JSClick(driver,httpsLocationCheckbox);
 }
    public void inputHttpsLocation(String httpsLoc){
        ActionDriver.type(destHttpsLocation,httpsLoc );
    }
    public void selectSegmentTemplate(String segmentTemp){
        ActionDriver.JSClick(driver,SegmentTemplateDrp);
        ActionDriver.selectDropdownByForLoop(driver,segmentTemplate,segmentTemp);
    }
    public void setSegmentDuration(String segDuration){
        ActionDriver.type(segmentDuration,segDuration );
    }
    public void setFragmentDuration(String fragDuration){
        ActionDriver.type(fragmentDuration,fragDuration );
    }
    public void setTimeShiftBufferDepth(String TimeShift)
    {
        ActionDriver.type(timeShiftBufferDepth,TimeShift );
    }
    public void setPreservedSegment(String PreservedSegment){
        ActionDriver.type(preservedSegment,PreservedSegment );
    }
    public void setUpdateInterval(String upInterval){
        updateInterval.clear();
        ActionDriver.type(updateInterval,upInterval );
    }
    public void setComment (String stComment){
        ActionDriver.type(comment,stComment );
    }
    public void clicSaveBtn(){
        ActionDriver.JSClick(driver,saveBtn);
  }

  public String readErrorMessage(){
        String ErrorMessaage=errorMessage.getText();
        return ErrorMessaage;
  }

    //---------------------------SRT Functions-------------------
    public void selectInSRTmode(String inMode){
        ActionDriver.JSClick(driver,inSRTmode);
        ActionDriver.selectDropdownByForLoop(driver,inputSRTmode,inMode);
    }
    public void selectOpSRTmode(String opMode){
        ActionDriver.JSClick(driver,opSRTmode);
        ActionDriver.selectDropdownByForLoop(driver,outputSRTmode,opMode);
    }
    public void setInputLatency(String InLatency){
        ActionDriver.type(inputLatency,InLatency);
    }
    public void setOutputLatency(String opLatency){
        ActionDriver.type(outputLatency,opLatency);
    }
    public void setInDropPacketCheckbox(){
        ActionDriver.JSClick(driver,inputDropPacketsCheckbox);
    }
        public void setInputTimeout(String inTimeout){
            ActionDriver.type(inputTimeout,inTimeout);
        }
    public void setOutputTimeout(String opTimeout){
        ActionDriver.type(outputTimeout,opTimeout);
    }
    public void selectInEncryption(String iNencryption){
        ActionDriver.JSClick(driver,inEncryption);
        ActionDriver.selectDropdownByForLoop(driver,inputEncryption,iNencryption);
    }
    public void setinputPassphrase(String enPassphrase)
    {
        ActionDriver.type(passphraseEncryption,enPassphrase);
    }

    public void selectOpEncryption(String oP_encryption){
        ActionDriver.JSClick(driver,opEncryption);
        ActionDriver.selectDropdownByForLoop(driver,outputEncryption,oP_encryption);
    }
    public void setOutputEncryptionKey(String encryKey){
        ActionDriver.type(encryptionKey,encryKey);
    }

    public void scrollPageDown(){
        ActionDriver.scrollDownByEnd(driver);
    }
  //------------------UDP Function--------------------------
  public void setSSMip(String ssmIP){
      ActionDriver.type(SSMip,ssmIP);
  }

  //----------------DASH function----------------------------

    public void setLowLatencyCheckbox(){
        ActionDriver.JSClick(driver,lowLatencyCheckbox);
    }
    public void selectUTCtimingScheme(String UTCtimingScheme){
        ActionDriver.JSClick(driver,utcTimingSchemeDrp);
        ActionDriver.selectDropdownByForLoop(driver,utcTimingScheme,UTCtimingScheme);
    }
    public void setUtcTimingValue(String UTCvalue){
        ActionDriver.type(utcTimingValue,UTCvalue);
    }

    public void setMinUpadatePeriod(String minUpPeriod){
        ActionDriver.type(minUpadatePeriod,minUpPeriod);
    }
    public void setMinBufferTime(String BufferTime){
        ActionDriver.type(minBufferTime,BufferTime);
    }
    public void setPresentationDelay(String presentDelay){
        ActionDriver.type(presentationDelay,presentDelay);
    }
    public void clickSegmentTemplateChekbox(){
        ActionDriver.JSClick(driver,segmentTemplateChekbox);
    }

    //-------------------HLS Function----------------------------
    public void selectHLSformat(String HLS_format){
        ActionDriver.JSClick(driver,HLSformatDrp);
        ActionDriver.selectDropdownByForLoop(driver,HLSformat,HLS_format);
    }
    public void setiFrameCheckbox(){
        ActionDriver.JSClick(driver,iFrameCheckbox);

    }
}
