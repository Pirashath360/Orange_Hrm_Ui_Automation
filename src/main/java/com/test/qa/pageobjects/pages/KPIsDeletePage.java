package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KPIsDeletePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(KPIsDeletePage.class);
    private static By checkBox1 = By.id("ohrmList_chkSelectAll");
    private static By checkBox2 = By.id("ohrmList_chkSelectRecord_1");
    private static By DeleteBtn = By.id("btnDelete");
    private static By OKBtn = By.id("dialogDeleteBtn");




    public static void checkCheckBox1() {
        WebElement checkbox = getDriver().findElement(checkBox1);
        if (!checkbox.isSelected())
            checkbox.click();
    }
    public static void unCheckCheckBox1() {
        WebElement checkbox = getDriver().findElement(checkBox1);
        if (checkbox.isSelected())
            checkbox.click();
    }
    public static boolean isCheckBox1Checked() {
        return getDriver().findElement(checkBox1).isSelected();
    }
    public static void checkCheckBox2() {
        WebElement checkbox = getDriver().findElement(checkBox2);
        if (!checkbox.isSelected())
            checkbox.click();
    }
    public static void unCheckCheckBox2() {
        WebElement checkbox = getDriver().findElement(checkBox2);
        if (checkbox.isSelected())
            checkbox.click();
    }
    public static boolean isCheckBox2Checked() {
        return getDriver().findElement(checkBox2).isSelected();
    }

    public static void clickDeleteBtn(){
        getDriver().findElement(DeleteBtn).click();
    }
    public static boolean Diplayconfirmpopup(){
        return getDriver().findElement(OKBtn).isDisplayed();
    }
    public static void clickOKBtn(){
        getDriver().findElement(OKBtn).click();
    }

}














