package testcases;

import baseTestPackage.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Dashboard;
import pages.LoginPage;

public class TC001_LoginTest extends BaseTestClass  {

    /*@Test(priority = 0)
    public void LoginTest(){
        LoginPage lp = new LoginPage(driver);
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        Dashboard dp   = new Dashboard(driver );
        Boolean validation=dp.ValidationImage();

        Assert.assertEquals(validation,true,"if test pass then succesfull login or if fail then password is incorrect");

    }

    @Test(priority = 3)
    public void continueBtnPopupTest(){
        LoginPage lp = new LoginPage(driver);
        lp.clearPassword();
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        Dashboard dp = new Dashboard(driver );
        dp.clickContinueBtn();
        Boolean validation=dp.ValidationImage();

        Assert.assertEquals(validation,true,"if test pass then succesfull login or if fail then password is incorrect");

    }

    @Test(priority = 2)
    public void cancelBtnPopupTest(){
        LoginPage lp = new LoginPage(driver);
        // lp.clearPassword();
        lp.inputPassword(rb.getString("password"));
        lp.clickLoginBtn();
        Dashboard dp = new Dashboard(driver );
        dp.clickCancelBtn();
        Boolean result=lp.validateLoginHeading();
        Assert.assertEquals(result,true);
    }*/
}
