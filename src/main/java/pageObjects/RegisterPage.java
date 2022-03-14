package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{

    WebDriver driver;



    @FindBy(id="FirstName")
    public WebElement firstNameTextbox;

    @FindBy(id="LastName")
    public WebElement lastNameTextbox;


    @FindBy(id="Email")
    public WebElement emailTextbox;

    @FindBy(id="Password")
    public WebElement passwordTextbox;

    @FindBy(id="ConfirmPassword")
    public WebElement confPwdTextbox;


    @FindBy(id="register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement registerCnfText;

    @FindBy(name = "DateOfBirthDay")
    public WebElement daydropdown;

    @FindBy(id="gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id="gender-female")
    public WebElement femaleRadioBtn;



    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }




    public void selectDay()
    {
        BasePage.driverUtils.selectUsingVisibility(daydropdown,"19");
    }



    public void enterfirstName(String fn)
    {
        firstNameTextbox.sendKeys(fn);
    }

    public void enterlastName(String ln)
    {
        lastNameTextbox.sendKeys(ln);
    }

    public void enterEmail(String em)
    {
        emailTextbox.sendKeys(em);
    }

    public void enterPassword(String pw)

    {
        passwordTextbox.sendKeys(pw);
    }

    public void enterConfPassword(String cpw)

    {
        confPwdTextbox.sendKeys(cpw);
    }

    public void clickRegisterButton()
    {
        registerButton.click();
    }


    public String getRegisterCnfText()
    {
        return  registerCnfText.getText();
    }

    public void clickMaleRadioButton()
    {
        maleRadioBtn.click();
    }


    public void clickFemaleRadioButton()
    {
        femaleRadioBtn.click();
    }


}
