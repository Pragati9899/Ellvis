package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.StreamConfigSRT;
import pages.StreamConfigUDP;

public class TC006_UDP_SRTstreamTest extends BaseTestClass
{
     /*   @Test
        public void configure_UDP_SRTstream() throws InterruptedException {
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

        StreamConfigSRT configSRT= new StreamConfigSRT(driver);
        configSRT.clickOpProtocol();
        configSRT.selectOPProtocol();
        configSRT.clickOpSRTmode();
        configSRT.selectOpSRTmode();
        configSRT.clickOpInterface();
        configSRT.selectOPInterface();
        configSRT.setOutputIP(rb.getString("opIP"));
        configSRT.setOutputPort(rb.getString("opPort"));
        configSRT.setOutputLatency(rb.getString("opLatency"));
        configSRT.setOutputTTl(rb.getString("TTL"));
        configSRT.setOutputTimeout(rb.getString("opTimeout"));
        configSRT.clickOutputEncryption();
        configSRT.selectOpEncryption();
        configSRT.setOutputEncryptionKey(rb.getString("encryKey"));

        configSRT.setUpdateInterval(rb.getString("upInterval"));
        configSRT.setComment(rb.getString("comment6"));
        configSRT.clicSaveBtn();
        Thread.sleep(5000);
        String streamComment=dp.read1stStreamComment();
        Assert.assertEquals(streamComment, rb.getString("comment6"));

    }*/}
