package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.AddManageReviewPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.PerformanceMenuPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddManageReviewTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsAddTest.class);

    @Test(groups = "REGRESSION", priority = 1)
    public void AddManageReviewTest() {

        softAssert = new SoftAssert();
       // softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
       // LOGGER.info("login page is displayed");
       // LoginPage.setusername(Constants.LOGIN_USER_NAME);
        //LOGGER.info("set the user");
       // LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        //LOGGER.info("set the password");
       // LoginPage.clickSubmit();
       // LOGGER.info("click the submit");
       // softAssert.assertTrue(LoginPage.MarkplaceDisply(), "Markrtplace  is not dispalyed");
        //LOGGER.info("display the MarketplaceDisplay");
      //  softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home page is not displayed");
        //LOGGER.info("Homepage is Displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue(PerformanceMenuPage.isPerformanceDisplayed(), "Performance page is not Displayed");
        LOGGER.info("performance is displayed");
        PerformanceMenuPage.ClickManageReviewBtn1();
        LOGGER.info("click the manageReviewBtn1");
        PerformanceMenuPage.ClickManageReviwBtn2();
        LOGGER.info("click the manageReviewBtn2");
        AddManageReviewPage.clickAddBtn();
        LOGGER.info("click the add btn");
        //// run is not
        AddManageReviewPage.setEmployee(Constants.employee);
        AddManageReviewPage.getSelectedOption();
        AddManageReviewPage.setToString();
        LOGGER.info("set string");
        AddManageReviewPage.setDropDownOption(Constants.employee1);
       AddManageReviewPage.setSupervisorReviwer(Constants.supervisor);
        AddManageReviewPage.setStartDate(Constants.startdate);
        AddManageReviewPage.setEndDate(Constants.enddate);
        AddManageReviewPage.setDueDate(Constants.Duedate);
        AddManageReviewPage.clicksavebutton();
        LOGGER.info("click save button");
        softAssert.assertAll();
    }

}

