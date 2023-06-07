package com.ait.qa24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class UseLocatorsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementTest() {
        //id
        driver.findElement(By.id("city"));

        //className
        driver.findElement(By.className("navigation-link"));

        //name By.name

        //linkText
        driver.findElement(By.linkText("Search"));

        //partialLinkText
        driver.findElement(By.partialLinkText("Terms"));
    }

    @Test
    public void findElementByCss() {
        //id -> css(#)
        // driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));

        //className -> css(.)
        // driver.findElement(By.className("navigation-link"));
        driver.findElement(By.cssSelector(".navigation-link"));

        //attribute -> css [attr='value']
        driver.findElement(By.cssSelector("[type='text']"));

        //contains -> *
        driver.findElement(By.cssSelector("[class*='offers']"));

        //start with -> ^
        driver.findElement(By.cssSelector("[class^='special']"));

        //end on -> $
        driver.findElement(By.cssSelector("[class$='container']"));
    }

    @Test
    public void findElementByXpath() {
        // xpath - //*[@attr='value']

        //xpath - //*[@id='city']
        // driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='city']"));

        // driver.findElement(By.className("navigation-link"));
        driver.findElement(By.xpath("//*[@class='navigation-link']"));

        //text -> //*[contains(.,'text')]
        driver.findElement(By.xpath("//*[contains(.,'Find your car now!')]"));
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
