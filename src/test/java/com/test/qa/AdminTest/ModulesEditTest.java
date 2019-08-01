package com.test.qa.AdminTest;

import com.test.qa.pageobjects.pages.AdminMenuPage;
import com.test.qa.pageobjects.pages.ModulesEdit;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ModulesEditTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(GeneralInformationEditTest.class);

    @Test(groups = "REGRESSION", priority = 1)
    public void AddManageReviewTest() {
        softAssert = new SoftAssert();

        AdminMenuPage.clickAdminBtn();
        AdminMenuPage.clickConfiguration();
        AdminMenuPage.clickModules();
      softAssert.assertTrue(ModulesEdit.ModuleConfigurationDisplayed(),"not display");
        ModulesEdit.ClickAdmincheckbox();

        ModulesEdit.ClickEdittuBtn();
        ModulesEdit.ClickEnablePimModule();
        ModulesEdit.checckEnableMaintenenceModule();
        ModulesEdit.ClickSaveeBtn();








    }
}
