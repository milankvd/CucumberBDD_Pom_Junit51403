package base;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import pageObjects.WishListPage;
import utils.DriverFactory;
import utils.DriverUtils;

public class BasePage
{
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static DriverUtils driverUtils;
    public static WishListPage wishListPage;

    public static void initPages()
    {
        homePage = new HomePage(DriverFactory.driver);
        registerPage = new RegisterPage(DriverFactory.driver);
        loginPage = new LoginPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
        wishListPage=new WishListPage(DriverFactory.driver);
    }
}
