package Tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.P06_Cart;

public class CartTest extends BaseTest
{
    private static final Logger log = LoggerFactory.getLogger(CartTest.class);
    P06_Cart addProduct=new P06_Cart(driver);

    @Test
    public void setAddProduct()
    {
        addProduct.addProductsToCart();
        addProduct.checkQuantity();
        addProduct.setCheckOut();
        addProduct.setPayAndConfirm();

    }
}
