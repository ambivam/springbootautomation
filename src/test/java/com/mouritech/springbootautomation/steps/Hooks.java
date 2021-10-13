package com.mouritech.springbootautomation.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {

    @Autowired
    private WebDriver webDriver;

    @Value("${app.url}")
    private String appUrl;

    @Before
    public void InitializeTest(Scenario scenario) {
        System.out.println("In before");
        webDriver.navigate().to(appUrl);
    }

    @After
    public void TearDownTest(Scenario scenario) {

        System.out.println("In after");
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }
}
