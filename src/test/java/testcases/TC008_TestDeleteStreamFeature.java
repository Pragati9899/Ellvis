package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;

public class TC008_TestDeleteStreamFeature extends BaseTestClass {
    @Test
    public void TestDeleteStreamFeature() {

        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        try {
            Boolean ActiveUserWarning=lp.displayConfirmLoginMessage();
            if(ActiveUserWarning.equals(true)){
                dp.clickContinueBtn();
            }
        }catch (Exception e){e.printStackTrace();}

        dp.clickDeleteBtn();
        dp.setLogoutBtn();
    }
}