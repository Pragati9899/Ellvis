package pages;

import basePackage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StreamConfigUDP extends BaseClass {
   /* public StreamConfigUDP(WebDriver driver) {
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
    @FindBy(xpath = "(//input[@statekey='sourceIP'])[1]")
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
    @FindBy(xpath = "//input[@statekey=\"sourceSSMIP\"]")
    WebElement SSMip;
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
            if(text.equals("UDP")){
                inputProtocol.get(i).click();
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
      public void setSSMip(){
          SSMip.sendKeys("");
      }

      public void setInputTTl(){
          inputTTl.sendKeys("");
      }

      public void clickOpProtocol(){
          JavascriptExecutor js =(JavascriptExecutor)driver;
          js.executeScript("arguments[0].click();",opProtocol);
      }

    public void selectOPProtocol(){
        for(int i=0;i<outputProtocol.size();i++){
            String text = (outputProtocol.get(i).getText());
            if(text.equals("UDP")){
                outputProtocol.get(i).click();
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
    public void setOutputTTl(String TTL){
            outputTTl.click();
            outputTTl.clear();
            outputTTl.sendKeys(TTL);
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

*/

}
