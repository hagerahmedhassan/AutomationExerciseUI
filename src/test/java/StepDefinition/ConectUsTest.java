package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ConnectUsCucumber;

public class ConectUsTest{
WebDriver driver;
ConnectUsCucumber conect;

public ConectUsTest()
{
    conect =new ConnectUsCucumber(driver);

}
    @Given("User is on Home Page page")
    public void homPage1()
    {
        //setup.setUp();
        conect.homPage();
    }

    @When("clicks on the 'Contact Us' button")
    public void conectUs() {

        conect.conectUs();
    }


    @And("Full all data")
    public void fillData()
    {
        conect.fillData();

    }
    @And("accepts the alert")
    public void Alert1() {
       conect.Alert();
    }
    @Then("Verify success message 'Success! Your details have been submitted successfully.' is visible")
    public void successMessage1()
    {
        conect.successMessage();
    }
    @And("Click 'Home' button and verify that landed to home page successfully")
    public void homeBack()
    {
        conect.homeBack();
    }
}
