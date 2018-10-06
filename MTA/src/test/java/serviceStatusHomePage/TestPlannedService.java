package serviceStatusHomePage;

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
    }
    @Test
    public void textPlanTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        textPlan();
    }
}
