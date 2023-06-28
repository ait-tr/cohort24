package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @Test
    public void openHomePage() {
        new HomePage(wd).getAlertsFrameWindows();
    }
}
