package testHome;

import home.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLogIn extends LogIn {

   @Test
    public void logIn(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //creating object using pageFactory
        LogIn login = PageFactory.initElements(driver, LogIn.class);
        login.enterUserName();
        login.enterPassword();
        login.clickSignIn();
    }
}
