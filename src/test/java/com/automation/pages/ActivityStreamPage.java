package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;

public class ActivityStreamPage extends AbstractPageBase {

    @FindBy(id = "feed-add-post-form-link-text")
    protected WebElement moreBtn;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[1]/span[2]")
    protected WebElement fileBtn;

    @FindBy(name = "bxu_files[]")
    protected WebElement uploadFileImgBtn;

    @FindBy(id = "blog-submit-button-save")
    protected WebElement sendBtn;


    public ActivityStreamPage() { PageFactory.initElements(driver,this); }

    public void MoveToUploadFile()
    {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.elementToBeClickable(moreBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fileBtn)).click();
    }

    public void uploadFile()
    {
        BrowserUtils.waitForPageToLoad(10);
        String filePath = System.getProperty("user.dir") + "/pom.xml";
        uploadFileImgBtn.sendKeys(filePath);
        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }
}
