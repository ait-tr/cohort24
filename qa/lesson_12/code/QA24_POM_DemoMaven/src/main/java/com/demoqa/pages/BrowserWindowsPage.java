package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage{

    public BrowserWindowsPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(id = "windowButton")
    WebElement windowButton;

    public BrowserWindowsPage switchToNewWindow(int index) {

        click(windowButton);
        List<String> windows = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(windows.get(index));

        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public BrowserWindowsPage assertNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,15));
        return this;
    }

}
