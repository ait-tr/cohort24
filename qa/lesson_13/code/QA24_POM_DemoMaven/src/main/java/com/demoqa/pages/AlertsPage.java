package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage acceptTimerAlert() {
        click(timerAlertButton);

        new WebDriverWait(wd, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage selectAlertConfirm(String text) {

        clickWithJSExecutor(confirmButton,0,100);

        if (text != null && text.equalsIgnoreCase("OK")) {
            wd.switchTo().alert().accept();
        } else if (text != null && text.equalsIgnoreCase("Cancel")) {
            wd.switchTo().alert().dismiss();
        }

        return this;
    }

    public AlertsPage assertConfirm(String message) {
        Assert.assertTrue(confirmResult.getText().contains(message));
        return this;
    }
}
