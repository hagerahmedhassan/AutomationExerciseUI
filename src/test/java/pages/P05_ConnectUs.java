package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class P05_ConnectUs extends BaseClass {
    WebDriver driver;
    Actions actions=new Actions(driver);
    SoftAssert softAssert=new SoftAssert();

    @FindBy(css = "href='/contact_us'")
    WebElement connectBtn;
    @FindBy(css = "//name='name'")
    WebElement userName;
    @FindBy(css = "[placeholder='Email']")
    WebElement email;
    @FindBy(css = "[placeholder='Subject']")
    WebElement subject;
    @FindBy(css = "[placeholder='Your Message Here']")
    WebElement message;
    @FindBy(css = "[name='upload_file']")
    WebElement uploadFile;
    @FindBy(css = "[value='Submit']")
    WebElement submit;
    @FindBy(css = "[id='subscribe']")
    WebElement emailBtn;
    @FindBy(css = "//div[@class='single-widget']//h2")
    WebElement sucessMessageText;
    @FindBy(css = "[class='btn btn-success']")
    WebElement homeBtn;

    public P05_ConnectUs(WebDriver driver) {
        super(driver);
    }


    public void connectUs() {
        try
        {
            connectBtn.click();
            System.out.println("connect btn successfully");
        }  catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void fillData()
    {
        try
        {
           userName.sendKeys("hager");
           email.sendKeys("hager.ahmed@gmail.com");
           subject.sendKeys("Feedback");
           message.sendKeys("This is a feedback message.");
           uploadFile.sendKeys("D:\\Software Testing\\manual testing\\BDD-with-Cucumber.pdf");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    @And("accepts the alert")
    public void Alert() {
        try
        {
            submit.click();
            actions.moveToElement(submit).perform();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void successMessage()
    {
        email.sendKeys("hager.wahp@gmail.com");
        emailBtn.click();
        softAssert.assertEquals(sucessMessageText.getText().contains("Success! Your details have been submitted successfully."),"Success! Your details have been submitted successfully.");
        softAssert.assertAll();
    }
    @And("Click 'Home' button and verify that landed to home page successfully")
        public void homeBack()
    {
        homeBtn.click();
    }


}
