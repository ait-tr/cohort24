package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()){
            clickOnSignOutButton();
        }
        clickOnLoginLink();
        fillLoginRegistrationForm(new User().setEmail("kr@gmail.com").setPassword("Kr1234567$"));
        clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        //click on ADD link
        clickOnAddLink();
        //  int i = (int) (System.currentTimeMillis() / 1000)%3600;
        //fill in all fields
        fillAddContactForm(new Contact()
                .setName("Karl")
                .setLastname("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Koblenz")
                .setDesc("goalkeeper"));
        //click on save button
        clickOnSaveButton();
        //assert contact is added
        Assert.assertTrue(isContactCreated("Karl"));
    }

}
