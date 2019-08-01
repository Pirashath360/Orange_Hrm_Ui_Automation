package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.KPIsSearchPageWithJobTitle;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.PerformanceMenuPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KPIsSearchPageWithJobTitleTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(KPIsSearchPageWithJobTitleTest.class);
    @Test(groups="REGRESSION",priority = 1)
    public void SmokeSearchKpisTest(){
        softAssert = new SoftAssert();
        //softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
       // LOGGER.info("login page is displayed");
       // LoginPage.setusername(Constants.LOGIN_USER_NAME);
        //LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        //LoginPage.clickSubmit();
       // softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        //LOGGER.info("Markplace is displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        PerformanceMenuPage.ClickConfigureBtn();
        LOGGER.info("click the cofigure");
        PerformanceMenuPage.ClickKPIsBtn();
        LOGGER.info("click the Kpis");
        KPIsSearchPageWithJobTitle.getSelectedOption();
        LOGGER.info("get the option");
        KPIsSearchPageWithJobTitle.setDropDownOption(Constants.JOBTITLE1);
        LOGGER.info("set the dropdown");
        KPIsSearchPageWithJobTitle.ClickSearchBtn();
        LOGGER.info("click the search button");
        KPIsSearchPageWithJobTitle.getMessage();
        LOGGER.info("get the message");
        softAssert.assertEquals(KPIsSearchPageWithJobTitle.getMessage(),Constants.getResultMesage,"message not equal");
        softAssert.assertAll();
    }

}

