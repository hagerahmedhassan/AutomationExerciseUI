package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P04_TestCases extends BaseClass
{

    @FindBy(xpath = "//*[@href='test_cases']")
    WebElement testCaseBtn;

    public P04_TestCases(WebDriver driver)
    {
        super(driver);
    }
    public void setTestCaseBtn()
    {
        WebElement testCaseWait=wait.until(ExpectedConditions.visibilityOf(testCaseBtn));
        testCaseWait.click();
    }


}
