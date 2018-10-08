package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PlannedServiceChange;
import reporting.TestLogger;

public class TestPlannedService extends PlannedServiceChange {
    PlannedServiceChange plannedServiceChange;
    @BeforeMethod
    public void init(){
        plannedServiceChange=new PlannedServiceChange(driver);
    }
    @Test
    public void TestPlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPlan();
        Assert.assertTrue(true);
    }
    @Test
    public void textPlanTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual=textPlan();
        Assert.assertEquals(actual,"TransitTrax");
    }
    @Test
    public void testSubways(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        subwaysChange();
    }
    @Test
    public void testFroute() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fLineRoute();
    }
    @Test
    public void testDescription() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        description();
    }
}
