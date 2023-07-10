package com.ilCarro;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com/ilCarro/stepDefinitions",
        tags = "@navigate or @wrongPassword",
        plugin = {"pretty", "json:build/cucumber-report/cucumber.json"})
public class TestRunner {
}
