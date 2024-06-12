package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;

public class TC001_TestLogin extends BaseTestClass  {

  /*@Test
    public void TestLogin() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver );
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
       try {
           Boolean ActiveUserWarning=lp.displayConfirmLoginMessage();
           if(ActiveUserWarning.equals(true)){
               dp.clickContinueBtn();
           }
       }catch (Exception e){e.printStackTrace();}

        Thread.sleep(2000);
        Boolean actualURL=dp.fetchCurrentUrl();
        Assert.assertEquals(actualURL,true,"User is succesfully login");
    }*/
  /*  @Test
    public void TestSingleUserLogin() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Dashboard dp = new Dashboard(driver );
        lp.clearPassword();
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        try {
            Boolean ActiveUserWarning=lp.displayConfirmLoginMessage();
            if(ActiveUserWarning.equals(true)) {
                System.out.println(lp.readUser_IP()+" is already login");
               // dp.clickContinueBtn();
            } else {
                System.out.println("Ellvis is free to use");
            }
        }catch (Exception e){e.printStackTrace();}

        Thread.sleep(2000);
        Boolean actualURL=dp.fetchCurrentUrl();
        Assert.assertEquals(actualURL,true);
    }*/
}
