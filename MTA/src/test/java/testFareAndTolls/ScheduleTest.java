package testFareAndTolls;

import org.openxmlformats.schemas.drawingml.x2006.main.STTextIndentLevelType;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Schedule;
import reporting.TestLogger;

public class ScheduleTest extends Schedule {
    Schedule fareAndTolls;
    @BeforeMethod
    public void init(){
        fareAndTolls=new Schedule(driver);
    }
    @Test
    public void testSchedule() throws InterruptedException {
        TestLogger.log("cliking on schedule",driver);
        clickOnSchedule();
        clickOnsubWay();
    }
    @Test
    public void testStatenIslands() throws InterruptedException {
        clickOnSchedule();
        clickOnImg();
        Assert.assertTrue(true);
    }

}
