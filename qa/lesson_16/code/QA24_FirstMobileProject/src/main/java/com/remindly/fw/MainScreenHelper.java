package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainScreenHelper extends BaseHelper{

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isMainScreenMessagePresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public int getTotalReminders() {

        List<WebElement> id = driver.findElements(By.id("thumbnail_image"));
        int idCount = id.size();
        System.out.println("Total reminders quantity: " + idCount);

        return idCount;
    }
}
