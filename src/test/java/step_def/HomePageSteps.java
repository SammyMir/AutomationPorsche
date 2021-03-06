package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver();
     HomePage hp=new HomePage();

    @Given("user launches application")
    public void user_launches_application() {
        driver.get(ConfigReader.getProperty("baseurl"));
    }


    @When("user lands in home page and validate title {string}")
    public void user_lands_in_home_page_and_validate_title(String title) {
        String accualTitle = driver.getTitle();
        Assert.assertEquals(title, accualTitle);

    }

    @Then("user should see my store logo")
    public void user_should_see_my_store_logo() {
        Assert.assertTrue(hp.logo.isDisplayed());
    }


    @Given("user enters product {string}")
    public void user_enters_product(String item) {
        hp.searchTab.sendKeys(item);
    }
    @When("user clicks search icon")
    public void user_clicks_search_icon() {
        hp.searchIcon.click();

    }

    @Then("item {string} is displayed")
    public void item_is_displayed(String item) {

        String clothName=hp.itemBlouse.getText();
        Assert.assertEquals(clothName.toLowerCase(), item);
    }


}
