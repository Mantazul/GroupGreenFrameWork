
package testDataDriven;

import base.CommonAPI;
import home.LogIn;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import reporting.TestLogger;
import utility.DataReader;
import java.io.IOException;

public class TestByInputFromXls extends CommonAPI {
   DataReader dataReader = new DataReader();
   LogIn objLoginPage;

   @BeforeMethod
   public void initialization(){
      objLoginPage = PageFactory.initElements(driver, LogIn.class);

   }
   @Test
   public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
      TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      sleepFor(3);
      System.out.println("signInWithInvalidIdAndPassword");
   }
}

