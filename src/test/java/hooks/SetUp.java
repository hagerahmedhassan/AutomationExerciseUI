package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SetUp
{
   public static WebDriver driver;
    @BeforeClass
    public void setUp()
    {
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
        PageFactory.initElements(driver,this);
    }

    @AfterTest
    public void cleanUp()
    {
        driver.quit();
    }
}
