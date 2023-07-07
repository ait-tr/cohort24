package com.demoqa.tests;

import com.demoqa.pages.BrowserWindowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(wd).getAlertsFrameWindows();
        new SidePanel(wd).selectBrowserWindows();
    }

    @Test
    public void openNewWindowTest() {
        new BrowserWindowsPage(wd).switchToNewWindow(1)
                .assertNewWindowMessage("This is a sample page");
    }
}
