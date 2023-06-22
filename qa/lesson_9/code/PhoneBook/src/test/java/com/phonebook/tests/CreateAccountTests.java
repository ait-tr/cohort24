package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isLoginLinkPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        //click on Login link
        app.getUser().clickOnLoginLink();
        //enter email
        //enter password
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("kr@gmail.com")
                .setPassword("Kr1234567$"));
        //click on Registration button
        app.getUser().clickOnRegistrationButton();
        //assert warning appears
        Assert.assertTrue(app.getUser().isAlertPresent());
    }

}
