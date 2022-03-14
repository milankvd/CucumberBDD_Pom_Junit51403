package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
    WebDriver driver;

@FindBy (css = "a.product-name")
    public WebElement ProductTitle;

public WishListPage(WebDriver driver){
        this.driver=driver;
    PageFactory.initElements(driver,this);
}

public String getProductTitle(){
    return ProductTitle.getText();
}
}
