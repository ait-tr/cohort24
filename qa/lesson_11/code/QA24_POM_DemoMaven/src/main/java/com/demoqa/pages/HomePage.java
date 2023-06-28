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
        click(alertsFrameWindows);
        return new SidePanel(wd);
    }

}
