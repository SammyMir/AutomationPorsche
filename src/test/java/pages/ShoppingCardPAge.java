package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingCardPAge {
    public ShoppingCardPAge() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath="(//h1[@id=\"cart_title\"]//span)[1]")
        public WebElement cartTitle;

        @FindBy(xpath = "(//p[@class=\"product-name\"]//a)[2]")
        public WebElement dressName;

        @FindBy(id="total_product")
        public WebElement totalProductPrices;

        @FindBy(id="total_shipping")
        public WebElement shippingCost;

        @FindBy(id="total_price_container")
        public WebElement totalProductCost;

        @FindBy(xpath="//p[@class='cart_navigation clearfix']//a[@title=\"Proceed to checkout\"]")
        public WebElement proceedToCheckout;


        @FindBy(xpath = "//span[@class='checked']")
        public WebElement checkboxChecked;

        @FindBy(xpath = "//ul[@id=\"address_delivery\"]//li[@class=\"address_title\"]//h3")
        public WebElement deliveryAddressText;

        @FindBy(xpath = "(//ul[@id='address_delivery']//li)[2]")
        public WebElement deliveryclinetFullName;

        @FindBy(xpath = "(//ul[@id='address_delivery']//li)[3]")
        public WebElement deliverycompanyName;

       @FindBy(xpath = "(//ul[@id='address_delivery']//li)[4]")
       public WebElement deliveryaddress1;

       @FindBy(xpath = "(//ul[@id='address_delivery']//li)[5]")
       public WebElement deliverycityStatePostcode;

       @FindBy(xpath = "(//ul[@id='address_delivery']//li)[6]")
       public WebElement deliverycountry;

       @FindBy(xpath = "(//ul[@id='address_delivery']//li)[7]")
       public WebElement deliveryphone;

    @FindBy(xpath="//ul[@id=\"address_invoice\"]//li[@class='address_title']//h3")
    public WebElement billingAddressText;


    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[2]")
    public WebElement billingclinetName;

    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[3]")
    public WebElement billingcompanyName;

    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[4]")
    public WebElement billingAddress1;

    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[5]")
    public WebElement billingCityStatePostcode;

    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[6]")
    public WebElement billingCountry;

    @FindBy(xpath = "(//ul[@id=\"address_invoice\"]//li)[7]")
    public WebElement billingPhone;

    @FindBy(xpath="//button[@name='processAddress']")
    public WebElement addressProceedCheckout;

    @FindBy(xpath = "//div[@id='carrier_area']//h1")
    public WebElement ShippingSectionTitle;

    @FindBy(xpath = "//div[@class='delivery_option_price']")
    public WebElement shippingPrice;

    @FindBy(xpath = "//input[@id='cgv']")
    public WebElement checkboxTerm;

    @FindBy(xpath = "//button[@name='processCarrier']")
    public WebElement proceedCheckoutShippingPrice;

    @FindBy(xpath = "//div[@id='center_column']//h1")
    public WebElement paymentSectionTitle;

    @FindBy(xpath = "//a[@class='bankwire']")
    public WebElement bankwire;

    @FindBy(xpath = "//div[@id='center_column']//h1")
    public WebElement orderSummarySectionTitle;

    @FindBy(xpath="//div[@class='box cheque-box']//h3")
    public WebElement paymentTypeBankWire;

    @FindBy(xpath = "//p[@id='cart_navigation']//button")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@id='center_column']//h1")
    public WebElement orderConfirmationPageTitle;

    @FindBy(xpath = "//div[@class='box']//p//strong")
    public WebElement myStoreOrderCompleteText;

    @FindBy(xpath = "//div[@class='box']//span[@class='price']/strong")
    public WebElement finalPrice;





}




