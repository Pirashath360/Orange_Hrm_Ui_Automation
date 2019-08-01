package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.PerformanceMenuPage;
import com.test.qa.pageobjects.pages.SearchPerformanceReviewsPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.test.qa.pageobjects.utils.PageBase.getDriver;

public class Search_Performance_Review_Test extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(KPIsAddTest.class);

    @Test(groups = "REGRESSION", priority = 1)
    //verify perfSearchPerformanceReview page Displayed
    public void SmokeSearchPerformanceReviewTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LOGGER.info("set the user name");
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LOGGER.info("set the password");
        LoginPage.clickSubmit();
        LOGGER.info("click the submit button");
        softAssert.assertTrue(LoginPage.MarkplaceDisply(), "Markrtplace  is not dispalyed");
        LOGGER.info("markplace is displayed");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home page is not displayed");
        LOGGER.info("home page is displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue(PerformanceMenuPage.isPerformanceDisplayed(), "Performance page is not Displayed");
        LOGGER.info("perfomance is displayed");
        PerformanceMenuPage.ClickManageReviewBtn1();
        PerformanceMenuPage.ClickManageReviwBtn2();
        softAssert.assertTrue(SearchPerformanceReviewsPage.SearchPerformanceReviewDisplyed(), "SearchPerformanceReview page is not Displayed");
        LOGGER.info("SearchperfomanceReview is displayed");
        SearchPerformanceReviewsPage.ClickSearchBtn();
        LOGGER.info("click the search btn");
        // check i am

        softAssert.assertAll();
    }

    @Test(groups = "REGRESSION", priority = 2)
    //verify perfSearchPerformanceReview page
    public void SearchPerformanceReviewTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LOGGER.info("set the user name");
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LOGGER.info("set the password");
        LoginPage.clickSubmit();
        LOGGER.info("click the submit button");
        softAssert.assertTrue(LoginPage.MarkplaceDisply(), "Markrtplace  is not dispalyed");
        LOGGER.info("markplace is displayed");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home page is not displayed");
        LOGGER.info("home page is displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue(PerformanceMenuPage.isPerformanceDisplayed(), "Performance page is not Displayed");
        LOGGER.info("perfomance is displayed");
        PerformanceMenuPage.ClickManageReviewBtn1();
        PerformanceMenuPage.ClickManageReviwBtn2();
        softAssert.assertTrue(SearchPerformanceReviewsPage.SearchPerformanceReviewDisplyed(), "SearchPerformanceReview page is not Displayed");
        LOGGER.info("SearchperfomanceReview is displayed");
        SearchPerformanceReviewsPage.setEmployeeName(Constants.searchJob);
        LOGGER.info("set the employee name");
        SearchPerformanceReviewsPage.setJobTitle(Constants.JOBTITLE1);
        LOGGER.info("set the jobtitle");
        //SearchPerformanceReviewsPage.clearData();
        LOGGER.info("clear data");
        SearchPerformanceReviewsPage.setToDate(Constants.Date);
        LOGGER.info("set the date");
        //getDriver().switchTo().defaultContent();
       // SearchPerformanceReviewsPage.implicitWait(2);
       // SearchPerformanceReviewsPage.dismiss();
        PageBase.implicitWait(4);
       SearchPerformanceReviewsPage.ClickSearchBtn();
        LOGGER.info("click the search btn");
      // SearchPerformanceReviewsPage.ResulitsDisplyed();
      //  LOGGER.info("results displayed");
        // verify get and set

        softAssert.assertAll();

    }



}