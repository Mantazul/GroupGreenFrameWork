package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SpecialServiceNotice;
import reporting.TestLogger;

public class TestSpecialServiceNotice extends SpecialServiceNotice {
    SpecialServiceNotice serviceNotice;
    @BeforeMethod
    public void init(){
      serviceNotice=new SpecialServiceNotice(driver);
    }
    @Test
    public void st238Test(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOn238St();
    }
    @Test
    public void iFrameTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        switchToFrame();
        Assert.assertTrue(true);
    }
    @Test
    public void imageSizeTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getImageInfo();
    }

}
