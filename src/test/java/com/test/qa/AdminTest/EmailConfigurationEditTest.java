package com.test.qa.AdminTest;

import com.test.qa.pageobjects.pages.AdminMenuPage;
import com.test.qa.pageobjects.pages.EmailConfigurationEditPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmailConfigurationEditTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(EmailConfigurationEditTest.class);

    @Test(groups = "REGRESSION", priority = 1)
    public void AddManageReviewTest() {

        softAssert = new SoftAssert();
        AdminMenuPage.clickAdminBtn();
        AdminMenuPage.clickConfiguration();
        AdminMenuPage.clickEmailConfiguration();
       softAssert.assertTrue(EmailConfigurationEditPage.EmailConfigurationDisplayed(),"cofguration is not displayed");
       EmailConfigurationEditPage.ClickEditBtn();
        EmailConfigurationEditPage.setSetMailSentAs(Constants.mailsentas);
        LOGGER.info("set the mailsentas");
        EmailConfigurationEditPage.setSetsendingMethod(Constants.sendingmetho);
        LOGGER.info("setsending mail");
        EmailConfigurationEditPage.ClicksendTestMail();
        EmailConfigurationEditPage.setTestMailAddress(Constants.mailsentas);
        EmailConfigurationEditPage.ClickSaveBtn();
        softAssert.assertTrue(EmailConfigurationEditPage.EmailConfigurationDisplayed(),"emailcofiguration is not displayed");
        softAssert.assertAll();
    }
}
