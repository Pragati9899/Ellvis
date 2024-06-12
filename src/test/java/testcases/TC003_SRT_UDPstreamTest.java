package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.StreamConfigSRT;
import pages.StreamConfigUDP;

public class TC003_SRT_UDPstreamTest extends BaseTestClass {
    /*@Test
    public void configureSRT_UDPstream() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();

        Dashboard dp   = new Dashboard(driver );
        dp.clickonStreamConfig();

        StreamConfigSRT configSRT= new StreamConfigSRT(driver);
        configSRT.clickInProtocol();
        configSRT.selectINProtocol();
        configSRT.clickInSRTmode();
        configSRT.selectInSRTmode();
        configSRT.clickInInterface();
        configSRT.selectINInterface();
        configSRT.setInputIP();
        configSRT.setInputPort(rb.getString("inPort"));
        configSRT.setInputLatency(rb.getString("InLatency"));
        configSRT.setInputTTl();
        configSRT.setInDropPacketCheckbox();
        configSRT.setInputTimeout(rb.getString("inTimeout"));
        configSRT.clickInputEncryption();
        configSRT.selectInEncryption();
        configSRT.setinputPassphrase(rb.getString("passphrase"));

        StreamConfigUDP configUDP=new StreamConfigUDP(driver);
        configUDP.clickOpProtocol();
        configUDP.selectOPProtocol();
        configUDP.clickOpInterface();
        configUDP.selectOPInterface();
        configUDP.setOutputIP(rb.getString("opIP"));
        configUDP.setOutputPort(rb.getString("opPort"));
        configUDP.setOutputTTl(rb.getString("TTL"));
        configSRT.setUpdateInterval(rb.getString("upInterval"));
        configSRT.setComment(rb.getString("comment3"));
        configSRT.clicSaveBtn();

        Thread.sleep(5000);
        String streamComment=dp.read1stStreamComment();
        Assert.assertEquals(streamComment, rb.getString("comment3"));

    }
*/

}
