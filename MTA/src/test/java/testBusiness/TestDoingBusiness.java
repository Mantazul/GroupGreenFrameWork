package testBusiness;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DoingBusiness;
import reporting.TestLogger;

public class TestDoingBusiness extends DoingBusiness {
    DoingBusiness doingBusiness;
    @BeforeMethod
    public void init(){
        doingBusiness=new DoingBusiness(driver);
    }
    @Test
    public void testDoingBusiness(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDoingBusiness();
        Assert.assertTrue(true);
    }
    @Test
    public void testAdOnMtaCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAdOnMtaCard();
    }
    @Test
    public void testBusinessItem(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDoingBusinessItems(reatState);
    }
    @Test
    public void testBusinessTite(){
        String actual=getDoingBusinessTitle();
        Assert.assertEquals(actual,"Doing Business With Us");
    }



}
