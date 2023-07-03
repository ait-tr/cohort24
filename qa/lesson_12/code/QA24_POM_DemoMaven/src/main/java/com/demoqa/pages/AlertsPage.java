package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{

    public AlertsPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertsPage sendMessageToAlert(String message) {
        clickWithJSExecutor(promtButton,0,300);

        if (message != null) {
            wd.switchTo().alert().sendKeys(message);
            wd.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage assertMessage(String message) {

        Assert.assertTrue(promptResult.getText().contains(message));
        return this;
    }
}
