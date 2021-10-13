package com.mouritech.springbootautomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/mouritech/springbootautomation/features"},
        glue = "com.mouritech.springbootautomation.steps"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
