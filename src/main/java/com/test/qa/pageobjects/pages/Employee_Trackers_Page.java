package com.test.qa.pageobjects.pages;

import com.test.qa.pageobjects.utils.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Employee_Trackers_Page extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
    private static By GetText= By.xpath("//h1");




    public static boolean isEmployee_Trackers_Displyed() {
        return getDriver().findElement(GetText).isDisplayed();
    }


}
