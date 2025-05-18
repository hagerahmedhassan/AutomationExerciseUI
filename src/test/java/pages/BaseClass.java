package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BaseClass
{
    WebDriver driver;
    WebDriverWait wait;
    SoftAssert softAssert;
    private static final Logger log= LogManager.getLogger(BaseClass.class);

    public BaseClass(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

        log.info("check object created");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        softAssert=new SoftAssert();
    }

    public void waitElementVisible(WebElement element)
    {

        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitElementClickable(WebElement element)
    {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



}
