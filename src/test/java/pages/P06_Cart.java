package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class P06_Cart extends BaseClass
{
    private static final Logger log = LoggerFactory.getLogger(P06_Cart.class);
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    SoftAssert softAssert;


    @FindBy(css = "[href='/products']")
    WebElement product;
    @FindBy(xpath = "(//div[@class='productinfo text-center']//a[@data-product-id='1'])[1]")
    WebElement product1;
    @FindBy(xpath = "(//div[@class='productinfo text-center']//a[@data-product-id='2'])[1]")
    WebElement product2;
    @FindBy(xpath= "//*[text()='Continue Shopping']")
    WebElement continueBtn;

    @FindBy(xpath= "(//a[@href='/view_cart'])[2]")
    WebElement viewBtn;
    @FindBy(css="[href='/product_details/16']")
    WebElement product14;
    @FindBy(css="[id='quantity']")
    WebElement quantityBtn;
    @FindBy(xpath="//*[text()='Continue Shopping']")
    WebElement continueShopping;
    @FindBy(css="[href='/view_cart']")
    WebElement viewCartBtn;
    @FindBy(xpath="//*[text()='Proceed To Checkout']")
    WebElement checkOutBtn;
    @FindBy(xpath="//*[text()='Place Order']")
    WebElement placeOrder;

    @FindBy(name = "name_on_card")
    WebElement nameCardField;
    @FindBy(name="card_number")
    WebElement numberCardField;
    @FindBy(name = "cvc")
    WebElement cvcField;
    @FindBy(name = "expiry_month")
    WebElement expireMonth;
    @FindBy(name = "expiry_year")
    WebElement expireYear;
    @FindBy(id="submit")
    WebElement payAndConfirm;



    public P06_Cart(WebDriver driver)
    {
        super(driver);
        actions=new Actions(driver);
    }
    public P06_Cart setProduct1()
    {
        actions.moveToElement(product1).perform();
        continueBtn.click();
        log.debug("product 1 added correctly");

        return this;
    }
    public P06_Cart setProduct2()
    {
        actions.moveToElement(product2).perform();
        viewBtn.click();
        log.debug("Verify both products are added to Cart");

        return this;
    }
    public P06_Cart setProductPage()
    {
        waitElementVisible(product);
        product.click();
        log.debug("check if the product is viable");
        return this;
    }
    public P06_Cart setContinueShopping()
    {
        waitElementVisible(continueShopping);
        continueShopping.click();
        log.debug("Verify continue Shopping visible");
        return this;
    }

    //Add products to cart
    public P06_Cart addProductsToCart()
    {
              setProductPage()
             .setProduct1()
             .setContinueShopping()
             .setProduct2();

        return this;
    }

    public P06_Cart checkProductAdded()
    {
        try
        {
            softAssert.assertEquals(product1.getText().contains("Blue Top"), "Blue Top");
            softAssert.assertEquals(product2.getText().contains("Men Tshirt"), "Men Tshirt");
            softAssert.assertAll();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
          return this;
    }
    public P06_Cart checkQuantity()
    {
        try
        {
            product14.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("argument[0].value='4';", quantityBtn);
            softAssert.assertEquals(quantityBtn, '4');
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
       return this;
    }

    public P06_Cart setViewCart()
    {
        waitElementVisible(viewCartBtn);
        viewCartBtn.click();
        log.debug("view cart is visible");
        return this;
    }
    public P06_Cart setCheckOutProcess()
    {
        waitElementClickable(checkOutBtn);
        checkOutBtn.click();
        log.debug("Verify Check out button is clickable ");
        return this;
    }
    public P06_Cart setScrollDown()
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }

    public P06_Cart setPlaceOrder()
    {
        waitElementClickable(placeOrder);
        placeOrder.click();
        log.debug("Verify place order button is clickable ");
        return this;
    }
    public P06_Cart setNameCard(String nameCard)
    {
        waitElementClickable(nameCardField);
        nameCardField.clear();
        nameCardField.sendKeys(nameCard);
        log.debug("Verify name card text is clickable ");
        return this;
    }
    public P06_Cart setNumCard(String numCard)
    {
        waitElementClickable(numberCardField);
        numberCardField.clear();
        numberCardField.sendKeys(numCard);
        log.debug("Verify number card text is clickable ");
        return this;
    }

    public P06_Cart setCvcCard(int cvc)
    {
        waitElementClickable(cvcField);
        cvcField.clear();
        cvcField.sendKeys(String.valueOf(cvc));
        log.debug("Verify cvc has a correctly length with 3 digits  ");
        return this;
    }
    public P06_Cart setExpireMonth(int month)
    {
        waitElementClickable(expireMonth);
        expireMonth.clear();
        expireMonth.sendKeys(String.valueOf(month));
        log.debug("Verify month is less than or equal 12 ");
        return this;
    }
    public P06_Cart setExpireYear(int year)
    {
        waitElementClickable(numberCardField);
        numberCardField.clear();
        numberCardField.sendKeys(String.valueOf(year));
        log.debug("Verify year don't less than 4 digits ");
        return this;
    }
    public P06_Cart setPayAndConfirm()
    {
        waitElementClickable(payAndConfirm);
        payAndConfirm.click();
        log.debug("Verify pay an confirm button is clickable ");
        return this;
    }


    public P06_Cart setCheckOut()
    {
         setViewCart()
        .setCheckOutProcess()
        .setScrollDown()
        .setPlaceOrder()
        .setNameCard("Hager Ahmed Hassan")
        .setNumCard("12341352453254364")
        .setCvcCard(123)
        .setExpireMonth(12)
        .setExpireYear(2026);

        return this;
    }



}
