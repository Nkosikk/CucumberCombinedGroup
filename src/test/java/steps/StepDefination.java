package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class StepDefination extends Base {
    @Given("I am on Login page")
    public void i_am_on_login_page() {

    }

    @And("^I enter the username (.*)$")
    public void i_enter_the_username_user_name(String username) {
        loginPage.enterUsername(username);
    }

    @And("^I enter password (.*)$")
    public void i_enter_password_pass(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {
        homePage.verifyUserIsLoggedIn();
    }

    @After
    public void closeBrowser(){
        driver.quit();

    }
}
