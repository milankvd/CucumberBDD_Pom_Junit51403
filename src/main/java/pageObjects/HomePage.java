package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{

    WebDriver driver;
    //locators

    @FindBy(linkText = "Register")
    public WebElement registerLink;


    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    @FindBy(id="small-searchterms")
    public WebElement searchTextbox;


    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    @FindBy(xpath = "(//button[text()='Add to wishlist'])[3]")
    public WebElement addToWishlist;


    @FindBy(className = "close")
    public WebElement closeMsg;

    @FindBy(linkText = "Wishlist")
    public WebElement wishlistLink;

    @FindBy(className = "content")
    public WebElement AddToWishListConfirmationMsg;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    //actions



    public void clickRegisterLink()
    {
        registerLink.click();
    }


    public void clickLoginLink()
    {
        loginLink.click();
    }


    public void enterSearchText(String text)
    {
        searchTextbox.sendKeys(text);
    }


    public void clickSearchButton()
    {
        searchButton.click();
    }
    public void clickOnAddtoWishlist(){
        addToWishlist.click();
    }

    public void clickOnCancel() {
        closeMsg.click();
    }

    public void clickOnWishListLink() {
        wishlistLink.click();
    }

    public String getConfirmationMSG(){
        return BasePage.driverUtils.getEleText(AddToWishListConfirmationMsg);
    }
}
