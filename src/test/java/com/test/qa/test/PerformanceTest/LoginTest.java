package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.testdata.UserDetaisDataProvider;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);




    //data provider,data give that  String username, String password,String status
    @Test(groups = "REGRESSION",priority = 1)
    public void LoginSmokeTest(){
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
       LoginPage.setusername(Constants.LOGIN_USER_NAME);
      LoginPage.setPassword(Constants.LOGIN_PASSWORD);
       LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        LOGGER.info("Markplace is displayed");
        softAssert.assertAll();
    }

    @Test( groups="REGRESSION",priority = 2, dataProvider ="MultipleUserDetails", dataProviderClass = UserDetaisDataProvider.class)
    public void LoginSuperTest(String username,String password,String status  ) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LoginPage.setusername(username);
        LoginPage.setPassword(password);
        LoginPage.clickSubmit();
        softAssert.assertEquals(LoginPage.getmassge(), status);
        softAssert.assertAll();


    }
}


