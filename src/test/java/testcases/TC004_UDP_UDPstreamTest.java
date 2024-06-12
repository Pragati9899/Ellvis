package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.StreamConfigUDP;

public class TC004_UDP_UDPstreamTest extends BaseTestClass {
  /*  @Test
    public void configureUDP_UDPstream() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();

        Dashboard dp   = new Dashboard(driver );
        dp.clickonStreamConfig();

        StreamConfigUDP configUDP=new StreamConfigUDP(driver);
        configUDP.clickInProtocol();
        configUDP.selectINProtocol();
        configUDP.clickInInterface();
        configUDP.selectINInterface();
        configUDP.setInputIP();
        configUDP.setInputPort(rb.getString("inPort"));
        configUDP.setSSMip();
        configUDP.setInputTTl();
        configUDP.clickOpProtocol();
        configUDP.selectOPProtocol();
        configUDP.clickOpInterface();
        configUDP.selectOPInterface();
        configUDP.setOutputIP(rb.getString("opIP"));
        configUDP.setOutputPort(rb.getString("opPort"));
        configUDP.setOutputTTl(rb.getString("TTL"));
        configUDP.setUpdateInterval(rb.getString("upInterval"));
        configUDP.setComment(rb.getString("comment4"));
        configUDP.clicSaveBtn();

      *//*  if(dp.read1stStreamPort().contains(rb.getString("inPort"))){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }*//*

        Thread.sleep(5000);
        String streamComment=dp.read1stStreamComment();
       Assert.assertSame(streamComment,rb.getString("comment4"));
    }*/

}
