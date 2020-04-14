package com.automation.tests;

import com.automation.pages.ActivityStreamPage;
import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends AbstractBaseTest {

    @Test
    public void uploadFileTest()
    {
        extentReports.createTest("Upload file Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.MoveToUploadFile();
        activityStreamPage.uploadFile();
    }
}
