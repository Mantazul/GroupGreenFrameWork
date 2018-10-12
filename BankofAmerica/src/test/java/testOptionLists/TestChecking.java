package testOptionLists;

import optionLists.Checking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestChecking extends Checking {
    @Test
    public void testCheking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Checking checking = PageFactory.initElements(driver, Checking.class);
        checking.selectCheking();
    }
    @Test
    public void testCoreCheking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Checking checking = PageFactory.initElements(driver, Checking.class);
        checking.selectCoreChecking();
    }
}
