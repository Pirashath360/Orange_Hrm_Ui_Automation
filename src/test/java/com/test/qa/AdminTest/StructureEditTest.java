package com.test.qa.AdminTest;

import com.test.qa.pageobjects.pages.AdminMenuPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.StructureEditPage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StructureEditTest extends TestBase {


    private static final Logger LOGGER = Logger.getLogger(GeneralInformationEditTest.class);

    @Test(groups = "REGRESSION", priority = 1)
    public void AddManageReviewTest() {
        softAssert = new SoftAssert();
       // softAssert.assertTrue(LoginPage.isLoginPageDisplayed(), "Login Logo is not displyed ");
       // LOGGER.info("login page is displayed");
        //LoginPage.setusername(Constants.LOGIN_USER_NAME);
      //  LOGGER.info("set the user");
      //  LoginPage.setPassword(Constants.LOGIN_PASSWORD);
       // LOGGER.info("set the password");
       // LoginPage.clickSubmit();
        //LOGGER.info("click the submit");
        //softAssert.assertTrue(LoginPage.MarkplaceDisply(), "Markrtplace  is not dispalyed");
       // LOGGER.info("display the MarketplaceDisplay");
       // softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home page is not displayed");
      //  LOGGER.info("Homepage is Displayed");
        AdminMenuPage.clickAdminBtn();
        AdminMenuPage.clickOrganizations();
        AdminMenuPage.clickStructure();
       softAssert.assertTrue(StructureEditPage.OrganizationStructureDisplayed(),"not display");
       StructureEditPage.ClickEditBtn();
        StructureEditPage.ClickAdministrationAdd();
        StructureEditPage.setSetUnitId(Constants.unitid);
        StructureEditPage.setSetName(Constants.Nameee);
        StructureEditPage.setSetDescription(Constants.discriptte);
        StructureEditPage.clickSave();
        softAssert.assertAll();

    }
}
