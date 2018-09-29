package testHome;

import home.HomePage;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestHome extends HomePage {

    @Test
    public void testHome(){
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkHomePage();
    }
    @Test
    public void testLanguage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        language.click();
    }
    @Test
    public void testLocationDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        locationDropdown();
    }
}
