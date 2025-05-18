package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.P07_ViewCategoryProducts;

public class ViewCategoryProductsTest extends BaseTest
{
    WebDriver driver;
    P07_ViewCategoryProducts view=new P07_ViewCategoryProducts(driver);
  @Test
  public void viewCategoryProductsTest()
      {
          view.viewCategoryProducts();
      }

}
