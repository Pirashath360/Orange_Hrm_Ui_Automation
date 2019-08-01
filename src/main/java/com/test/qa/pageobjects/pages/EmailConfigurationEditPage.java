package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class EmailConfigurationEditPage extends PageBase {


    private static final Logger LOGGER = Logger.getLogger(StructureEditPage.class);
    private static By hdrEmailConfuguration = By.xpath("//h1");
    private static By cliEditt = By.id("editBtn");
    private static By setMailSentAs = By.id("emailConfigurationForm_txtMailAddress");
    private static By setsendingMethod= By.id("emailConfigurationForm_cmbMailSendingMethod");
    private static By clisendTestMail = By.id("emailConfigurationForm_chkSendTestEmail");


    private static By setTestEmailAddress = By.id("emailConfigurationForm_txtTestEmail");
    private static By cliSave = By.id("editBtn");
    //again display mail cofiguration




    public static boolean EmailConfigurationDisplayed() {
        return getDriver().findElement(hdrEmailConfuguration).isDisplayed();
    }
    public static void ClickEditBtn() {
        getDriver().findElement(cliEditt).click();
    }
    public static void setSetMailSentAs(String mailSentAs) {
        getDriver().findElement(setMailSentAs).clear();
        getDriver().findElement(setMailSentAs).sendKeys(mailSentAs);

    }

    public static void setSetsendingMethod(String setdingMethod) {
        getDriver().findElement(setsendingMethod).sendKeys(setdingMethod);
    }
    public static void ClicksendTestMail() {
        getDriver().findElement(clisendTestMail).click();
    }

    public static void setTestMailAddress(String mailAddress) {
        getDriver().findElement(setTestEmailAddress).sendKeys(mailAddress);
    }
    public static void ClickSaveBtn() {
        getDriver().findElement(cliSave).click();
    }






}