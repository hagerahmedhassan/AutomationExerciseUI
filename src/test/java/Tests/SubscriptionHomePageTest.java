package Tests;

import org.testng.annotations.Test;
import pages.P08_HomePage;

public class SubscriptionHomePageTest extends BaseTest
{
    P08_HomePage subscriptionHomePage;

    @Test
    public void actions()
    {
        subscriptionHomePage.scrollAction();
    }
}
