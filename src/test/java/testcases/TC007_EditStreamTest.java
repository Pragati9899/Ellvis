package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.annotations.Test;
import pages.*;

public class TC007_EditStreamTest extends BaseTestClass {
    @Test
    public void editStreamTest() {
        //   try {
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        Dashboard dp = new Dashboard(driver);
        dp.checkFor2ndUserLogin();
        dp.clickEditBtn();
        StreamConfig config = new StreamConfig(driver);
/*
            if( config.readInProtocol().equals("SRT")){
                config.setUpdateInterval(rb.getString("upInterval"));
            }
            else
            {

                configUDP.setSSMip(rb.getString("ssmIP"));
            }

            if(config.readOpProtocol().equals(("DASH") )){
                StreamConfig configDash= new StreamConfig(driver);
              *//*  configDash.setSegmentDuration(rb.getString("segDuration"));*//*
                configDash.setFragmentDuration(rb.getString("fragDuration"));
            } else if (config.readOpProtocol().equals(("HLS") )) {
                StreamConfigHLS configDash= new StreamConfigHLS(driver);
                configDash.setSegmentDuration(rb.getString("segDuration"));
                configDash.setFragmentDuration(rb.getString("fragDuration"));
            } else if (config.readOpProtocol().equals(("SRT") )){
                config.setUpdateInterval(rb.getString("upInterval"));
            } else if (config.readOpProtocol().equals(("UDP") )){
                StreamConfigUDP configUDP=new StreamConfigUDP(driver);
                configUDP.setSSMip(rb.getString("ssmIP"));
            }

            config.clicSaveBtn();

        }
        catch (Exception e){*/

        // }

    }
}