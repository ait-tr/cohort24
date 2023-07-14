package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase{

    @Test
    public void addReminderWithDefaultData() {

        int quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //fill reminder title
        app.getReminder().enterTitle("Test");
        //save reminder
        app.getReminder().saveReminder();
        int quantityAfterAdd = app.getMainScreen().getTotalReminders();
        //assert to add new reminder
        Assert.assertEquals(quantityAfterAdd,quantityBeforeAdd+1);

    }

    @Test
    public void addReminderPositiveTest () {
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //fill reminder title
        app.getReminder().enterTitle("1 September");
        //select date
        app.getReminder().selectDate("future","SEP",3,0,"future","2024");
        //select time
        app.getReminder().selectTime("am",405,690,542,1191);
        //enter repetition interval
        //  app.getReminder().addReminderInterval("");
        //select type of repetition
        //   app.getReminder().getTypeOfRepetition("");
        //save reminder
        app.getReminder().saveReminder();
    }

    //  xpath = //*[@text='" + typeRep + "']
}
