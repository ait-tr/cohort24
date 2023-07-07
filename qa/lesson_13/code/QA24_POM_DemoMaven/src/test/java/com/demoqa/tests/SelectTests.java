package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SelectMenuPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(wd).getWidgets();
        new SidePanel(wd).selectSelectMenu();
    }

    @Test
    public void selectOldStyleTest() {
        new SelectMenuPage(wd).selectOldStyle("Blue");
    }

    @Test
    public void multiSelectTest() {
        new SelectMenuPage(wd).multiSelect(new String[]{"Blue","Black","Red"});
    }

    @Test
    public void standardMultiSelectTest() {
        new SelectMenuPage(wd).standardMultiSelect(2);
    }
}
