package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class StructureEditPage extends PageBase {

    private static final Logger LOGGER = Logger.getLogger(StructureEditPage.class);
    private static By hdrOrganizationStructure=By.xpath("//h1");
    private static By cliEdit=By.id("btnEdit");
    private static By clickAdministrationAdd=By.id("treeLink_addChild_5");
    private static By setUnitId=By.id("txtUnit_Id");
    private static By setName=By.id("txtName");
    private static By setDescription=By.id("txtDescription");
    private static By cliSave=By.id("btnSave");




    public static boolean OrganizationStructureDisplayed() {
        return getDriver().findElement(hdrOrganizationStructure).isDisplayed();
    }


    public static void ClickEditBtn() {
        getDriver().findElement(cliEdit).click();
    }
    public static void ClickAdministrationAdd() {
        getDriver().findElement(clickAdministrationAdd).click();
    }
    public static void setSetUnitId(String id) {
        getDriver().findElement(setUnitId).sendKeys(id);
    }
    public static void setSetName(String name) {
        getDriver().findElement(setName).sendKeys(name);
    }

    public static void setSetDescription(String dis) {
        getDriver().findElement(setDescription).sendKeys(dis);
    }
    public static void clickSave() {
        getDriver().findElement(cliSave).click();
    }


}
