package step_def;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import pages.ShoppingCardPAge;
import utilities.Driver;

public class ShoppingPageTest {

    WebDriver driver = Driver.getDriver();
    ShoppingCardPAge sp=new ShoppingCardPAge();
    AccountPage aa=new AccountPage();

    @When("user clicks proceed to checkout")
    public void user_clicks_proceed_to_checkout() throws InterruptedException {
        Thread.sleep(6000);
        aa.acProceedCheckout.click();


    }
    @When("user validates shopping cart page  {string}")
    public void user_validates_shopping_cart_page(String pageTitle) {
        String actualPageTitle=sp.cartTitle.getText();
        Assert.assertEquals(pageTitle, actualPageTitle);

    }
    @When("user validate dress name {string}")
    public void user_validate_dress_name(String dressName) {
        String actualDressName=sp.dressName.getText();
        Assert.assertEquals(dressName, actualDressName);
    }
    @Then("user validates products price {string} and shipping cost {string} and total cost {string}")
    public void user_validates_products_price_and_shipping_cost_and_total_cost(String totalProductPrices, String shippingCost, String totalProductCost) {
        String actualProductPrice=sp.totalProductPrices.getText();
        String actualShippingCost=sp.shippingCost.getText();
        String actualTotalCost=sp.totalProductCost.getText();
        Assert.assertEquals(totalProductPrices, actualProductPrice);
        Assert.assertEquals(shippingCost, actualShippingCost);
        Assert.assertEquals(totalProductCost, actualTotalCost);

    }
    @Then("user scrolls down to the bottom")
    public void user_scrolls_down_to_the_bottom() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,2000)");

    }
    @Then("user clicks final checkout")
    public void user_clicks_final_checkout() {
        sp.proceedToCheckout.click();

    }

    @Then("user is in Address section")
    public void user_is_in_address_section() {
        Assert.assertTrue(sp.checkboxChecked.isDisplayed());

    }

    @Then("user validates that delivery and billing address are the same")
    public void user_validates_that_delivery_and_billing_address_are_the_same() {
        Assert.assertEquals(sp.deliveryAddressText.getText(),"YOUR DELIVERY ADDRESS");
        Assert.assertEquals(sp.billingAddressText.getText(),"YOUR BILLING ADDRESS");
        Assert.assertEquals(sp.billingclinetName.getText(),sp.deliveryclinetFullName.getText());
        Assert.assertEquals(sp.billingAddress1.getText(),sp.deliveryaddress1.getText());
        Assert.assertEquals(sp.billingcompanyName.getText(),sp.deliverycompanyName.getText());
        Assert.assertEquals(sp.billingCityStatePostcode.getText(),sp.deliverycityStatePostcode.getText());
        Assert.assertEquals(sp.billingCountry.getText(),sp.deliverycountry.getText());
        Assert.assertEquals(sp.billingPhone.getText(),sp.deliveryphone.getText());

    }
    @Then("user clicks to go next section")
    public void user_clicks_to_go_next_section() {
        sp.addressProceedCheckout.click();

    }
    @Then("user valiate shipping fee {string}")
    public void user_valiate_shipping_fee(String shoppingFee) {
        String shippingSectionTitle="SHIPPING";
        String actualShippingTitle=sp.ShippingSectionTitle.getText();
        Assert.assertEquals(shippingSectionTitle, actualShippingTitle);


    }
    @Then("user check terms and condito checkox")
    public void user_check_terms_and_condito_checkox() {
        sp.checkboxTerm.click();

    }
    @Then("user clicks proceed to checkbox for payment")
    public void user_clicks_proceed_to_checkbox_for_payment() {
        sp.proceedCheckoutShippingPrice.click();

    }
    @Then("user should in payment method section")
    public void user_should_in_payment_method_section() {
        String expectedPaymentSection="PLEASE CHOOSE YOUR PAYMENT METHOD";
        String actualPaymentSectionTitle=sp.paymentSectionTitle.getText();
        Assert.assertEquals(expectedPaymentSection, actualPaymentSectionTitle);

    }
    @Then("user validated payment infomartion")
    public void user_validated_payment_infomartion() {
        String expectedProductPrice="$57.96";
        String expectedShippingFee="$2.00";
        String expectedTotalCost="$59.96";

        Assert.assertEquals(expectedProductPrice, sp.totalProductPrices.getText());
        Assert.assertEquals(expectedShippingFee, sp.shippingCost.getText());
        Assert.assertEquals(expectedTotalCost, sp.totalProductCost.getText());


    }
    @Then("user click bank wire payment")
    public void user_click_bank_wire_payment() {
        sp.bankwire.click();

    }
    @Then("user is on bank wire payment section")
    public void user_is_on_bank_wire_payment_section() {
        String expectedOrderSummaryPage="ORDER SUMMARY";
        String expectedPaymentTypeBankWire="BANK-WIRE PAYMENT.";
        Assert.assertEquals(expectedOrderSummaryPage, sp.orderSummarySectionTitle.getText());
        Assert.assertEquals(expectedPaymentTypeBankWire, sp.paymentTypeBankWire.getText());
    }
    @Then("user click confirm button")
    public void user_click_confirm_button() {
        sp.confirmButton.click();

    }
    @Then("user should see order confirmation {string}")
    public void user_should_see_order_confirmation(String orderCompleteText) {
        String orderCompleteSectionTitle="ORDER CONFIRMATION";
        String actualFinalPrice="$59.96";

        Assert.assertEquals(actualFinalPrice, sp.finalPrice.getText());
        Assert.assertEquals(orderCompleteSectionTitle, sp.orderSummarySectionTitle.getText());
        Assert.assertEquals(orderCompleteText, sp.myStoreOrderCompleteText.getText());

    }


}
