package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;


public class TC004_LogoutTest extends BaseTestClass{

  /*  @Test
    public void LogoutTest(){

          LoginPage lp = new LoginPage(driver);
          Dashboard dp   = new Dashboard(driver );
          lp.inputPassword(rb.getString("password"));
          lp.clickLoginBtn();
          try {
              Boolean ActiveUserWarning=lp.displayConfirmLoginMessage();
              if(ActiveUserWarning.equals(true)){
                  dp.clickContinueBtn();
              }
          }catch (Exception e){e.printStackTrace();}

        dp.setLogoutBtn();
        Boolean result=lp.validateLoginHeading();
        Assert.assertEquals(result,true);

}*/}
