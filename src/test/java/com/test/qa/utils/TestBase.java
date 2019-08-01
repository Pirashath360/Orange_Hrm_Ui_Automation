package com.test.qa.utils;


import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.pageobjects.utils.PageBase;

import org.apache.log4j.Logger;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class TestBase  {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(TestBase.class);

    @BeforeTest
    public void beforeTest() {
        System.out.println("Test Running " + this.getClass().toString());
    }

    @BeforeMethod
    public void loadBrowser() {
        LOGGER.info("Initiate Browser");
        try {
            PageBase.initiateDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        LOGGER.info("Browser Initiated");
        // login page is launched shath

        softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login Logo is not displyed ");
        LOGGER.info("login page is displayed");
        LoginPage.setusername(Constants.LOGIN_USER_NAME);
        LOGGER.info("set the user");
        LoginPage.setPassword(Constants.LOGIN_PASSWORD);
        LOGGER.info("set the password");
        LoginPage.clickSubmit();
        LOGGER.info("click the submit");
        softAssert.assertTrue(LoginPage.MarkplaceDisply(),"Markrtplace  is not dispalyed");
        LOGGER.info("display the MarketplaceDisplay");
        softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home page is not displayed");
        LOGGER.info("Homepage is Displayed");
    }
    @BeforeMethod
    public void beforeMethod() {
        softAssert = new SoftAssert();
    }

    @BeforeMethod
    public void nameBefore(Method method) {
        LOGGER.info("Test name: " + method.getName());
    }

    @AfterMethod
    public void closeBrowser() {
        LOGGER.info("Closing Browser");
        // if false can the stop
      PageBase.closeDriver();
        LOGGER.info("Browser Closed");
    }

    @AfterMethod
    public void afterMethod(Method method, ITestResult result) {
        LOGGER.info("Executed test case name:" + method.getName() + " Execution Results: " + result.toString());
    }
}
