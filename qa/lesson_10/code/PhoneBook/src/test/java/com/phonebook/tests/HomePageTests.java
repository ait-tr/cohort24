package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void openHomePageTest() {
        // isHomeComponentPresent();
        //System.out.println("Home Component is " + isHomeComponentPresent1());
        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
    }

}
