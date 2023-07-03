package com.demoqa.tests;

import com.demoqa.pages.AlertsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(wd).getAlertsFrameWindows();
        new SidePanel(wd).selectAlerts();
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(wd).sendMessageToAlert("Hello world!")
                .assertMessage("Hello world!");
    }
}
