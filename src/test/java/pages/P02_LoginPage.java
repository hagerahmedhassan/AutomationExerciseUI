package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class P02_LoginPage extends BaseClass
{
    private static final Logger log = LoggerFactory.getLogger(P02_LoginPage.class);
    WebDriverWait wait;



    @FindBy(css = "[data-qa='login-email']")
    WebElement emailAddress;
    @FindBy (css = "[type='password']")
    WebElement passwordField;
    //[href="/login"]
    @FindBy (css = "//[href='/login']")
    WebElement loginBtn;


    public P02_LoginPage(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //method
    public void validLogin(String email,String password)
    {

            WebElement login_wait=wait.until(ExpectedConditions.visibilityOf(emailAddress));
            login_wait.sendKeys(email);
            log.debug("login wait successfully");
            WebElement password_wait=wait.until(ExpectedConditions.visibilityOf(passwordField));
            password_wait.sendKeys(password + Keys.ENTER);
            log.error("not login successfully");





    }
    public void inValidLogin(String email,String password)
    {

            WebElement login_wait=wait.until(ExpectedConditions.visibilityOf(emailAddress));
            login_wait.sendKeys(email);
            log.debug("login wait successfully");
            WebElement password_wait=wait.until(ExpectedConditions.visibilityOf(passwordField));
            password_wait.sendKeys(password + Keys.ENTER);
            log.error("not login successfully");

    }

}
