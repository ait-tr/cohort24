package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DroppablePage extends BasePage {

    public DroppablePage(WebDriver wd) {
        super(wd);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DroppablePage actionDragMe() {

        Actions actions = new Actions(wd);
        actions.dragAndDrop(dragMe,dropHere).perform();

        String textTo = dropHere.getText();

        if (textTo.equals("Dropped!")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        return this;
    }
}
