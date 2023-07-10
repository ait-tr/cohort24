package com.ilCarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilCarro.pages.BasePage.driver;

public class HomePageSteps {

    @Given("User launches Chrome Browser")
    public void launch_Chrome_Browser() {

        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilCarro HomePage")
    public void open_ilCarro_HomePage() {

        new HomePage(driver).openURL();
    }

    @Then("User verifies HomePage title")
    public void verify_HomePage_title() {
        new HomePage(driver).isHomePageTitlePresent();
    }

    @And("User quites browser")
    public void quit_browser() {
        new HomePage(driver).quit();
    }
}
