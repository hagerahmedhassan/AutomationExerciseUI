package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class P08_HomePage extends BaseClass
{
    WebDriver driver;
    SoftAssert softAssert;
    private static final Logger logger= LogManager.getLogger(P08_HomePage.class);


    @FindBy (xpath = "//div[@class='single-widget']//h2[contains(.,'Subscription')]")
    WebElement subscription;
    @FindBy (id="susbscribe_email")
    WebElement email;
    //id="subscribe"
    @FindBy (id="subscribe")
    WebElement clickBtn;


  public P08_HomePage(WebDriver driver)
  {
     super(driver);
     softAssert=new SoftAssert();
 }
  public void scrollAction()
  {

           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("window.scrollBy(0,1000), ");
           logger.error("error in scroll By ");

           Assert.assertTrue(subscription.isDisplayed(), "Subscription");
           email.sendKeys("hager.wahp@gmail.com");
           clickBtn.click();
           logger.debug("Email added Successfully");

           softAssert.assertEquals(clickBtn.getText(),"You have been successfully subscribed!' is visible");
           softAssert.assertAll();


  }
  public void scrollBottomUp() throws InterruptedException
  {
      JavascriptExecutor js =(JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

      for (int i=0;i<10;i++)
      {
          js.executeScript("window.scrollBy(0, -100);");
          Thread.sleep(200);
      }
  }

}
