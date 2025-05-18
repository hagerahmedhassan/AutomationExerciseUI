package Tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P01_RegisterUser;

public class RegisterTest extends BaseTest
{
    Faker faker=new Faker();
    String name=faker.name().fullName();
    String email=faker.internet().emailAddress();
    String password=faker.internet().password();
    P01_RegisterUser registerUser=new P01_RegisterUser(driver);

    @Test
    public void validLogin()
    {

        registerUser.setRegister();
    }
}
