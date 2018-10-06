package testMtaInfo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MtaInfo;
import reporting.TestLogger;

public class TestMtaInfo extends MtaInfo{
    MtaInfo info;
    @BeforeMethod
    public void init(){
        info=new MtaInfo(driver);
    }
    @Test
    public void testMtaInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMtaInfo();
    }
    @Test
    public void getMtaTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       String actual=MtaTitle();
        Assert.assertEquals(actual,"MTA Info");
    }
    @Test
    public void AboutMtaTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutMta(MtaInfo,AboutMta);
    }
    @Test
    public void testFinance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutMta(MtaInfo,FinancialInfo);
    }
    @Test
    public void testNavigate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        navigateBackMta();
        Assert.assertTrue(true);
    }
    @Test
    public void testMtaPoliceSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mtaPolice();
    }
    @Test
    public void testMtaPoliceSearchBox() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mtaPoliceSearchBox();
        Assert.assertTrue(true);

    }

}
