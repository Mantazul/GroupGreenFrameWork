package Transperancy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Transperancy;
import reporting.TestLogger;

public class TestTransperancy extends Transperancy {
    Transperancy transperancy;
    @BeforeMethod
    public void init(){
        transperancy=new Transperancy(driver);
    }
    @Test
    public void TestHovering() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TransperancyByCss();

    }

}
