package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests {  WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.err.close();

        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openHomePageTest() {
        // isHomeComponentPresent();
        //System.out.println("Home Component is " + isHomeComponentPresent1());
        Assert.assertTrue(isElementPresent(By.cssSelector("div:nth-child(2)>div>div")));
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector("div:nth-child(2)>div>div"));
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public boolean isHomeComponentPresent1() {
        try {
            driver.findElement(By.xpath("//h1[.='Home Component']"));
            return true;
        }catch (NoSuchElementException ex) {
            return false;
        }
    }

    public boolean isElementPresent1(By locator) {
        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex) {
            return false;
        }
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}
