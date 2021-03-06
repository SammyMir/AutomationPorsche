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
}
