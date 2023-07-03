package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
    WebElement alertsFrameWindows;


    public SidePanel getAlertsFrameWindows() {
        clickWithJSExecutor(alertsFrameWindows, 0, 300);
        return new SidePanel(wd);
    }

    @FindBy(xpath = "//h5[.='Widgets']")
    WebElement widgets;

    public SidePanel getWidgets() {
        clickWithJSExecutor(widgets, 0, 300);
        return new SidePanel(wd);
    }

    @FindBy(xpath = "//h5[.='Interactions']")
    WebElement interactions;

    public SidePanel getInteractions() {
        clickWithJSExecutor(interactions, 0, 300);
        return new SidePanel(wd);
    }
}
