package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver wd;

    public BasePage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(wd, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text!=null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }


}
