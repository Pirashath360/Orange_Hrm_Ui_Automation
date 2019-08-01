package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class AddManageReviewPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(AddManageReviewPage.class);
    private static By AddClick= By.id("btnAdd");
    private static By employee= By.id("saveReview360Form_employee");
    private static By supervisorReviwer= By.id("saveReview360Form_supervisorReviewer");
    private static By startDate= By.id("saveReview360Form_workPeriodStartDate");
    private static By EndDate= By.id("saveReview360Form_workPeriodEndDate");
    private static By DueDate= By.id("saveReview360Form_dueDate");
    private static By saveclick= By.id("saveBtn");




    public static void clickAddBtn(){
        LOGGER.info("manage review Click Add Button");
        getDriver().findElement(AddClick).click();
    }
    public static void setEmployee(String employ){
        LOGGER.info("set employee name");
        getDriver().findElement(employee).sendKeys(employ);
    }

    public static String getSelectedOption() {
        Select dropDownOption = new Select(getDriver().findElement(employee));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void setToString() { getDriver().findElement(employee).sendKeys(Keys.ENTER);
    }


        public static void setDropDownOption(String option) {
        Select dropDownOption = new Select(getDriver().findElement(employee));
        dropDownOption.selectByVisibleText(option);
    }


   public static void setSupervisorReviwer(String supervisor){
        LOGGER.info("set supervisorReviwer name");
        getDriver().findElement(supervisorReviwer).sendKeys(supervisor);
    }

    public static void setStartDate(String start){
        LOGGER.info("set start date");
        getDriver().findElement(startDate).sendKeys(start);
    }
    public static void setEndDate(String End){
        LOGGER.info("set end date");
        getDriver().findElement(EndDate).sendKeys(End);
    }
    public static void setDueDate(String Due){
        LOGGER.info("set due date");
        getDriver().findElement(DueDate).sendKeys(Due);
    }
    public static void clicksavebutton(){
        LOGGER.info("click save button");
        getDriver().findElement(saveclick).click();
    }

}
