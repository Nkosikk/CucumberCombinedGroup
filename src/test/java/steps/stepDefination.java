package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefination {
    WebDriver driver;
    @Given("I am on Login page")
    public void i_am_on_login_page() {
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
    @And("^I enter the username (.*)$")
    public void i_enter_the_username_user_name(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);


    }
    @And("^I enter password (.*)$")
    public void i_enter_password_pass(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }
    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("The home page is displayed")
    public void the_home_page_is_displayed() {

        driver.findElement(By.xpath("//span[contains(.,'Products')]")).isDisplayed();


        String productText=driver.findElement(By.xpath("//span[contains(.,'Products')]")).getText();
        Assert.assertEquals(productText,"Products");

    }

    @After
    public void closeBrowser(){
        driver.quit();

    }





}
