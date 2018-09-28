package serviceStatusHomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TripsPlanner;

public class TestTripPlanner extends TripsPlanner {
    TripsPlanner tripsPlanner;
    @BeforeMethod
    public void init(){
        tripsPlanner=new TripsPlanner(driver);
    }
    @Test
    public void testTripsPlannerService(){
        clickOnserviceInArea();
    }
    @Test
    public void testForm(){
        fillOutForm("Ny","VA","12/12/18");
    }
    @Test
    public void testArrival(){
        arrival();
    }


}
