package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()){
            // xpath - //a[.='LOGIN']
            clickOnSignOutButton();
        }
    }

    @Test
    public void loginPositiveTest() {
        //click on Login link
        clickOnLoginLink();
        //enter email
        fillLoginRegistrationForm(new User().setEmail("kr@gmail.com").setPassword("Kr1234567$"));
        //click on Registration button
        clickOnLoginButton();
        //assert Sign out button is displayed
        Assert.assertTrue(isSignOutButtonPresent());
    }

    @Test
    public void loginNegativeWithoutPasswordTest() {
        //click on Login link
        clickOnLoginLink();
        //enter email
        fillLoginRegistrationForm(new User().setEmail("kr@gmail.com"));
        //click on Registration button
        clickOnLoginButton();
        //assert Sign out button is displayed
        Assert.assertTrue(isAlertPresent());
    }


}
