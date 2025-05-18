package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;

public class BaseTest {
    WebDriver driver=new ChromeDriver();

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
