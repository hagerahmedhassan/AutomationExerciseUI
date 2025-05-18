package Tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P02_LoginPage;

public class LoginTests extends BaseTest {

    P02_LoginPage loginPage =new P02_LoginPage(driver);
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();
    String password=faker.internet().password();

    @Test
    public void validLogin(){
        loginPage.validLogin(email,password);
    }
    @Test
    public void invalidTest()
    {
        loginPage.inValidLogin(email,password);

    }


}
