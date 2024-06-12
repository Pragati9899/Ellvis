package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.StreamConfigSRT;

public class TC005_SRT_SRTstreamTest extends BaseTestClass {
/*    @Test
    public void configure_SRT_SRT_stream() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();

        Dashboard dp = new Dashboard(driver);
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
        configSRT.setComment(rb.getString("comment5"));
        configSRT.clicSaveBtn();

        Thread.sleep(5000);
        String streamComment=dp.read1stStreamComment();
        Assert.assertEquals(streamComment, rb.getString("comment5"));

    }*/
}