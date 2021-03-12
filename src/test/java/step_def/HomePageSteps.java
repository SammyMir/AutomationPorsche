package step_def;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AccountPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Locale;
import java.util.Random;

public class HomePageSteps {
    WebDriver driver = Driver.getDriver();
    HomePage hp = new HomePage();
 Faker fk=new Faker();
 Random rd=new Random();
 String email;
 String password;
 AccountPage ac=new AccountPage();

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

        String clothName = hp.itemBlouse.getText();
        Assert.assertEquals(clothName.toLowerCase(), item);
   }
    @Given("user clicks contact us button")
    public void user_clicks_contact_us_button() {
        hp.contact.click();

    }
    @Given("user validates {string} is displayed")
    public void user_validates_is_displayed(String message) {
        String actualText=hp.textContact.getText();
        Assert.assertEquals(message,actualText);

    }
    @Given("user chooses the subject heading {string}")
    public void user_chooses_the_subject_heading(String heading) {
        Select item=new Select(hp.selectContactOptions);
        item.selectByVisibleText(heading);

    }
    @Given("user enters email address")
    public void user_enters_email_address() {
        hp.email.sendKeys(fk.name().firstName().charAt(0)+fk.name().lastName()+"@gmail.com");

    }
    @Given("user enters order reference")
    public void user_enters_order_reference() {
        hp.order.sendKeys(String.valueOf(rd.nextInt(9999)));

    }
    @Given("user attaches file")
    public void user_attaches_file() {
        hp.fileUpload.sendKeys("C:\\Users\\iroda\\Desktop\\data.txt");

    }
    @Given("user inputs message")
    public void user_inputs_message() {
        hp.message.sendKeys(fk.name().nameWithMiddle());

    }
    @Given("user clicks send button")
    public void user_clicks_send_button() {
        hp.sendButton.click();

    }
    @Then("success message {string} should be displayed")
    public void success_message_should_be_displayed(String message) {
        String actualMessage=hp.successMessage.getText();
        Assert.assertEquals(message,actualMessage);

    }

    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
    hp.signIn.click();
}

    @Then("user should see create user section")
    public void user_should_see_create_user_section() {
        String expected="CREATE AN ACCOUNT";
        String actual=hp.createAccountDisplayed.getText();
        Assert.assertEquals(expected,actual);

    }
    @Then("user enters valid email")
    public void user_enters_valid_email() {
        email=fk.name().firstName()+"@gmail.com";
        hp.enterEmail.sendKeys(email);

    }
    @Then("clicks create button")
    public void clicks_create_button() throws InterruptedException {
        hp.enterButton.click();
        Thread.sleep(6000);

    }
    @Then("user clicks title")
    public void user_clicks_title() {
     hp.title.click();

    }
    @Then("user enters  firstname lastname and password")
    public void user_enters_firstname_lastname_and_password() {

        String fname=fk.name().firstName();
        String lname=fk.name().lastName();
        password=fname.toUpperCase()+lname+rd.nextInt(9999)+"@@@";
        hp.firstname.sendKeys(fname);
        hp.lastname.sendKeys(lname);
        hp.password.sendKeys(password);
    }
    @Then("user selects date of birth")
    public void user_selects_date_of_birth() {
        Select day=new Select(hp.daysSelect);
        day.selectByIndex(12);

        Select month=new Select(hp.monthSelect);
        month.selectByIndex(4);

        Select year=new Select(hp.yearSelect);
        year.selectByValue("2000");

    }
    @Then("user enters valid company name")
    public void user_enters_valid_company_name() {
        String comName=fk.company().name();
        hp.company.sendKeys(comName);

    }
    @Then("user enters address city")
    public void user_enters_address_city() {
        String address=fk.address().fullAddress().split(",")[0];
        hp.address.sendKeys(address);
        hp.city.sendKeys(fk.address().cityName());
    }
    @Then("user selects state and enters zipcode")
    public void user_selects_state_and_enters_zipcode() {
        Select state = new Select(hp.state);
        String fState=fk.address().state();
        state.selectByVisibleText(fState);
        hp.postcode.sendKeys((fk.address().zipCode().substring(0,5)));

    }
    @Then("user enters mobile phone")
    public void user_enters_mobile_phone() {
        String  mobilenumber=fk.phoneNumber().cellPhone();
        hp.mobile.sendKeys(mobilenumber);

    }
    @Then("user click register button")
    public void user_click_register_button() {
            hp.registerButton.click();

    }
    @When("user enters valid email and password")
    public void user_enters_valid_email_and_password() {
        hp.emailEntering.sendKeys("Belva@gmail.com");
        hp.passwordEntering.sendKeys("CLIFTONDare5723@@@");
    }

    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        hp.submitButton.click();

    }
    @Then("user is on the AccountPage")
    public void user_is_on_the_account_page() {
        String actualFullName=ac.userInfo.getText();
        String expectedFullName="Clifton Dare";
        Assert.assertEquals(actualFullName, expectedFullName);


    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }


}

