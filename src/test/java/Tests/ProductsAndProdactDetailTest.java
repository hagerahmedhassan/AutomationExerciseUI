package Tests;

import org.testng.annotations.Test;
import pages.P03_ProductPage;

public class ProductsAndProdactDetailTest extends BaseTest
{
    //WebDriver driver;
    P03_ProductPage products=new P03_ProductPage(driver);

    @Test
    public void verifyProductsDetails()
    {
        products.clickOnProductBtn();
        products.clickOnTopChery();
        products.verifyProducts();
        products.checkDetailsVisible();
        products.search("Full Sleeves Top Cherry - Pink");

    }
}
