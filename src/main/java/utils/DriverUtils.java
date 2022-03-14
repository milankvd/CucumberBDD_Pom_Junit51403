package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils
{
    public static void navigateToUrl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }


    public static void pageRefresh()
    {
        DriverFactory.driver.navigate().refresh();
    }


    public String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }


    public  void selectUsingVisibility(WebElement element, String text)
    {
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }

    public  void selectUsingValue(WebElement element, String text)
    {
        Select select = new Select(element);
        select.selectByValue(text);

    }

    public  void selectUsingIndex(WebElement element, int index)
    {
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public  String getEleText(WebElement element)
    {
        return element.getText();
    }

    public void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
