package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPerformanceReviewsPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By ResetBtn= By.id("btnReset");
    private static By EmployeeName= By.id("performanceReview360SearchForm_employeeName");
    private static By JobTitle= By.id("performanceReview360SearchForm_jobTitleCode");
    private static By ToDate= By.id("toDate");
   // private static By SetDate= By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[5]/a");
    private static By SearchBtn= By.xpath("//*[@id=\"btnSearch\"]");
    private static By GetResult= By.xpath("//*[@colspan=\"7\"]");
    private static By clickdate= By.xpath(" //a[text()=\"10\"]");
    private static By Reviwwe= By.id("performanceReview360SearchForm_reviwerName");










    public static boolean SearchPerformanceReviewDisplyed() {
        return getDriver().findElement(ResetBtn).isDisplayed();
    }
    public static void setEmployeeName(String employeeName) {
        getDriver().findElement(EmployeeName).sendKeys(employeeName);

    }
    public static void setJobTitle(String jobTitle) {
        //getDriver().findElement(JobTitle).clear();
        getDriver().findElement(JobTitle).sendKeys(jobTitle);

    }
    public static void clearData() {

    }
    public static void setToDate(String Date) {
        getDriver().findElement(ToDate).clear();
        getDriver().findElement(ToDate).sendKeys(Date);
        getDriver().findElement(ToDate).sendKeys(Keys.END.ENTER);

    }

    public static void ClickSearchBtn() {
        implicitWait(5);
        //PageBase.waiTillClickable(SearchBtn,5);
        getDriver().findElement(SearchBtn).click();
        //getDriver().findElement(SearchBtn).click();



    }

    public static void ClickDateClick() {
        getDriver().findElement(clickdate).click();

    }
    public static boolean ResulitsDisplyed() {
        return getDriver().findElement(GetResult).isDisplayed();
    }

    public static void accept() {
        getDriver().switchTo().alert().accept();
    }
    public static void dismiss() {
        getDriver().switchTo().alert().dismiss();
    }





}
