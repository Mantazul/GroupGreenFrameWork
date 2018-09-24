package testDropDown;

import dropDown.Checking;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestChecking extends Checking {

    @Test
    public void testCheking(){
        Checking checking = PageFactory.initElements(driver, Checking.class);
        checking.selectCheking();
    }
    @Test
    public void testCoreCheking(){
        Checking checking = PageFactory.initElements(driver, Checking.class);
        checking.selectCoreChecking();
    }
}
