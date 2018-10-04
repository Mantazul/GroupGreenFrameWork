package testHome;

import googleSheetsAPI.GoogleSheetPage;
import home.ByInputFromXls;
import home.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestByInputFromXls extends ByInputFromXls {
    GoogleSheetPage objGoogleSheetsPage;
    LogIn objLoginPage;
    ByInputFromXls objByInputFromXls;

   @BeforeMethod
    public void initialization(){
           objByInputFromXls = PageFactory.initElements(driver, ByInputFromXls.class);
           objLoginPage = PageFactory.initElements(driver, LogIn.class);
    }
    @Test
    public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {


        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       /* objOfHomePage.clikSignIn();
        sleepFor(3);
        objOfSignInPage.switchToSignInForm();
        sleepFor(3);
        String[] expectedItems = objByInput.getAssertData("DataFile.xls");
        String[] actualItems = objByInput.getVerificationValue("DataFile.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed");
        }
        System.out.println("signInWithInvalidIdAndPassword");
        //implicitWait(driver, 20);*/
    }


}
