package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;


public class TC002_LogoutTest extends BaseTestClass{

 /*   @Test(priority = 5)
    public void LogoutTest(){
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        Dashboard dp   = new Dashboard(driver );
        dp.setLogoutBtn();

        Boolean result=lp.validateLoginHeading();

        Assert.assertEquals(result,true);
    }*/
}
