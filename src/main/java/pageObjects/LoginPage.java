package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    @FindBy(id="Email")
    public WebElement emailTextBox;


    @FindBy(id="Password")
    public WebElement passwordTextBox;


    @FindBy(className = "login-button")
    public WebElement loginButton;


    @FindBy(linkText="Log out")
    public static WebElement logoutLink;


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void enterEmail(String email)
    {
        emailTextBox.sendKeys(email);
    }

    public void enterPassword(String pw)
    {
        passwordTextBox.sendKeys(pw);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    //application specific utility - nop commerce
    public void loginToApp(String em,String pw)
    {
        emailTextBox.sendKeys(em);
        passwordTextBox.sendKeys(pw);
        loginButton.click();
    }


    public boolean verifyLogout()
    {
        return logoutLink.isDisplayed();
    }
}
