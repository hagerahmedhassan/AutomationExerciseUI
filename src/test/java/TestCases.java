import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.P08_HomePage;
import pages.P07_ViewCategoryProducts;

public class TestCases
{
    WebDriver driver=new ChromeDriver();

    @BeforeClass
    public void setUp()
    {
        driver.manage().window().fullscreen();
        driver.navigate().to("https://automationexercise.com/");
    }

    @Test(priority = 1)
    public void snbscriptionTest()
    {
      new P08_HomePage(driver).scrollAction();//10 test case
      new P07_ViewCategoryProducts(driver).viewCategoryProducts();//18 test case
        //driver.navigate().back();
        //new RegisterUser(driver).signUp("hager","hager.wahp@gmail.com");
       // new LoginPage(driver).validLogin("hager.wahp@gmail.com","4321TERY");
    }


    @AfterTest
    public void cleanUp()
    {
        driver.quit();
    }
}
