package com.phonebook.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector("div:nth-child(2)>div>div"));
    }

    public boolean isHomeComponentPresent1() {
        return isElementPresent1(By.xpath("//h1[.='Home Component']"));
    }
}
