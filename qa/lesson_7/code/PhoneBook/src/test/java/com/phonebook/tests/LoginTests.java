package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.cssSelector("[href='/login']"))){
            // xpath - //a[.='LOGIN']
            driver.findElement(By.xpath("//button[.='Sign Out']")).click();
        }
    }

    @Test
    public void loginPositiveTest() {
        //click on Login link
        click(By.cssSelector("[href='/login']"));
        //enter email
        type(By.cssSelector("[placeholder='Email']"), "kr@gmail.com");
        //enter password
        type(By.cssSelector("[placeholder='Password']"), "Kr1234567$");
        //click on Registration button
        click(By.name("login"));
        //assert Sign out button is displayed
        Assert.assertTrue(isElementPresent1(By.xpath("//button[.='Sign Out']")));
    }


}
