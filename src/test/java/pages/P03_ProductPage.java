package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class P03_ProductPage extends BaseClass
{
    WebDriver driver;
    SoftAssert softAssert;

    @FindBy(css = "[href='/products']")
    WebElement product;
    @FindBy(css = "[class='features_items']")
    WebElement allProduct;
    @FindBy(css = "[href='/product_details/14']")
    WebElement top_chery;
    @FindBy(xpath = "//div[@class='product-information']//h2[(contains(.,'ull Sleeves Top Cherry - Pink'))]")
    WebElement productName;
    @FindBy(xpath = "//div[@class='product-information']//p[(contains(.,'Category: Kids > Tops & Shir'))]")
    WebElement categoryName;
    @FindBy(xpath = "//*[text()='Rs. 679']")
    WebElement price;
    @FindBy(xpath = "(//*[text()=contains(.,'Availability:')]//p[text()=contains(.,'In Stock')])[2]")
    WebElement availability;
    @FindBy(xpath = "(//*[text()=contains(.,'Condition:')]//p[text()=contains(.,' New')])[2]")
    WebElement condition;
    @FindBy(xpath = "(//*[text()=contains(.,'Brand:')]//p[text()=contains(.,' Kookie Kids')])[2]")
    WebElement brand;
    @FindBy(css = "//[id='search_product']")
    WebElement searchText;
    @FindBy(css= "([id='submit_search']")
    WebElement searchBtn;
    By featureItems=By.cssSelector("[class='features_items']");




    public P03_ProductPage(WebDriver driver)
    {
        super(driver);
        softAssert=new SoftAssert();
    }
    public void verifyProducts()
    {
        try
        {
            int count = 0;
            waitElementVisible(product);
            product.click();
            List<WebElement> elements = driver.findElements(featureItems);

            for (WebElement element : elements) {
                System.out.println(element.getText());
                count++;
            }
            Assert.assertEquals(34, count, "Equal correctly");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    public void clickOnProductBtn()
    {
        waitElementClickable(product);
        product.click();
    }
    public void clickOnTopChery()
    {
        try
        {
            waitElementClickable(top_chery);
            top_chery.click();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void checkDetailsVisible()
    {
        try
        {
            softAssert.assertEquals(productName.isDisplayed(), "Full Sleeves Top Cherry - Pink");
            softAssert.assertEquals(categoryName.isDisplayed(), "Kids > Tops & Shirts");
            softAssert.assertEquals(price.isDisplayed(), "Rs. 679");
            softAssert.assertEquals(availability.isDisplayed(), "In Stock");
            softAssert.assertEquals(condition.isDisplayed(), " New");
            softAssert.assertEquals(brand.isDisplayed(), " Kookie Kids");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void search(String productName)
    {
        try
        {
            waitElementVisible(searchText);
            searchText.sendKeys(productName);
            searchBtn.click();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }




}
