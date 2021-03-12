package step_def;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AccountPage;
import utilities.Driver;

import javax.swing.*;

public class PurchasePageSteps {


//    WebDriver driver = Driver.getDriver();
//    AccountPage ac=new AccountPage();
//    Actions at=new Actions(driver);
//
//
//    @When("user moves cursor to DRESSES bar")
//    public void user_moves_cursor_to_dresses_bar() {
//    at.moveToElement(ac.dresses).build().perform();
//
// }
// @When("user clicks SUMMER DRESSES")
// public void user_clicks_summer_dresses() {
//
// }
//
// @Given("user selects {string}")
//    public void user_selects(String string) {
//    ac.summerDress.click();
//
//
//    }
//    @Given("user selects {int} dresses and {string} size and {string}")
//    public void user_selects_dresses_and_size_and(Integer int1, String string, String string2) {
//     ac.quantity.click();
//     ac.size.click();
//     ac.color.click();
//
//    }
//    @Given("user adds into card")
//    public void user_adds_into_card() {
//     ac.addCard.click();
//
//    }
//    @Then("user validates sucess message {string}")
//    public void user_validates_sucess_message(String string) {
//
//    }

    WebDriver driver = Driver.getDriver();
    AccountPage ap= new AccountPage();
    Actions act =new Actions(driver);

    @When("user moves cursor to DRESSES bar")
    public void user_moves_cursor_to_dresses_bar() {
        act.moveToElement(ap.dressesMenuBar).build().perform();
    }
    @When("user clicks SUMMER DRESSES")
    public void user_clicks_summer_dresses() {
        ap.summerDresses.click();
    }
    @When("user selects {string}")
    public void user_selects(String item) {
        ap.printedSummerImg.click();
    }
    @When("user selects {int} dresses and {string} size and {string}")
    public void user_selects_dresses_and_size_and(Integer count, String size, String color) {
        ap.quantity.clear();
        //selecting quantity
        ap.quantity.sendKeys(String.valueOf(count));
        //selecting the size
        Select razmer= new Select(ap.dressSize);
        razmer.selectByVisibleText(size);
        //selecting color
        ap.colorBlue.click();

    }
    @When("user adds into card")
    public void user_adds_into_card() {
        ap.addToCartButton.click();
    }
    @Then("user validates sucess message {string}")
    public void user_validates_sucess_message(String message) {
        String actualMessage=ap.successMessage.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(message,actualMessage);
    }

}
