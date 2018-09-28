package serviceStatusHomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PlannedServiceChange;

 public class TestPlannedService extends PlannedServiceChange {
    PlannedServiceChange plannedServiceChange;
    @BeforeMethod
    public void init(){
        plannedServiceChange=new PlannedServiceChange(driver);
    }
    @Test
    public void TestPlan(){
        getTextPlan();
    }
}
