package com.mouritech.springbootautomation.steps;

import com.mouritech.springbootautomation.models.TestUserDetails;
import com.mouritech.springbootautomation.models.UserDetails;
import com.mouritech.springbootautomation.pages.HomePage;
import com.mouritech.springbootautomation.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.util.List;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    /*@Given("I click login in Home Page")
    public void iClickLoginInHomePage() {

        homePage.ClickLogin();
        //Scenario scope
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }*/

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExist() , true);

    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        List<String> data = table.asList();
        /*loginPage.Login(data.get(2),data.get(3));*/
        loginPage.Login(testUserDetails.getUserDetails().getUsername(), testUserDetails.getUserDetails().getPassword());
    }
}
