
package testHome;

import home.PopUp;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PopUpWindowTest extends PopUp {

    @Test
    public void testPopUp  (){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToPopUp();
        popUpClick(driver);
    }
    @Test
    public void testPopUpWrite() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        goToPopUp();
        popUpWrite(driver);
    }
}

