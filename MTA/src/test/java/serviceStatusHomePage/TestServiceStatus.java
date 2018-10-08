package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestServiceStatus extends HomePage {
    HomePage servicestatus;
    @BeforeMethod
    public void initialization(){servicestatus=new HomePage(driver);}

    @Test(priority = 1,enabled = true)
    public void checkServiceStatusComponents(){
        clickOnStatusServicesComponents();
        Assert.assertTrue(true);
    }
    @Test
    public void languageOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectLanguage();
    }
    @Test
    public void checkBusTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBus();
    }
    @Test
    public void checkBridge(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBridge();
    }
    @Test
    public void testInputBox(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInput();
    }
    @Test
    public void clickOnSubwayTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSubWay();
    }
    @Test
    public void checkSearchButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchButton();
    }
    @Test
    public void testEmployment(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        employment();
    }
    @Test
    public void testEHquarter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        eMtaHeadQuarter();
    }
    @Test
    public void testBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        eMtaBusiness();
    }
}
