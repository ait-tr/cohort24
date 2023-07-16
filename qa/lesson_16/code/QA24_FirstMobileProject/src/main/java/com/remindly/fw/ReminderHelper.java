package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends BaseHelper{

    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterTitle(String title) {
        type(By.id("reminder_title"),title);
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }

    public void selectDate(String period, String month, int number, int index, String period2, String year)
    {
        tap(By.id("date"));
        swipeToMonth(period,month,number);
        tapOnDate(index);
        tapOnYear();
        swipeToYear(period2,year);
        tap(By.id("ok"));
    }

    private void tapOnDate(int index) {
        List <WebElement> days = driver.findElements(By.className("android.view.View"));
        days.get(index).click();
    }

    private void swipeToMonth(String period, String month, int number) {

        pause(1000);

        if (!getSelectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (period.equals("future")) {
                    swipe(0.7,0.4);
                } else if (period.equals("past")) {
                    swipe(0.5,0.8);
                }
            }
        }
    }

    public String getSelectedMonth() {
        return driver.findElement(By.id("date_picker_month")).getText();
    }

    private void tapOnYear() {
        tap(By.id("date_picker_year"));
    }

    private void swipeToYear(String period2, String year) {

        pause(1000);

        if (!getSelectedYear().equals(year)) {
            if (period2.equals("future")) {
                swipeUntilNeededYear(year,0.6,0.5);
            } else if (period2.equals("past")) {
                swipeUntilNeededYear(year,0.5,0.6);
            }
        }
        tap(By.id("month_text_view'"));
    }

    public String getSelectedYear() {
        return driver.findElement(By.id("month_text_view")).getText();
    }

    public void swipeUntilNeededYear(String year, double startPoint, double stopPoint) {
        while (!getSelectedYear().equals(year)) {
            moveInElement(By.className("android.widget.ListView"),startPoint,stopPoint);
            getSelectedYear();
        }
    }

    public void selectTime(String timeOfDay,int xHour, int yHour, int xMin, int yMin) {
        tap(By.id("time"));
        pause(1000);
        if (timeOfDay.equals("am")) {
            tapWithCoordinates(288,1324);
        } else if (timeOfDay.equals("pm")) {
            tapWithCoordinates(795,1324);
        }
        tapWithCoordinates(xHour,yHour);
        tapWithCoordinates(xMin,yMin);
        tap(By.id("ok"));
    }
}
