package Transperancy;

import org.testng.Assert;
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
    @Test
    public void testTransperancyHover() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hoverTransperancy();
    }
    @Test
    public void testGetText() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String actual = getTitleFromCapitalProgram();
        Assert.assertEquals(actual, "Capital Program Dashboard");
    }

}
