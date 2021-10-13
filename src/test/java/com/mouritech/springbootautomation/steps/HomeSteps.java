package com.mouritech.springbootautomation.steps;


import com.mouritech.springbootautomation.models.TestUserDetails;
import com.mouritech.springbootautomation.models.UserDetails;
import com.mouritech.springbootautomation.pages.HomePage;
import com.mouritech.springbootautomation.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private HomePage homePage;

    @Autowired
    private TestUserDetails testUserDetails;

    /*@And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        //var data = table.asList();
        loginPage.Login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }*/

    @Given("I click login in Home Page")
    public void iClickLoginInHomePage() {

        homePage.ClickLogin();
        //Scenario scope
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }
}
