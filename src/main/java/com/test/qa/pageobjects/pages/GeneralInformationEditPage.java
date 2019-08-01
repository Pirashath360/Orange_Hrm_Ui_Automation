package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class GeneralInformationEditPage extends PageBase {
    private  static final Logger LOGGER = Logger.getLogger(HomePage.class);

    private static By cliEdit = By.id("btnSaveGenInfo");
    private static By stOrganizationName = By.id("organization_name");
    private static By stEmail = By.id("organization_email");
    private static By stNote = By.id("organization_note");
    private static By cliSave = By.id("btnSaveGenInfo");
    private static By getMessage = By.xpath("//*[@class=\"message success fadable\"]");



    public static void clickEditBtn(){
        LOGGER.info(" Click edit Button");
        getDriver().findElement(cliEdit).click();
    }
    public static void SetOrganizationName(String organ){
        LOGGER.info(" set organization name");
        getDriver().findElement(stOrganizationName).sendKeys(organ);
    }

    public static void SetEmail(String email){
        LOGGER.info(" Set Email  ");
        getDriver().findElement(stEmail).sendKeys(email);
    }
    public static void SetNote(String note){
        LOGGER.info(" Set note ");
        getDriver().findElement(stNote).sendKeys(note);
    }
    public static void clickSave(){
        LOGGER.info(" click the save  ");
        getDriver().findElement(cliSave).click();
    }
    public static boolean DisplayMesage(){
        LOGGER.info("message is displayed");
        return getDriver().findElement(getMessage).isDisplayed();

    }

}
