package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TripsPlanner;
import reporting.TestLogger;

public class TestTripPlanner extends TripsPlanner {
    TripsPlanner tripsPlanner;
    @BeforeMethod
    public void init(){
        tripsPlanner=new TripsPlanner(driver);
    }
    @Test
    public void testTripsPlannerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnserviceInArea();
        Assert.assertTrue(true);
    }
    @Test
    public void testForm(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fillOutForm("Ny","VA","12/12/18");
        Assert.assertTrue(true);
    }
    @Test
    public void testArrival(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        arrival();
        Assert.assertTrue(true);
    }
    @Test
    public void testAdvance(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnAdvance();
        Assert.assertTrue(true);
    }
    @Test
    public void testTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actual=getAdvanceTitle();
        Assert.assertEquals(actual,"Advanced");
    }
    @Test
    public void testTripsTitle() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTripsPlannerTitle();
    }
    @Test
    public void testHoveringTripPlanner() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoveringTripPlanner();
    }
    @Test
    public void testSelectHoverItem() throws InterruptedException {
        selectHoveringItem();
    }


}
