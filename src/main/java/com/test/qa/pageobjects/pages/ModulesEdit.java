package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class ModulesEdit extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(StructureEditPage.class);
    private static By hdrModuleConfiguration = By.id("saveFormHeading");
    private static By checkEnableAdminchexbox = By.id("moduleConfig_admin");
    private static By cliEdittt = By.id("btnSave");
    private static By checckEnablePimModule= By.id("moduleConfig_pim");
    private static By checckEnableMaintenenceModule= By.id("moduleConfig_maintenance");
    private static By clikkSavee= By.id("btnSave");




    public static boolean ModuleConfigurationDisplayed() {
        return getDriver().findElement(hdrModuleConfiguration).isDisplayed();
    }

    public static void ClickAdmincheckbox() {
        getDriver().findElement(checkEnableAdminchexbox).click();
    }
    public static void ClickEdittuBtn() {
        getDriver().findElement(cliEdittt).click();
    }
    public static void ClickEnablePimModule() {
        getDriver().findElement(checckEnablePimModule).click();
    }

    public static void checckEnableMaintenenceModule() {
        getDriver().findElement(checckEnableMaintenenceModule).click();
    }
    public static void ClickSaveeBtn() {
        getDriver().findElement(clikkSavee).click();
    }



}
