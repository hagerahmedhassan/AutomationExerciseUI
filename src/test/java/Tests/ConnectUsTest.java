package Tests;

import org.testng.annotations.Test;
import pages.P05_ConnectUs;

public class ConnectUsTest extends BaseTest
{

    P05_ConnectUs connect=new P05_ConnectUs(driver);
    @Test
    public void connectUs()
    {
        connect.connectUs();
    }
    @Test
    public void Fill_Data()
    {
        connect.fillData();
    }
    @Test
    public void Alert_Message()
    {
        connect.Alert();
    }
    @Test
    public void success_Message()
    {
        connect.successMessage();
    }
}
