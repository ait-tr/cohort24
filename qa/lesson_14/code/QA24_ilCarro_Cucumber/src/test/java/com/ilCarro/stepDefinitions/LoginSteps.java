package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Log in link")
    public void click_on_Login_link () {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("neuer@gmail.com","Neuer12345$");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies log in message")
    public void verify_login_message() {
        new LoginPage(driver).isLoginMessageDisplayed();
    }

    @And("User enters valid email and wrong password")
    public void enter_valid_email_and_wrong_password(DataTable dataTable) {
        new LoginPage(driver).enterWrongPassword(dataTable);
    }

    @Then("User verifies error message")
    public void verify_error_message() {
        new LoginPage(driver).getError();
    }
}
