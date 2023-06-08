package com.ait.qa24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        //wait for all elements on the site to load before starting test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTagTest() {
        // find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        WebElement element1 = driver.findElement(By.tagName("a"));
        System.out.println(element1.getText());

        //find list of element by tag
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    //parent
    // //h1/parent::*
    // //h1/parent::div
    // //h1/..

    // ancestor(предки)
    // //h1/ancestor::* (all)
    // //h1/ancestor::div (two options)
    // //h1/ancestor::div[2] (one option)

    // following-sibling
    // //h1/following-sibling::a

    //preceding-sibling
    // //a[@href='/login']/preceding-sibling::h1
    // //a[@href='/login']/preceding-sibling::a

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
