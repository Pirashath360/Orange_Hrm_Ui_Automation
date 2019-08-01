package com.test.qa.test.PerformanceTest;

import com.test.qa.pageobjects.pages.*;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KPIsDeleteTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsAddTest.class);

    @Test(groups="REGRESSION",priority = 1)
    public  void SmokeKPIsDeleteTest(){
        //wrong
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance menu page");
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        PerformanceMenuPage.ClickConfigureBtn();
        PerformanceMenuPage.ClickKPIsBtn();
        LOGGER.info("click the kpis button");
        KPIsDeletePage.checkCheckBox1();
        LOGGER.info("check the checkbox1");
       // KPIsDeletePage.unCheckCheckBox1();
       // LOGGER.info("uncheck the checkbox1");
        KPIsDeletePage.isCheckBox1Checked();
        LOGGER.info("checked checkbox1");
        //KPIsDeletePage.checkCheckBox2();
        //LOGGER.info("check the checkbox2");
      //  KPIsDeletePage.unCheckCheckBox2();
       // LOGGER.info("uncheck the checkbox2");
       // KPIsDeletePage.isCheckBox2Checked();
       // LOGGER.info("checkec checkbox2");
        KPIsDeletePage.implicitWait(2);
        LOGGER.info("implicity wait");
        KPIsDeletePage.clickDeleteBtn();
        LOGGER.info("click delete button");
        softAssert.assertTrue(KPIsDeletePage.Diplayconfirmpopup(),"not diplay the popup");
        KPIsDeletePage.clickOKBtn();
        LOGGER.info("click the ok button");
    }
    @Test(groups="REGRESSION",priority = 2)
    public  void SmokeKPIsDeleteTest2(){
        // last verify
        ////gregergergergr shathhhhuuu
       // KPIsAddTest.verifyKPIsTest2();
       // KPIsAddTest.SmokeKPIsTest();
        softAssert = new SoftAssert();
       // softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
       // LOGGER.info("login page is displayed");
        //LoginPage.setusername(Constants.LOGIN_USER_NAME);
        //LOGGER.info("set the user");
       // LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        //LOGGER.info("set the password");
       // LoginPage.clickSubmit();
       // LOGGER.info("click the submit");
        //softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        //LOGGER.info("display the MarketplaceDisplay");
        //softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not displayed");
       // LOGGER.info("Homepage is Displayed");
        PerformanceMenuPage.ClickPerformanceBtn();
        LOGGER.info("click the performance button");
        softAssert.assertTrue( PerformanceMenuPage.isPerformanceDisplayed(),"Performance page is not Displayed");
        LOGGER.info("performance is displayed");
        PerformanceMenuPage.ClickConfigureBtn();
        LOGGER.info("click the configure");
        PerformanceMenuPage.ClickKPIsBtn();
        LOGGER.info("click the ClickKPIsBtn");
        KPIsAddPage.clickAddBtn();
        LOGGER.info("click add button");
        softAssert.assertTrue(KPIsAddPage.isKPIsAddPageDisplayed(),"KPIs Add Page is not Displayed");
        LOGGER.info("addpage is displayed");
        KPIsAddPage.setJobTitle(Constants.JOBTITLE1);
        LOGGER.info("set the JobTitle");
        KPIsAddPage.setKeyPerformanceIndicator(Constants.INDICATOR);
        LOGGER.info("set the keyperformanceIndictor");
        KPIsAddPage.setMinimumRating(Constants.MinimumRating);
        LOGGER.info("setminimum rating");
        KPIsAddPage.setMaximumRating(Constants.MaximumRating);
        LOGGER.info("setMaximumRating");
        KPIsAddPage.clickMakeScale();
        LOGGER.info("click the makeScale");
        KPIsAddPage.clickSaveBtn();
        LOGGER.info("click the save btn");
        /// shahahhsh
        KPIsDeletePage.checkCheckBox1();
        LOGGER.info("check the checkbox1");
       // KPIsDeletePage.unCheckCheckBox1();
        //LOGGER.info("uncheck the checkbox1");
        KPIsDeletePage.isCheckBox1Checked();
        LOGGER.info("checked checkbox1");
        ///implicity wait
        KPIsDeletePage.implicitWait(2);
        LOGGER.info("implicity wait");
        KPIsDeletePage.clickDeleteBtn();
        LOGGER.info("click delete button");
        softAssert.assertTrue(KPIsDeletePage.Diplayconfirmpopup(),"not diplay the popup");
        KPIsDeletePage.clickOKBtn();
        LOGGER.info("click the ok button");



    }


}
