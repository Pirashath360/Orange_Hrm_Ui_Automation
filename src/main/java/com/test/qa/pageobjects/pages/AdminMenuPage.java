package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class AdminMenuPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By AdminBtn= By.id("menu_admin_viewAdminModule");
    private static By OrganizationBtn= By.id("menu_admin_Organization");
    private static By GeneralInformation= By.id("menu_admin_viewOrganizationGeneralInformation");
    private static By StructureBtn= By.id("menu_admin_viewCompanyStructure");
    private static By ConfigurationBtn= By.id("menu_admin_Configuration");
    private static By EmailConfigurationBtn= By.id("menu_admin_listMailConfiguration");
    private static By ModulesBtn= By.id("menu_admin_viewModules");




    public static void clickAdminBtn(){
        LOGGER.info("click Admin menu");
        getDriver().findElement(AdminBtn).click();
    }

    public static void clickOrganizations(){
        LOGGER.info("click organizations");
        getDriver().findElement(OrganizationBtn).click();
   }
    public static void clickGeneralinformation(){
        LOGGER.info("click the general information");
        getDriver().findElement(GeneralInformation).click();
    }
    public static void clickStructure(){
        LOGGER.info("click the Structure");
        getDriver().findElement(StructureBtn).click();
    }
    public static void clickConfiguration(){
        LOGGER.info("click the cofiguration");
        getDriver().findElement(ConfigurationBtn).click();
    }
    public static void clickEmailConfiguration(){
        LOGGER.info("click Email cofiguration");
        getDriver().findElement(EmailConfigurationBtn).click();
    }


    public static void clickModules(){
        LOGGER.info("click modules ");
        getDriver().findElement(ModulesBtn).click();
    }




}





