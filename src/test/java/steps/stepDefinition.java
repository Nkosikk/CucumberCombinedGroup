package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefinition {
    WebDriver driver;

    @Given("I am on Login page")
    public void i_am_on_login_page() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
//        driver.get(url);
//        return driver;
    }

    @And("I enter the username {}")
    public void i_enter_the_username_user_name(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @And("I enter password {}")
    public void i_enter_password_pass(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("I should see the text {string}")
    public void verifyTextOnPage(String productText) {
        Assert.assertTrue
                (driver.findElement
                        (By.xpath("//span[contains(@class,'title')]")).getText().contains(productText));
    }
}