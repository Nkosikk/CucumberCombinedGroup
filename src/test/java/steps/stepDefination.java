package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefination {

    @Given("I am on Login page")
    public void i_am_on_login_page() {
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @And("^I enter the username (.*)$")
    public void i_enter_the_username_user_name(String username) {

    }
    @And("^I enter password (.*)$")
    public void i_enter_password_pass(String password) {

    }
    @When("I click login button")
    public void i_click_login_button() {

    }
    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {

    }


}
