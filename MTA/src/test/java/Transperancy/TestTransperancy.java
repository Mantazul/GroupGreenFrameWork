package Transperancy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Transperancy;

public class TestTransperancy extends Transperancy {
    Transperancy transperancy;
    @BeforeMethod
    public void init(){
        transperancy=new Transperancy(driver);
    }
    @Test
    public void TestHovering() throws InterruptedException {
        TransperancyByCss();
    }

}
