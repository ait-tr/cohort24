package com.phonebook.fw;

import com.phonebook.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{


    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignOutButton() {
        click(By.xpath("//button[.='Sign Out']"));
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.cssSelector("[href='/login']"));
    }

    public void clickOnRegistrationButton() {
        click(By.name("registration"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public boolean isSignOutButtonPresent() {
        return isElementPresent1(By.xpath("//button[.='Sign Out']"));
    }

    public void clickOnLoginButton() {
        click(By.name("login"));
    }

    public void login() {
        clickOnLoginLink();
        fillLoginRegistrationForm(new User()
                .setEmail("kr@gmail.com")
                .setPassword("Kr1234567$"));
        clickOnLoginButton();
    }
}
