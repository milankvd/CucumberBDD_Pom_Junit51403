package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import utils.DriverFactory;

public class StepDefinitions
{

    @Given("i am on the nop commerce home page")
    public void i_am_on_the_nop_commerce_home_page()
    {
        BasePage.driverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));
    }

    @When("i click on login link on the nav bar")
    public void i_click_on_login_link_on_the_nav_bar()
    {
          BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        String actualLoginPageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedLoginPageTitle"),actualLoginPageTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw)
    {
        BasePage.loginPage.enterPassword(pw);
    }

    @When("i click on login button")
    public void i_click_on_login_button()
    {
        BasePage.loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        Assertions.assertTrue(BasePage.loginPage.verifyLogout(),"Verify Logout id displayed");
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        String actualHomePageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedHomePageTitle"),actualHomePageTitle);
    }

    @When("i click on register link on the navbar")
    public void i_click_on_register_link_on_the_navbar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page")
    public void i_should_be_navigated_to_register_page()
    {
        String actualRegisterPageTitle = BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedRegisterPageTitle"),actualRegisterPageTitle);
    }

    @When("i select gender as female")
    public void i_select_gender_as_female()
    {
       BasePage.registerPage.clickFemaleRadioButton();
    }

    @When("i select day month year from date of birth dropdown")
    public void i_select_day_month_year_from_date_of_birth_dropdown()
    {
        BasePage.registerPage.selectDay();
    }

    @When("i enter firstName lastName email password confPassword")
    public void i_enter_first_name_last_name_email_password_conf_password(io.cucumber.datatable.DataTable dataTable)
    {
       BasePage.registerPage.enterfirstName(dataTable.cell(1,0));
       BasePage.registerPage.enterlastName(dataTable.cell(1,1));
       BasePage.registerPage.enterEmail(dataTable.cell(1,2));
       BasePage.registerPage.enterPassword(dataTable.cell(1,3));
       BasePage.registerPage.enterConfPassword(dataTable.cell(1,4));
    }




    @And("i click on register button")
    public void iClickOnRegisterButton()
    {
        BasePage.registerPage.clickRegisterButton();
    }

    @Then("registration is successful")
    public void registration_is_successful()
    {
     String actualRegConfMsg = BasePage.registerPage.getRegisterCnfText();
     Assertions.assertEquals(DriverFactory.prop.getProperty("expectedRegisterConfMsg"),actualRegConfMsg);
    }

    @Then("i should see error messages on all mandatory fields")
    public void iShouldSeeErrorMessagesOnAllMandatoryFields()
    {
        System.out.println("Validating error messages");
    }



    @Given("User should be on HomePage")
    public void user_should_be_on_home_page() {
        BasePage.driverUtils.navigateToUrl(DriverFactory.prop.getProperty("url"));
    }
    @When("user click on AddToWishlist for any product")
    public void user_click_on_add_to_wishlist_for_any_product() {
        BasePage.homePage.clickOnAddtoWishlist();
    }
    @Then("user should get confirmation msg as product The product has been added to your wishlist")
    public void user_should_get_confirmation_msg_as_product_the_product_has_been_added_to_your_wishlist() {
        BasePage.driverUtils.waitForElementVisible(By.className("content"),20);
        String ActualconfirmationMsg= BasePage.homePage.getConfirmationMSG();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedAddToWishlistConfirmationMsg"),ActualconfirmationMsg);
    }
    @When("user click on wishlist link")
    public void user_click_on_wishlist_link() {
        BasePage.homePage.clickOnWishListLink();
    }
    @Then("user should be redirect on wishlist page")
    public void user_should_be_redirect_on_wishlist_page() {
        String ActualAddToWishlistPageTitle= BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedAddToWishlistPageTitle"),ActualAddToWishlistPageTitle);
    }
    @Then("product should be shown there")
    public void product_should_be_shown_there() {
        String ActualProductofWishlist = BasePage.wishListPage.getProductTitle();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedWishlistProductTitle"),ActualProductofWishlist);
    }
}
