package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class P01_RegisterUser extends BaseClass
{
    private static final Logger log = LoggerFactory.getLogger(P01_RegisterUser.class);
    Faker faker=new Faker();
    String name=faker.name().fullName();
    String email=faker.internet().emailAddress();
    String password=faker.internet().password();

    @FindBy(css = "[//href='/login']")
    WebElement signUp_LoginBtn;

    @FindBy(xpath = "//*[text()='Signup']")
    WebElement signUpBtn;
    @FindBy (css = "[data-qa='signup-name']")
    WebElement userName;
    @FindBy (css = "[data-qa='signup-email']")
    WebElement singUpEmail;

    @FindBy(id = "id_gender2")
    WebElement femaleRatio;
    @FindBy(id = "name")
    WebElement registerName;
    @FindBy(id="email")
    WebElement registerEmail;
    @FindBy(id = "password")
    WebElement registerPassword;
    @FindBy(id="days")
    WebElement daysField;
    @FindBy(id="months")
    WebElement monthField;
    @FindBy(id="years")
    WebElement yearField;

    @FindBy(id="newsletter")
    WebElement signUpCheckBox;
    @FindBy(id="optin")
    WebElement receiveSpecialOffers;

    //Address information
    @FindBy(id="first_name")
    WebElement firstName;
    @FindBy(id="last_name")
    WebElement lasttName;
    @FindBy(id="company")
    WebElement company;
    @FindBy(id="address1")
    WebElement addressField1;
    @FindBy(id="address1")
    WebElement addressField2;

    @FindBy(id="country")
    WebElement countyList;

    @FindBy(id="state")
    WebElement stateField;
    @FindBy(id="address1")
    WebElement cityField;
    @FindBy(id="address1")
    WebElement zipcode;

    @FindBy(id="mobile_number")
    WebElement mobile_number;
    @FindBy(xpath = "//*[text()='Create Account']")
    WebElement createAccount;



    public P01_RegisterUser(WebDriver driver)
     {
         super(driver);
         wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     }
     //method

    public P01_RegisterUser setSignUp_LoginBtn()
    {
        waitElementClickable(signUp_LoginBtn);
        signUp_LoginBtn.click();
        log.debug("Verify Sign Up / login button Clickable");
        return this;
    }
    public P01_RegisterUser setUserName(String name)
    {
        waitElementClickable(userName);
        userName.sendKeys(name);
        log.debug("Verify name Successfully");

        return this;
    }
    public P01_RegisterUser setEmail(String email)
    {
        waitElementClickable(singUpEmail);
        singUpEmail.sendKeys(email);
        log.debug("Verify Email Successfully");
        return this;
    }
    public P01_RegisterUser setSignUpBtn()
    {
        waitElementClickable(signUpBtn);
        signUpBtn.click();
        log.debug("Verify Sign Up button Clickable");
        return this;
    }


    public P01_RegisterUser setSignUp()
    {
             setSignUp_LoginBtn()
            .setUserName("hager ahmed hassan")
            .setEmail("hager.wahp@gmail.com")
            .setSignUpBtn();
        return this;
    }

    //Register field
    public P01_RegisterUser setRatioBtn()
    {
        waitElementClickable(femaleRatio);
        femaleRatio.click();
        log.debug("Verify choose the female ratio");
        return this;
    }
    public P01_RegisterUser setRegisterUserName(String name)
    {
    waitElementClickable(registerName);
    registerName.clear();
    registerName.sendKeys(name);
    log.debug("Verify user name added correctly");
    return this;
}
    public P01_RegisterUser setRegisterEmail(String email)
    {
        waitElementClickable(registerEmail);
        registerEmail.clear();
        registerEmail.sendKeys(email);
        log.debug("Verify user name added correctly");
        return this;
    }
    public P01_RegisterUser setRegisterPasssword(String passsword)
    {
        waitElementClickable(registerPassword);
        registerPassword.clear();
        registerPassword.sendKeys(passsword);
        log.debug("Verify password added correctly");
        return this;
    }
    public P01_RegisterUser setDay(String day)
    {
        waitElementClickable(daysField);
        daysField.clear();
        daysField.sendKeys(day);
        log.debug("Verify day added correctly");
        return this;
    }
    public P01_RegisterUser setMonth(String month)
    {
        waitElementClickable(monthField);
        monthField.clear();
        monthField.sendKeys(month);
        log.debug("Verify month added correctly");
        return this;
    }
    public P01_RegisterUser setYear(String year)
    {
        waitElementClickable(yearField);
        yearField.clear();
        yearField.sendKeys(year);
        log.debug("Verify day added correctly");
        return this;
    }
    public P01_RegisterUser setSignUpCheckBox()
    {
        waitElementClickable(signUpCheckBox);
        signUpCheckBox.click();
        log.debug("Verify click on signUpCheckBox ");
        return this;
    }
    public P01_RegisterUser setReceiveOffers()
    {
        waitElementClickable(receiveSpecialOffers);
        receiveSpecialOffers.click();
        log.debug("Verify click on receive Special Offers check box");
        return this;
    }

//Address information
     public P01_RegisterUser setFirstName(String name)
     {
    waitElementClickable(firstName);
    firstName.clear();
    firstName.sendKeys(name);
    log.debug("Verify first name correctly");
    return this;
}
     public P01_RegisterUser setLastName(String name)
    {
        waitElementClickable(lasttName);
        lasttName.clear();
        lasttName.sendKeys(name);
        log.debug("Verify last name correctly");
        return this;
    }
    public P01_RegisterUser setCompany(String companyName)
    {
        waitElementClickable(company);
        company.clear();
        company.sendKeys(companyName);
        log.debug("Verify company Name added correctly");
        return this;
    }
    public P01_RegisterUser setAddress1(String address)
    {
        waitElementClickable(addressField1);
        addressField1.clear();
        addressField1.sendKeys(address);
        log.debug("Verify address 1 added correctly");
        return this;
    }
    public P01_RegisterUser setAddress2(String address)
    {
        waitElementClickable(addressField2);
        addressField2.clear();
        addressField2.sendKeys(address);
        log.debug("Verify address 2 added correctly");
        return this;
    }
    public P01_RegisterUser setCountry(String countryName)
    {
        waitElementClickable(countyList);
        Select select=new Select(countyList);
        select.selectByVisibleText(countryName);

        log.debug("Verify the Account created Correctly choice");
        return this;
    }
    public P01_RegisterUser setState(String stateName)
    {
        waitElementClickable(stateField);
        stateField.sendKeys(stateName);
        log.debug("Verify Status added correctly ");
        return this;
    }
    public P01_RegisterUser setCity(String cityName)
    {
        waitElementClickable(cityField);
        cityField.sendKeys(cityName);
        log.debug("Verify  city Name added correctly");
        return this;
    }
    public P01_RegisterUser setZipCode(String code)
    {
        waitElementClickable(zipcode);
        zipcode.sendKeys(code);
        log.debug("Verify  zip code added correctly");
        return this;
    }
    public P01_RegisterUser setMobileNumber(String mobileNum)
    {
        waitElementClickable(mobile_number);
        mobile_number.sendKeys(mobileNum);
        log.debug("Verify mobile number added correctly");
        return this;
    }

    public P01_RegisterUser setCreateAccount()
    {
        waitElementClickable(createAccount);
        createAccount.click();

        log.debug("Verify the Account created Correctly choice");
        return this;
    }

    //final function
    public P01_RegisterUser setRegister()
    {
               setSignUpBtn()
               .setRatioBtn()
               .setRegisterUserName(name)
               .setRegisterEmail(email)
               .setRegisterPasssword(password)
                .setDay("21")
                .setMonth("October")
                 .setYear("2000")
                 .setSignUpCheckBox()
                  .setReceiveOffers()
                  .setFirstName(name)
                  .setLastName(name)
                  .setCompany("Valley Soft")
                  .setAddress1("10 st, New Capital ")
                  .setAddress2("99 st, New Cairo ")
                  .setCompany("Canada")
                  .setState("Canada")
                   .setCountry("Ami")
                  .setCity("canada")
                  .setZipCode("6798")
                  .setMobileNumber("0112356589")
                  .setCreateAccount();

    return this;
    }
}
