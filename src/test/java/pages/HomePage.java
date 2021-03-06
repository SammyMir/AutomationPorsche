package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//div[@id='header_logo']//img[@src='http://automationpractice.com/img/logo.jpg']")
    public WebElement logo;

    @FindBy(id="search_query_top")
    public WebElement searchTab;

    @FindBy(xpath="//button[@name=\"submit_search\"]")
    public WebElement searchIcon;

    @FindBy(xpath="//a[@class='product-name' and @title='Blouse']")
    public WebElement itemBlouse;

    @FindBy(id="contact-link")
    public WebElement contact;

    @FindBy(xpath ="//div[@id='center_column']//h1")
    public WebElement textContact;

    @FindBy(id="id_contact")
     public  WebElement selectContactOptions;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="id_order")
    public WebElement order;

    @FindBy(id="fileUpload")
    public WebElement fileUpload;

    @FindBy(id="message")
    public WebElement message;

    @FindBy(id="submitMessage")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id='center_column']//p")
    public WebElement successMessage;

    @FindBy(id="id_gender1")
    public WebElement title;
    @FindBy(id="customer_firstname")
    public WebElement firstname;
    @FindBy(id="customer_lastname")
    public WebElement lastname;
    @FindBy(name="passwd")
    public WebElement password;
    @FindBy(id="days")
    public WebElement daysSelect;
    @FindBy(id="months")
    public WebElement monthSelect;
    @FindBy(id="years")
    public WebElement yearSelect;
    @FindBy(xpath="//input[@id='company']")
    public WebElement company;
    @FindBy(name="address1")
    public WebElement address;

    @FindBy(name="city")
    public WebElement city;
    @FindBy(id="id_state")
    public WebElement state;
    @FindBy(id="postcode")
    public WebElement postcode;
    @FindBy(id="phone_mobile")
    public WebElement mobile;
    @FindBy(xpath="//button[@name='submitAccount']")
    public WebElement registerButton;
    @FindBy(xpath="//a[@class='login']")
    public  WebElement signIn;
    @FindBy(xpath="(//h3[@class='page-subheading'])[1]")
    public WebElement createAccountDisplayed;
    @FindBy (id="email_create")
    public WebElement enterEmail;
    @FindBy(xpath="//button[@id='SubmitCreate']")
    public WebElement enterButton;
}
