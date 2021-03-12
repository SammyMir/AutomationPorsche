package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AccountPage {
    public AccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
       @FindBy(xpath = "//div[@class='header_user_info']//span")
       public WebElement userInfo;
//
//
//    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
//    public WebElement dresses;
//
//    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
//    public WebElement summerDress;
//
//    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]")
//    public WebElement summerDress;
//
//    @FindBy(id="quantity_wanted")
//    public WebElement quantity; //*[@id="quantity_wanted_p"]/a[2]/span/i
//
//    @FindBy(id="group_1")
//    public WebElement size;
//
//    @FindBy(id="color_15")
//    public WebElement color;
//
//    @FindBy(id="add_to_cart")
//    public WebElement addCard;
//
//    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
//    public WebElement successMessage;

    @FindBy(xpath="(//a[@title='Dresses'])[2]")
    public WebElement dressesMenuBar;
    @FindBy(xpath="(//a[@title='Summer Dresses'])[2]")
    public WebElement summerDresses;
    @FindBy(xpath = "(//div[@class=\"product-image-container\"]//a[@title=\"Printed Summer Dress\"]//img)[1]")
    public WebElement printedSummerImg;
    @FindBy(xpath="//input[@id='quantity_wanted']")
    public WebElement quantity;
    @FindBy(id="group_1")
    public WebElement dressSize;
    @FindBy(id="color_14")
    public WebElement colorBlue;
    @FindBy(id="color_16")
    public WebElement colorYellow;
    @FindBy(id="color_13")
    public WebElement colorOrange;
    @FindBy(id="color_11")
    public WebElement colorBlack;
    @FindBy(xpath = "//button[@name='Submit']")
    public WebElement addToCartButton;
    @FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
    public WebElement acProceedCheckout;





    }
