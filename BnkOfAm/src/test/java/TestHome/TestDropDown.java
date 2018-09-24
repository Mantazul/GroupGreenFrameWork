package TestHome;

import home.DropDown;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropDown extends DropDown {

    @Test
    public void testDropDown() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        printDropDown();
    }
    @Test
    public void testSelectDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnDropdownMenu();
    }

}
