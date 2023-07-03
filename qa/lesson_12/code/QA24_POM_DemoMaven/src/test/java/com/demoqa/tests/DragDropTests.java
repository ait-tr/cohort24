package com.demoqa.tests;

import com.demoqa.pages.DroppablePage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDropTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(wd).getInteractions();
        new SidePanel(wd).selectDroppable();
    }

    @Test
    public void actionDragMeTest() {
        new DroppablePage(wd).hideAd();
        new DroppablePage(wd).actionDragMe();
    }
}
