package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.Employee_Trackers_Page;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.PerformanceMenuPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Employee_Trackers_Page_Test extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsAddTest.class);
    @Test(groups="REGRESSION",priority = 1)
    //verify performance page Displayed
    public  void SmokeEmployeeTrackersTest(){
        softAssert = new SoftAssert();
     //   softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
       // LOGGER.info("login page is displayed");
       // LoginPage.setusername(Constants.LOGIN_USER_NAME);
       // LOGGER.info("set the user");
       // LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        //LOGGER.info("set the password");
      //  LoginPage.clickSubmit();
       // LOGGER.info("click the submit");
       // softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
       // LOGGER.info("display the MarketplaceDisplay");
       // softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
       // LOGGER.info("Homepage is Displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        LOGGER.info("performance is displayed");
        PerformanceMenuPage.ClickEmployeeTrackBtn();
        LOGGER.info("click the employee trackers");
        softAssert.assertTrue(Employee_Trackers_Page.isEmployee_Trackers_Displyed(),"employee trackers is not displyed ");
        softAssert.assertAll();


    }
}
