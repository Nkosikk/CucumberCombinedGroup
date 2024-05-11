package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class StepDefinitionAddItemToCartSteps {
    WebDriver driver;

    @Given("I am on the desired webpage")
    public void i_am_on_the_desired_webpage() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @And("I enter the correct username {}")
    public void i_enter_the_correct_username(String Username) {
        driver.findElement(By.id("user-name")).sendKeys(Username);
    }

    @And("I enter the correct password {}")
    public void i_enter_the_correct_password(String Password) {
        driver.findElement(By.id("password")).sendKeys(Password);
    }

    @When("I click the Login Button")
    public void i_click_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @And("Products page is Displayed")
    public void products_page_is_displayed() {
        driver.findElement(By.xpath("//span[contains(.,'Products')]")).isDisplayed();
    }

    @When("I click the Add To Cart Button")
    public void i_click_the_add_to_cart_button() {
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }

    @Then("The selected item is added to cart")
    public void the_selected_item_is_added_to_cart() {
        driver.findElement(By.xpath("//a[@class='shopping_cart_link'][contains(.,'1')]")).isDisplayed();
    }


}