package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()){
            clickOnSignOutButton();
        }
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        //click on Login link
        clickOnLoginLink();
        //enter email
        //enter password
        fillLoginRegistrationForm(new User()
                .setEmail("kr@gmail.com")
                .setPassword("Kr1234567$"));
        //click on Registration button
        clickOnRegistrationButton();
        //assert warning appears
        Assert.assertTrue(isAlertPresent());
    }

}
