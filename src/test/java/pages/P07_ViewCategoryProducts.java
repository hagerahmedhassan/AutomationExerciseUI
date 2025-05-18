package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P07_ViewCategoryProducts extends BaseClass
{

    WebDriverWait wait;
    private static final Logger log= LogManager.getLogger();
    //locators
    @FindBy (className = "left-sidebar")
    WebElement category;

    @FindBy (xpath = "(//a[@data-toggle='collapse']//span[@class='badge pull-right'])[1]")
    WebElement plusBtn;
    @FindBy (xpath = "//*[@href='/category_products/1']")
    WebElement dress;


    //Constractor
    public P07_ViewCategoryProducts(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
     //Methods
    public void viewCategoryProducts()
    {
        WebElement categoryWait=wait.until(ExpectedConditions.visibilityOf(category));
        WebElement women=categoryWait.findElement(By.cssSelector("[href='#Women']"));
        women.click();
        log.error("problem in select women ");
        //plusBtn.click();
        WebElement dress1=wait.until(ExpectedConditions.visibilityOf(dress));
        dress1.click();
       // return driver.getCurrentUrl();

    }



}
