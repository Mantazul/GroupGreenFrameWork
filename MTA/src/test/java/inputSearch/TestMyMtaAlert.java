package inputSearch;

import ObjectPages.homePageMyMtaAlert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMyMtaAlert extends homePageMyMtaAlert {

    homePageMyMtaAlert alert;
    @BeforeMethod
    public void initialize(){
        alert=new homePageMyMtaAlert(driver);
    }
    @Test
    public void TestMyMtaAlert(){
        clickOnMyMtaAlerts();
    }


}
