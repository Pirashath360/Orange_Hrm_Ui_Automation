package com.test.qa.testdata;

import com.test.qa.pageobjects.utils.Constants;
import org.testng.annotations.DataProvider;

public class UserDetaisDataProvider {
    @DataProvider
    public static Object[][] MultipleUserDetails() {
        return new Object[][]{
                {"", "", Constants.LOGIN_INVALID_MSG},
                {"John", "John123",Constants.LOGIN_INVALID_MSG2},
                {"Siva", "Siva456",Constants.LOGIN_INVALID_MSG2},
                {Constants.LOGIN_USER_NAME, "rfffggg",Constants.LOGIN_INVALID_MSG2},
                { "rfffggg",Constants.LOGIN_PASSWORD, Constants.LOGIN_INVALID_MSG2},
                {Constants.LOGIN_USER_NAME, "",Constants.LOGIN_INVALID_MSG3},
                { "",Constants.LOGIN_PASSWORD, Constants.LOGIN_INVALID_MSG4},




        };
    }

}
