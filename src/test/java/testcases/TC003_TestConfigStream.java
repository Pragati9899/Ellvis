package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;
import pages.StreamConfig;

public class TC003_TestConfigStream extends BaseTestClass {
    @Test
    public void login(){
        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver);
        StreamConfig config= new StreamConfig(driver);
        //---------login-----------
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        try {
            Boolean ActiveUserWarning=lp.displayConfirmLoginMessage();
            if(ActiveUserWarning.equals(true)){
                Thread.sleep(200);
                dp.clickContinueBtn();
            }
        }catch (Exception e){e.printStackTrace();}

    }
    @Parameters({"DestProtocol","DestIP","DestPort","OpIp","OpPort","EnEncryption",
            "EncPassphrase", "Opprotocol", "Interface","OpEncryption","Op_EncryptionKey"})
    @Test(dependsOnMethods = "login")
    public void configureStreamTest(String enProtocol,String enDestIP, String enDestPort,String opIP,
                                    String opPort,String enEncryption,String enPassphrase,
                                    String opproto, String interfaces, String oP_encryption,String encryKey) throws InterruptedException {

        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver);
        StreamConfig config= new StreamConfig(driver);
        Thread.sleep(2000);
        dp.clickonStreamConfig();

        if(enProtocol.equals("SRT")) {
            config.selectINProtocol(enProtocol);
            config.selectInSRTmode(rb.getString("inMode"));
            config.selectINInterface(interfaces);
            config.setInputIP(enDestIP);
            config.setInputPort(enDestPort);
            config.setInputLatency(rb.getString("InLatency"));
            config.setInputTTl();
            config.setInDropPacketCheckbox();
            config.setInputTimeout(rb.getString("inTimeout"));
            config.scrollPageDown();
            config.selectInEncryption(enEncryption);
            config.setinputPassphrase(enPassphrase);

        } else if (enProtocol.equals("UDP")) {
            config.selectINProtocol(enProtocol);
            config.selectINInterface(interfaces);
            config.setInputIP(enDestIP);
            config.setInputPort(enDestPort);
            config.setSSMip(rb.getString("ssmIP"));
            config.setInputTTl();
        }

        if(opproto.equals("SRT")){
            config.selectOPProtocol(opproto);
            config.selectOpSRTmode(rb.getString("opMode"));
            config.selectOPInterface(interfaces);
            config.setOutputIP(opIP);
            config.setOutputPort(opPort);
            config.setOutputLatency(rb.getString("opLatency"));
            config.setOutputTTl(rb.getString("TTL"));
            config.setOutputTimeout(rb.getString("opTimeout"));
            config.scrollPageDown();
          //  config.selectOpEncryption(oP_encryption);
            config.setOutputEncryptionKey(encryKey);

    } else if (opproto.equals("UDP")) {
            config.selectOPProtocol(opproto);
            config.selectOPInterface(interfaces);
            config.setOutputIP(opIP);
            config.setOutputPort(opPort);
            config.setOutputTTl(rb.getString("TTL"));

        } else if (opproto.equals("DASH")) {
            config.selectOPProtocol(opproto);
            config.selectOPInterface(interfaces);
            config.ClickHttpsLocationCheckbox();
            config.inputHttpsLocation(rb.getString("httpsLoc"));
            config.setLowLatencyCheckbox();
            config.setOutputTTl(rb.getString("TTL"));
            config.selectSegmentTemplate(rb.getString("segmentTemp"));
            config.selectUTCtimingScheme(rb.getString("UTCtimingScheme"));
            config.setUtcTimingValue(rb.getString("UTCvalue"));
            config.setSegmentDuration(rb.getString("segDuration"));
            config.setFragmentDuration(rb.getString("fragDuration"));
            config.setMinUpadatePeriod(rb.getString("minUpPeriod"));
            config.setMinBufferTime(rb.getString("BufferTime"));
            config.setPresentationDelay(rb.getString("presentDelay"));
            config.setTimeShiftBufferDepth(rb.getString("TimeShift"));
            config.setPreservedSegment(rb.getString("PreservedSegment"));
            config.clickSegmentTemplateChekbox();

        } else if (opproto.equals("HLS")) {
            config.selectOPInterface(interfaces);
            config.ClickHttpsLocationCheckbox();
            config.inputHttpsLocation(rb.getString("httpsLoc"));
            config.selectHLSformat(rb.getString("HLS_format"));
            config.setOutputTTl(rb.getString("TTL"));
            config.selectSegmentTemplate(rb.getString("segmentTemp"));
            config.setSegmentDuration(rb.getString("segDuration"));
            config.setFragmentDuration(rb.getString("fragDuration"));
            config.setTimeShiftBufferDepth(rb.getString("TimeShift"));
            config.setPreservedSegment(rb.getString("PreservedSegment"));
            config.setiFrameCheckbox();
        }


        config.setUpdateInterval(rb.getString("upInterval"));
        if(enProtocol.equals("SRT") && opproto.equals("SRT")) {
            config.setComment(rb.getString("SRT-SRTcomment"));
        } else if (enProtocol.equals("SRT") && opproto.equals("UDP")) {
            config.setComment(rb.getString("SRT-UDPcomment"));
        }else if (enProtocol.equals("SRT") && opproto.equals("DASH")) {
            config.setComment(rb.getString("SRT-DASHcomment"));
        }else if (enProtocol.equals("SRT") && opproto.equals("HLS")) {
            config.setComment(rb.getString("SRT-HLScomment"));
        }else if (enProtocol.equals("UDP") && opproto.equals("SRT")) {
            config.setComment(rb.getString("UDP-SRTcomment"));
        }else if (enProtocol.equals("UDP") && opproto.equals("UDP")) {
            config.setComment(rb.getString("UDP-UDPcomment"));
        }else if (enProtocol.equals("UDP") && opproto.equals("DASH")) {
            config.setComment(rb.getString("UDP-DASHcomment"));
        }else if (enProtocol.equals("UDP") && opproto.equals("HLS")) {
            config.setComment(rb.getString("UDP-HLScomment"));
        }
        config.clicSaveBtn();
        Thread.sleep(1000);
        Boolean actualURL=dp.fetchCurrentUrl();
        if(actualURL.equals(false)){
            Thread.sleep(2000);
            String errorMessage=config.readErrorMessage();
            System.out.println("The error message is -> "+errorMessage);
       }

        Assert.assertEquals(actualURL,true);
    }

    @Test
    public void TestColorOfStream(){
        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver);
        StreamConfig config= new StreamConfig(driver);

        String colorOfStream=dp.FetchStreamColor();
        System.out.println(colorOfStream);
        if(colorOfStream.contains("rgb(213, 239, 174)")){
            System.out.println("Stream is Active");
        }else {
            System.out.println("Stream is Inactive");
        }
    }
}
