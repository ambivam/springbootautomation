package com.mouritech.springbootautomation.pages;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage{

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;


    public void PerformLogin() {
        homePage.ClickLogin();
        loginPage.Login("admin", "password");
        loginPage.ClickLogin();
    }
}
